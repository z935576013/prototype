package com.suning.vgs.lifesquare.autotool.excelcreator;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;

import com.suning.vgs.lifesquare.autotool.adapter.FormatAdapterIntf;
import com.suning.vgs.lifesquare.autotool.bean.AbstractBean;
import com.suning.vgs.lifesquare.autotool.bean.Column;
import com.suning.vgs.lifesquare.autotool.bean.Index;
import com.suning.vgs.lifesquare.autotool.bean.Keys;
import com.suning.vgs.lifesquare.autotool.bean.PhysicalDiagram;
import com.suning.vgs.lifesquare.autotool.bean.Table;
import com.suning.vgs.lifesquare.autotool.parser.ParserIntf;
import com.suning.vgs.lifesquare.autotool.util.CodeGenerator;
import com.suning.vgs.lifesquare.autotool.util.DTOBean;
import com.suning.vgs.lifesquare.autotool.util.DTOFieldBean;
import com.suning.vgs.lifesquare.autotool.util.DTOIndexBean;
import com.suning.vgs.lifesquare.autotool.util.DTOKeyBean;
import com.suning.vgs.lifesquare.autotool.util.DefaultDTOBuilder;
import com.suning.vgs.lifesquare.autotool.util.SupportedAttributes;
import com.suning.vgs.lifesquare.autotool.util.SupportedCellColors;

/**
 * 生成EXCEL功能的实际实现类，运用模板模式实现，配置信息在子类中提供
 * 
 * @author lsg
 * 
 */
public abstract class AbstractExcelCreator implements ExcelCreatorIntf {

    /**
     * 根据输出文件名的多少导出单个或多个EXCEL文件
     */
    @Override
    public void toExcel(ParserIntf parser) throws Exception {
        List<String> filePaths = getOutputFilePath();

        if (filePaths == null || filePaths.isEmpty()) {
            generateMultiFile(parser, filePaths);
            return;
        }

        if (filePaths.size() == 1) {
            generateSingleFile(parser, filePaths.get(0));
        } else {
            generateMultiFile(parser, filePaths);
        }
    }

    /**
     * 根据导出文件名输出单个EXCEL文件
     * 
     * @param parser
     * @param filePath
     * @throws Exception
     */
    private void generateSingleFile(ParserIntf parser, String filePath) throws Exception {
        List<PhysicalDiagram> diagrams = parser.getPyhsicalDiagrams();
        if (diagrams == null || diagrams.isEmpty()) {
            throw new Exception("pdm has no PyhsicalDiagrams Tag");
        }

        if (filePath == null) {
            throw new Exception("miss excel file name!");
        }

        generateOneFile(parser.getTables(), filePath, String.valueOf(new Date().getTime()));
    }

    /**
     * 输出多个Excel文件
     * 
     * @param parser
     * @param filePaths
     * @throws Exception
     */
    private void generateMultiFile(ParserIntf parser, List<String> filePaths) throws Exception {
        List<PhysicalDiagram> diagrams = parser.getPyhsicalDiagrams();
        if (diagrams == null || diagrams.isEmpty()) {
            throw new Exception("pdm has no PyhsicalDiagrams Tag");
        }

        if (filePaths == null || filePaths.isEmpty()) {
            filePaths = getDefaultFileName(diagrams);
        }

        if (filePaths.size() != diagrams.size()) {
            throw new Exception("FileName Num is not approriate");
        }

        String timestamp = String.valueOf(new Date().getTime());
        for (int i = 0; i < diagrams.size(); i++) {
            generateOneFile(diagrams.get(i).getTables(), filePaths.get(i), timestamp);
        }
    }

    /**
     * 将指定数据库表输出在一个EXCEL文件中
     * 
     * @param tables
     * @param filePath
     * @param timestamp
     * @throws Exception
     */
    private void generateOneFile(List<Table> tables, String filePath, String timestamp) throws Exception {
        // HSSFWorkbook hwb = new HSSFWorkbook();
        // if (oneSheetPerTable()) {
        // generateMultiSheet(tables, hwb);
        // } else {
        // generateOneSheet(tables, hwb);
        // }
        //
        // if (versionControl()) {
        // filePath = filePath.substring(0, filePath.length() - 4) + "_" + timestamp + ".xls";
        // }
        // OutputStream out = new FileOutputStream(filePath);
        // hwb.write(out);
        // out.close();
        //
        // File file = new File(filePath);
        // Map<String, DTOBean> beanMap = new ExcelParser().parseExcelFile(file, new DefaultDTOBuilder());

        List<DTOBean> dtos = new ArrayList<DTOBean>();
        for (Table table : tables) {

            DTOBean dto = table2DTO(table);
            ResourceBundle rb = ResourceBundle.getBundle("tableBlackList");
            String tbId = dto.getTblId();
            String blacklist = null;
            try {
                blacklist = rb.getString(tbId);
            } catch (Exception e) {
            }
            if (blacklist == null) {
                dtos.add(dto);
            }
        }
        String srcGenPath = "gen/";
//        String sqlGenPathDb2 = "gen/sqlMap/db2/";
        String sqlGenPathMysql = "gen/sqlMap/mysql/";
        String ddlGenPath = "gen/ddl/";
//        if (!new File(sqlGenPathDb2).exists()) {
//            new File(sqlGenPathDb2).mkdirs();
//        }
        if (!new File(ddlGenPath).exists()) {
            new File(ddlGenPath).mkdirs();
        }
        if (!new File(sqlGenPathMysql).exists()) {
            new File(sqlGenPathMysql).mkdirs();
        }
//        String sqlTemplateDb2 = "template/SQLMap_db2.vm";
        String sqlTemplateMysql = "template/SQLMap_mysql.vm";
//        String ddlTableTemplateDb2 = "template/DDL_table_db2.vm";
        String ddlTableTemplateMysql = "template/DDL_table_mysql.vm";
//        String ddlIndexTemplateDb2 = "template/DDL_index_db2.vm";
//        String ddlIndexTemplateMysql = "template/DDL_index_mysql.vm";
        String entityTemplate = "template/Entity.vm";
//        String beanTemplate = "template/Bean.vm";

//        CodeGenerator sqlMapGenDb2 = new CodeGenerator(sqlTemplateDb2, "UTF-8");
//        for (DTOBean dto : dtos) {
//            if (dto.getClassId().startsWith("TLs")) {
//                dto.setClassId(dto.getClassId().replaceAll("TLs", ""));
//            }
//            String sqlMapfileName = sqlGenPathDb2 + "sqlMap_" + dto.getClassId() + ".xml";
//            sqlMapGenDb2.execute("dto", dto, sqlMapfileName);
//        }

        CodeGenerator sqlMapGenMysql = new CodeGenerator(sqlTemplateMysql, "UTF-8");
        for (DTOBean dto : dtos) {
            if (dto.getClassId().startsWith("TLs")) {
                dto.setClassId(dto.getClassId().replaceAll("TLs", ""));
            }
            String sqlMapfileName = sqlGenPathMysql + "sqlMap_" + dto.getClassId() + ".xml";
            sqlMapGenMysql.execute("dto", dto, sqlMapfileName);
        }

//        CodeGenerator ddlGen = new CodeGenerator(ddlTableTemplateDb2, "UTF-8");
//        String ddlFileName = ddlGenPath + "table-ddl-db2.sql";
//        ddlGen.execute("dtos", dtos, ddlFileName);

        CodeGenerator ddlGen = new CodeGenerator(ddlTableTemplateMysql, "UTF-8");
        String ddlFileName = ddlGenPath + "table-ddl-mysql.sql";
        ddlGen.execute("dtos", dtos, ddlFileName);

//        CodeGenerator indexGen = new CodeGenerator(ddlIndexTemplateDb2, "UTF-8");
//        String ddlIndexFileName = ddlGenPath + "index-ddl-db2.sql";
//        indexGen.execute("dtos", dtos, ddlIndexFileName);
//
//        indexGen = new CodeGenerator(ddlIndexTemplateMysql, "UTF-8");
//        ddlIndexFileName = ddlGenPath + "index-ddl-mysql.sql";
//        indexGen.execute("dtos", dtos, ddlIndexFileName);

        CodeGenerator generator = new CodeGenerator(entityTemplate, "UTF-8");

        for (DTOBean dto : dtos) {
            String packageName = String.valueOf(dto.getNameSpace());
            String fileName = generator.createPackageDir(srcGenPath, packageName) + dto.getClassId() + ".java";
            generator.execute("dto", dto, fileName);
        }

//        generator = new CodeGenerator(beanTemplate, "UTF-8");
//
//        for (DTOBean dto : dtos) {
//            String packageName = String.valueOf(dto.getNameSpace());
//            String fileName = generator.createPackageDir(srcGenPath, packageName) + dto.getClassId() + "Bean.java";
//            generator.execute("dto", dto, fileName);
//        }

    }

    public DTOBean table2DTO(Table tables) {
        String nameSpace = "entity";
        DTOBean dTOBean = new DTOBean();
        dTOBean.setNameSpace(nameSpace);
        dTOBean.setTblId(tables.getCode());
        dTOBean.setTblName(tables.getName());
        if (tables.getPhysicalOptions() == null) {
            dTOBean.setPhysicalOptions("");
        } else {
            dTOBean.setPhysicalOptions(tables.getPhysicalOptions());
        }
        if (tables.getDesc() == null) {
            dTOBean.setTbDesc("");
        } else {
            dTOBean.setTbDesc(tables.getDesc());
        }

        for (Column column : tables.getColumns()) {
            DTOFieldBean field = new DTOFieldBean();
            if (column.getPhysicalOptions() != null) {
                field.setPhysicalOptions(column.getPhysicalOptions());
            } else {
                field.setPhysicalOptions("");
            }
            field.setIdentity(column.getIdentity());
            field.setColName(column.getName());
            field.setColId(column.getCode());
            field.setColDataType(column.getDataType());
            field.setColLength(column.getLength());
            if (column.getIsPrimary()) {
                field.setColPK("true");
            } else {
                field.setColPK("false");
            }
            field.setColNotNull(column.getMandatory());
            if (column.getDefaultValue() != null) {
                field.setColDefaultValue(column.getDefaultValue());
            } else {
                field.setColDefaultValue("");
            }
            if (column.getComment() != null) {
                field.setColComment(column.getComment());
            } else {
                field.setColComment("");
            }
            dTOBean.getFields().add(field);
        }

        if (tables.getKeys() != null) {
            for (Keys key : tables.getKeys()) {
                DTOKeyBean dTOKeyBean = new DTOKeyBean();
                dTOKeyBean.setKeyCode(key.getCode());
                if (key.getRefColumns() != null) {
                    for (Column column : key.getRefColumns()) {
                        dTOKeyBean.getColList().add(column.getCode());
                    }
                }
                dTOBean.getKeys().add(dTOKeyBean);
            }
        }
        if (tables.getIndexs() != null) {
            for (Index index : tables.getIndexs()) {
                DTOIndexBean dTOIndexBean = new DTOIndexBean();
                dTOIndexBean.setIndexCode(index.getCode());
                dTOIndexBean.setUnique(index.getUnique());

                if (index.getRefColumns() != null) {
                    for (Column column : index.getRefColumns()) {
                    	System.out.println(index.getCode());
                        dTOIndexBean.getColList().add(column.getCode());
                    }
                }
                dTOBean.getIndexs().add(dTOIndexBean);
            }
        }
        DefaultDTOBuilder builder = new DefaultDTOBuilder();
        builder.build(dTOBean);

        return dTOBean;
    }

    /**
     * 将指定数据库表分别生成sheet
     * 
     * @param tables
     * @param hwb
     * @throws Exception
     */
    private void generateMultiSheet(List<Table> tables, HSSFWorkbook hwb) throws Exception {
        if (tables != null) {
            for (Table table : tables) {
                HSSFSheet sheet = hwb.createSheet(table.getCode());
                int currentRowNum = processTitle(hwb, sheet);
                generateOneTable(hwb, sheet, table, currentRowNum);
            }
        }
    }

    /**
     * 将所有数据库表都生成在一个sheet中
     * 
     * @param tables
     * @param hwb
     * @throws Exception
     */
    private void generateOneSheet(List<Table> tables, HSSFWorkbook hwb) throws Exception {
        if (tables != null) {
            HSSFSheet sheet = hwb.createSheet("All_TABLES");
            int currentRowNum = processTitle(hwb, sheet);
            for (Table table : tables) {
                currentRowNum = generateOneTable(hwb, sheet, table, currentRowNum);
            }
        }
    }

    /**
     * 把指定数据库表元数据加入指定sheet中
     * 
     * @param hwb
     * @param sheet
     * @param table
     * @param currentRowNum
     * @return
     * @throws Exception
     */
    private int generateOneTable(HSSFWorkbook hwb, HSSFSheet sheet, Table table, int currentRowNum) throws Exception {
        FormatAdapterIntf adapter = getAdapter();

        for (Column col : table.getColumns()) {
            int colIndex = 0;
            HSSFRow currentRow = sheet.createRow(currentRowNum++);
            for (SupportedAttributes attr : getCreateColumns()) {
                HSSFCell cell = currentRow.createCell(colIndex);
                HSSFCellStyle style = getElementCellStyle(hwb, col);
                if (style != null) {
                    cell.setCellStyle(style);
                }
                if (SupportedAttributes.NAME.equals(attr)) {
                    cell.setCellValue(new HSSFRichTextString(adapter.retrieveColumnName(col.getName())));
                    colIndex++;
                } else if (SupportedAttributes.CODE.equals(attr)) {
                    cell.setCellValue(new HSSFRichTextString(adapter.retrieveColumnCode(col.getCode())));
                    colIndex++;
                } else if (SupportedAttributes.DATATYPE.equals(attr)) {
                    cell.setCellValue(new HSSFRichTextString(adapter.retrieveDataType(col.getDataType())));
                    colIndex++;
                } else if (SupportedAttributes.DEFAULTVALUE.equals(attr)) {
                    cell.setCellValue(new HSSFRichTextString(adapter.retrieveDefaultValue(col.getDefaultValue())));
                    colIndex++;
                } else if (SupportedAttributes.IDENTITY.equals(attr)) {
                    cell.setCellValue(new HSSFRichTextString(adapter.retrieveIdentity(col.getIdentity())));
                    colIndex++;
                } else if (SupportedAttributes.ISPRIMARY.equals(attr)) {
                    cell.setCellValue(new HSSFRichTextString(adapter.retrieveIsPrimary(col.getIsPrimary())));
                    colIndex++;
                } else if (SupportedAttributes.MANDATORY.equals(attr)) {
                    cell.setCellValue(new HSSFRichTextString(adapter.retrieveMandatory(col.getMandatory())));
                    colIndex++;
                } else if (SupportedAttributes.PRECISION.equals(attr)) {
                    cell.setCellValue(new HSSFRichTextString(adapter.retrievePrecision(col.getPrecision())));
                    colIndex++;
                } else if (SupportedAttributes.COMMENT.equals(attr)) {
                    cell.setCellValue(new HSSFRichTextString(adapter.retrieveColumnComment(col.getComment())));
                    colIndex++;
                } else if (SupportedAttributes.TABLENAME.equals(attr)) {
                    cell.setCellValue(new HSSFRichTextString(adapter.retrieveTableName((table.getName()))));
                    colIndex++;
                } else if (SupportedAttributes.TABLECODE.equals(attr)) {
                    cell.setCellValue(new HSSFRichTextString(adapter.retrieveTableCode((table.getCode()))));
                    colIndex++;
                } else if (SupportedAttributes.LENGTH.equals(attr)) {
                    cell.setCellValue(new HSSFRichTextString(adapter.retrieveLength(col.getLength())));
                    colIndex++;
                }
            }
        }

        return currentRowNum;
    }

    /**
     * 处理指定sheet中的标题显示
     * 
     * @param hwb
     * @param sheet
     * @return
     * @throws Exception
     */
    private int processTitle(HSSFWorkbook hwb, HSSFSheet sheet) throws Exception {
        int currentRow = 0;
        if (showTitle()) {
            HSSFRow headerRow = sheet.createRow(0);
            List<String> headers = getHeaders();
            if (headers == null || headers.isEmpty()) {
                headers = getDefaultHeaders();
            }
            HSSFFont font = hwb.createFont();
            /*
             * font.setColor(HSSFFont.COLOR_RED); font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD); font.setStrikeout(true);
             */
            HSSFCellStyle cellStyle = hwb.createCellStyle();
            cellStyle.setFont(font);

            for (int i = 0, size = headers.size(); i < size; i++) {
                HSSFCell cell = headerRow.createCell(i);
                cell.setCellStyle(cellStyle);
                cell.setCellValue(new HSSFRichTextString(headers.get(i)));
            }
            currentRow++;
        }
        return currentRow;
    }

    /**
     * 取PDM文件中的PyhsicalDiagram名称做为导出Excel文件名
     * 
     * @param diagrams
     * @return
     */
    private List<String> getDefaultFileName(List<PhysicalDiagram> diagrams) {
        List<String> fileNames = new ArrayList<String>();
        for (PhysicalDiagram diagram : diagrams) {
            fileNames.add(diagram.getName() + ".xls");
        }
        return fileNames;
    }

    /**
     * 取属性名做为标题名
     * 
     * @return
     */
    private List<String> getDefaultHeaders() {
        List<String> headers = new ArrayList<String>();
        for (SupportedAttributes attr : getCreateColumns()) {
            headers.add(attr.getValue());
        }
        return headers;
    }

    /**
     * 取得显示某元素的单元格样式（主要是根据元素是新建还是修改显示不同颜色）
     * 
     * @param hwb
     * @param bean
     * @return
     */
    private HSSFCellStyle getElementCellStyle(HSSFWorkbook hwb, AbstractBean bean) {
        if (!versionControl()) {
            return null;
        }
        if (getPreVersionTime() == 0) {
            return null;
        }
        if (bean == null || (bean.getCreateTimeStr() == null && bean.getModifyTimeStr() == null)) {
            return null;
        }
        if (bean.getCreateTimeStr() != null) {
            if (Long.valueOf(bean.getCreateTimeStr()) >= getPreVersionTime()) {
                HSSFCellStyle cellStyle = hwb.createCellStyle();
                cellStyle.setFillForegroundColor(getIndexedColor(getNewCreatedColor()));
                cellStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
                return cellStyle;
            }
        }
        if (bean.getModifyTimeStr() != null) {
            if (Long.valueOf(bean.getModifyTimeStr()) >= getPreVersionTime()) {
                HSSFCellStyle cellStyle = hwb.createCellStyle();
                cellStyle.setFillForegroundColor(getIndexedColor(getModifiedColor()));
                cellStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
                return cellStyle;
            }
        }
        return null;
    }

    /**
     * 根据设置的颜色值取得对应POI中的元素颜色值
     * 
     * @param color
     * @return
     */
    private short getIndexedColor(SupportedCellColors color) {
        if (color.equals(SupportedCellColors.AQUA)) {
            return IndexedColors.AQUA.getIndex();
        } else if (color.equals(SupportedCellColors.BLACK)) {
            return IndexedColors.BLACK.getIndex();
        } else if (color.equals(SupportedCellColors.BLUE)) {
            return IndexedColors.BLUE.getIndex();
        } else if (color.equals(SupportedCellColors.BLUE_GREY)) {
            return IndexedColors.BLUE_GREY.getIndex();
        } else if (color.equals(SupportedCellColors.BRIGHT_GREEN)) {
            return IndexedColors.BRIGHT_GREEN.getIndex();
        } else if (color.equals(SupportedCellColors.BROWN)) {
            return IndexedColors.BROWN.getIndex();
        } else if (color.equals(SupportedCellColors.CORAL)) {
            return IndexedColors.CORAL.getIndex();
        } else if (color.equals(SupportedCellColors.CORNFLOWER_BLUE)) {
            return IndexedColors.CORNFLOWER_BLUE.getIndex();
        } else if (color.equals(SupportedCellColors.DARK_BLUE)) {
            return IndexedColors.DARK_BLUE.getIndex();
        } else if (color.equals(SupportedCellColors.DARK_GREEN)) {
            return IndexedColors.DARK_GREEN.getIndex();
        } else if (color.equals(SupportedCellColors.DARK_RED)) {
            return IndexedColors.DARK_RED.getIndex();
        } else if (color.equals(SupportedCellColors.DARK_TEAL)) {
            return IndexedColors.DARK_TEAL.getIndex();
        } else if (color.equals(SupportedCellColors.DARK_YELLOW)) {
            return IndexedColors.DARK_YELLOW.getIndex();
        } else if (color.equals(SupportedCellColors.GOLD)) {
            return IndexedColors.GOLD.getIndex();
        } else if (color.equals(SupportedCellColors.GREEN)) {
            return IndexedColors.GREEN.getIndex();
        } else if (color.equals(SupportedCellColors.GREY_25_PERCENT)) {
            return IndexedColors.GREY_25_PERCENT.getIndex();
        } else if (color.equals(SupportedCellColors.GREY_40_PERCENT)) {
            return IndexedColors.GREY_40_PERCENT.getIndex();
        } else if (color.equals(SupportedCellColors.GREY_50_PERCENT)) {
            return IndexedColors.GREY_50_PERCENT.getIndex();
        } else if (color.equals(SupportedCellColors.GREY_80_PERCENT)) {
            return IndexedColors.GREY_80_PERCENT.getIndex();
        } else if (color.equals(SupportedCellColors.INDIGO)) {
            return IndexedColors.INDIGO.getIndex();
        } else if (color.equals(SupportedCellColors.LAVENDER)) {
            return IndexedColors.LAVENDER.getIndex();
        } else if (color.equals(SupportedCellColors.LEMON_CHIFFON)) {
            return IndexedColors.LEMON_CHIFFON.getIndex();
        } else if (color.equals(SupportedCellColors.LIGHT_BLUE)) {
            return IndexedColors.LIGHT_BLUE.getIndex();
        } else if (color.equals(SupportedCellColors.LIGHT_CORNFLOWER_BLUE)) {
            return IndexedColors.LIGHT_CORNFLOWER_BLUE.getIndex();
        } else if (color.equals(SupportedCellColors.LIGHT_GREEN)) {
            return IndexedColors.LIGHT_GREEN.getIndex();
        } else if (color.equals(SupportedCellColors.LIGHT_ORANGE)) {
            return IndexedColors.LIGHT_ORANGE.getIndex();
        } else if (color.equals(SupportedCellColors.LIGHT_TURQUOISE)) {
            return IndexedColors.LIGHT_TURQUOISE.getIndex();
        } else if (color.equals(SupportedCellColors.LIGHT_YELLOW)) {
            return IndexedColors.LIGHT_YELLOW.getIndex();
        } else if (color.equals(SupportedCellColors.LIME)) {
            return IndexedColors.LIME.getIndex();
        } else if (color.equals(SupportedCellColors.MAROON)) {
            return IndexedColors.MAROON.getIndex();
        } else if (color.equals(SupportedCellColors.OLIVE_GREEN)) {
            return IndexedColors.OLIVE_GREEN.getIndex();
        } else if (color.equals(SupportedCellColors.ORANGE)) {
            return IndexedColors.ORANGE.getIndex();
        } else if (color.equals(SupportedCellColors.ORCHID)) {
            return IndexedColors.ORCHID.getIndex();
        } else if (color.equals(SupportedCellColors.PALE_BLUE)) {
            return IndexedColors.PALE_BLUE.getIndex();
        } else if (color.equals(SupportedCellColors.PINK)) {
            return IndexedColors.PINK.getIndex();
        } else if (color.equals(SupportedCellColors.PLUM)) {
            return IndexedColors.PLUM.getIndex();
        } else if (color.equals(SupportedCellColors.RED)) {
            return IndexedColors.RED.getIndex();
        } else if (color.equals(SupportedCellColors.ROSE)) {
            return IndexedColors.ROSE.getIndex();
        } else if (color.equals(SupportedCellColors.ROYAL_BLUE)) {
            return IndexedColors.ROYAL_BLUE.getIndex();
        } else if (color.equals(SupportedCellColors.SEA_GREEN)) {
            return IndexedColors.SEA_GREEN.getIndex();
        } else if (color.equals(SupportedCellColors.SKY_BLUE)) {
            return IndexedColors.SKY_BLUE.getIndex();
        } else if (color.equals(SupportedCellColors.TAN)) {
            return IndexedColors.TAN.getIndex();
        } else if (color.equals(SupportedCellColors.TEAL)) {
            return IndexedColors.TEAL.getIndex();
        } else if (color.equals(SupportedCellColors.TURQUOISE)) {
            return IndexedColors.TURQUOISE.getIndex();
        } else if (color.equals(SupportedCellColors.VIOLET)) {
            return IndexedColors.VIOLET.getIndex();
        } else if (color.equals(SupportedCellColors.WHITE)) {
            return IndexedColors.WHITE.getIndex();
        } else if (color.equals(SupportedCellColors.YELLOW)) {
            return IndexedColors.YELLOW.getIndex();
        }

        return IndexedColors.WHITE.getIndex();
    }

}

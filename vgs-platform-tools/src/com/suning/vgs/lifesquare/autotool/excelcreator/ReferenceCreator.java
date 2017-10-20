package com.suning.vgs.lifesquare.autotool.excelcreator;

import java.util.ArrayList;
import java.util.List;

import com.suning.vgs.lifesquare.autotool.adapter.Db2Adapter;
import com.suning.vgs.lifesquare.autotool.adapter.FormatAdapterIntf;
import com.suning.vgs.lifesquare.autotool.util.SupportedAttributes;
import com.suning.vgs.lifesquare.autotool.util.SupportedCellColors;

/**
 * 实际导出EXCEL的参考实现，主要是处理各个配置参数值
 * @author lsg
 *
 */
public class ReferenceCreator extends AbstractExcelCreator implements ExcelCreatorIntf {
    
    private long preVersionTime;
    private List<String> headers;
    private boolean isShowTitle;
    private boolean isOneSheetPerTable;
    private boolean isVersionControl;
    private List<String> outputPaths;
    private List<SupportedAttributes> createColumns;
    private SupportedCellColors newCreatedColor = SupportedCellColors.RED;
    private SupportedCellColors modifiedColor = SupportedCellColors.YELLOW;

    @Override
    public List<SupportedAttributes> getCreateColumns() {
        /*List<SupportedAttributes> columns = new ArrayList<SupportedAttributes>();
        columns.add(SupportedAttributes.TABLENAME);
        columns.add(SupportedAttributes.TABLECODE);
        columns.add(SupportedAttributes.NAME);
        columns.add(SupportedAttributes.CODE);
        columns.add(SupportedAttributes.DATATYPE);
        columns.add(SupportedAttributes.MANDATORY);
        columns.add(SupportedAttributes.DEFAULTVALUE);
        columns.add(SupportedAttributes.IDENTITY);
        columns.add(SupportedAttributes.ISPRIMARY);
        columns.add(SupportedAttributes.COMMENT);
        
        return columns;*/
        
        return this.createColumns;
    }
    
    public void addCreateColumns(String columnName){
        SupportedAttributes sa = null;
        if ("columnName".equals(columnName)){
            sa = SupportedAttributes.NAME;
        }else if ("columnCode".equals(columnName)){
            sa = SupportedAttributes.CODE;
        }else if ("dataType".equals(columnName)){
            sa = SupportedAttributes.DATATYPE;
        }else if ("mandatory".equals(columnName)){
            sa = SupportedAttributes.MANDATORY;
        }else if ("defaultValue".equals(columnName)){
            sa = SupportedAttributes.DEFAULTVALUE;
        }else if ("identity".equals(columnName)){
            sa = SupportedAttributes.IDENTITY;
        }else if ("isPrimary".equals(columnName)){
            sa = SupportedAttributes.ISPRIMARY;
        }else if ("comment".equals(columnName)){
            sa = SupportedAttributes.COMMENT;
        }else if ("tableName".equals(columnName)){
            sa = SupportedAttributes.TABLENAME;
        }else if ("tableCode".equals(columnName)){
            sa = SupportedAttributes.TABLECODE;
        }else if ("precision".equals(columnName)){
            sa = SupportedAttributes.PRECISION;
        }else if ("length".equals(columnName)){
            sa = SupportedAttributes.LENGTH;
        }
        
        if (sa != null){
            if (createColumns == null){
                createColumns = new ArrayList<SupportedAttributes>();
            }
            createColumns.add(sa);
        }
    }

    @Override
    public FormatAdapterIntf getAdapter() {     
        return new Db2Adapter();
    }

    @Override
    public List<String> getHeaders() {      
        return this.headers;
    }
    
    public void addHeader(String header){
        if (headers == null){
            headers = new ArrayList<String>();
        }
        
        headers.add(header);
    }

    @Override
    public boolean showTitle() {        
        return this.isShowTitle;
    }
    
    public void setShowTitle(boolean showTitle){
        this.isShowTitle = showTitle;
    }

    @Override
    public boolean oneSheetPerTable() {     
        return this.isOneSheetPerTable;
    }
    
    public void setOneSheetPerTable(boolean oneSheetPerTable){
        this.isOneSheetPerTable = oneSheetPerTable;
    }

    @Override
    public List<String> getOutputFilePath() {
        
        return this.outputPaths;
    }
    
    public void addOutputFilePath(String filePath){
        if (outputPaths == null){
            outputPaths = new ArrayList<String>();
        }
        
        outputPaths.add(filePath);
    }   

    @Override
    public boolean versionControl() {
        
        return this.isVersionControl;
    }
    
    public void setVersionControl(boolean versionControl){
        this.isVersionControl = versionControl;
    }
    
    public void setNewCreatedColor(String colorName){
        if (colorName == null){
            return;
        }
        if (colorName.equals("red")){
            this.newCreatedColor = SupportedCellColors.RED;
        }else if (colorName.equals("blue")){
            this.newCreatedColor = SupportedCellColors.BLUE;
        }else if (colorName.equals("green")){
            this.newCreatedColor = SupportedCellColors.GREEN;
        }else if (colorName.equals("yellow")){
            this.newCreatedColor = SupportedCellColors.YELLOW;
        }
    }
    
    

    @Override
    public SupportedCellColors getNewCreatedColor() {       
        return this.newCreatedColor;
    }
    
    public void setModifiedCreatedColor(String colorName){
        if (colorName == null){
            return;
        }
        if (colorName.equals("red")){
            this.modifiedColor = SupportedCellColors.RED;
        }else if (colorName.equals("blue")){
            this.modifiedColor = SupportedCellColors.BLUE;
        }else if (colorName.equals("green")){
            this.modifiedColor = SupportedCellColors.GREEN;
        }else if (colorName.equals("yellow")){
            this.modifiedColor = SupportedCellColors.YELLOW;
        }
    }

    @Override
    public SupportedCellColors getModifiedColor() {
        return this.modifiedColor;
    }

    @Override
    public long getPreVersionTime() {       
        return this.preVersionTime;
    }

    
    public void setPreVersionTime(long time) {
        this.preVersionTime = time;     
    }
    
}

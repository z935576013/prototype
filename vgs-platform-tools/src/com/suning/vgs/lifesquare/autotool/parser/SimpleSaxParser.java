package com.suning.vgs.lifesquare.autotool.parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.suning.vgs.lifesquare.autotool.bean.Column;
import com.suning.vgs.lifesquare.autotool.bean.Index;
import com.suning.vgs.lifesquare.autotool.bean.Keys;
import com.suning.vgs.lifesquare.autotool.bean.PhysicalDiagram;
import com.suning.vgs.lifesquare.autotool.bean.Table;

/**
 * 解析指定pdm(xml)文件，组装到各个bean中
 * 
 * @author lsg
 * 
 */
public class SimpleSaxParser extends DefaultHandler implements ParserIntf {
    private List<Table> tables = null;
    private Table table = null;
    private List<Column> columns = null;
    private Column column = null;
    private String scope = "";
    private List<Column> keyColumns = null;
    private Keys key = null;
    private List<Keys> keys = null;
    private List<Column> indexColumns = null;
    private Index index = null;
    private List<Index> indexs = null;
    private PhysicalDiagram diagram = null;
    private List<PhysicalDiagram> diagrams = null;
    private List<Table> diagramTables = null;

    @Override
    public void startDocument() throws SAXException {
        /**
         * 初始化列表
         */
        this.tables = new ArrayList<Table>();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        /**
         * 维护scope
         */
        int loc = qName.lastIndexOf(":") + 1;
        if (loc != -1) {
            scope = scope + "-" + qName.substring(loc);
        } else {
            scope = scope + "-" + qName;
        }

        /**
         * table结构开始
         */
        if ("o:Table".equals(qName) && "-Model-RootObject-Children-Model-Tables-Table".equals(scope)) {
            if (table == null) {
                table = new Table();
                table.setId(attributes.getValue(0));
            }
        }

        /**
         * columns结构开始
         */
        if ("c:Columns".equals(qName) && "-Model-RootObject-Children-Model-Tables-Table-Columns".equals(scope)) {
            if (columns == null) {
                columns = new ArrayList<Column>();
            }
        }

        /**
         * column结构开始
         */
        if ("o:Column".equals(qName) && "-Model-RootObject-Children-Model-Tables-Table-Columns-Column".equals(scope)) {
            if (column == null) {
                column = new Column();
                column.setId(attributes.getValue(0));
            }
        }
        /**
         * keys结构开始
         */
        if ("c:Keys".equals(qName) && "-Model-RootObject-Children-Model-Tables-Table-Keys".equals(scope)) {
            if (keys == null) {
                keys = new ArrayList<Keys>();
            }
        }
        /**
         * key结构开始
         */
        if ("o:Key".equals(qName) && "-Model-RootObject-Children-Model-Tables-Table-Keys-Key".equals(scope)) {
            if (key == null) {
                key = new Keys();
                key.setId(attributes.getValue(0));
                keyColumns = new ArrayList<Column>();
            }
        }

        /**
         * key.column结构开始
         */
        if ("o:Column".equals(qName)
                && "-Model-RootObject-Children-Model-Tables-Table-Keys-Key-Key.Columns-Column".equals(scope)) {
            if (attributes.getValue(0) != null) {
                keyColumns.add(getColumnById(table.getColumns(), attributes.getValue(0)));
            }
        }
        /**
         * primarykey.key结构开始k
         */
        if ("o:Key".equals(qName) && "-Model-RootObject-Children-Model-Tables-Table-PrimaryKey-Key".equals(scope)) {
            if (attributes.getValue(0) != null) {
                setColumnPrimary(table, attributes.getValue(0));
            }
        }

        /**
         * index结构开始
         */
        if ("c:Indexes".equals(qName) && "-Model-RootObject-Children-Model-Tables-Table-Indexes".equals(scope)) {
            if (indexs == null) {
                indexs = new ArrayList<Index>();
            }
        }
        /**
         * index结构开始
         */
        if ("o:Index".equals(qName) && "-Model-RootObject-Children-Model-Tables-Table-Indexes-Index".equals(scope)) {
            if (index == null) {
                index = new Index();
                index.setId(attributes.getValue(0));
                indexColumns = new ArrayList<Column>();
            }
        }

        /**
         * index.IndexColumn结构开始
         */
        if ("o:Column".equals(qName)
                && "-Model-RootObject-Children-Model-Tables-Table-Indexes-Index-IndexColumns-IndexColumn-Column-Column"
                        .equals(scope)) {
            if (attributes.getValue(0) != null) {
                indexColumns.add(getColumnById(table.getColumns(), attributes.getValue(0)));
            }
        }

        /**
         * physicaldiagram结构开始
         */
        if ("o:PhysicalDiagram".equals(qName)
                && "-Model-RootObject-Children-Model-PhysicalDiagrams-PhysicalDiagram".equals(scope)) {
            if (diagram == null) {
                diagram = new PhysicalDiagram();
                diagram.setId(attributes.getValue(0));
                diagramTables = new ArrayList<Table>();
            }
        }

        if ("o:Table".equals(qName)
                && "-Model-RootObject-Children-Model-PhysicalDiagrams-PhysicalDiagram-Symbols-TableSymbol-Object-Table"
                        .equals(scope)) {
            if (diagramTables != null) {
                Table tmpTable = new Table();
                tmpTable.setId(attributes.getValue(0));
                diagramTables.add(tmpTable);
            }
        }

        if ("c:PhysicalDiagrams".equals(qName) && "-Model-RootObject-Children-Model-PhysicalDiagrams".equals(scope)) {
            if (this.diagrams == null) {
                this.diagrams = new ArrayList<PhysicalDiagram>();
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        /**
         * 维护scope
         */
        int loc = qName.lastIndexOf(":") + 1;
        if (loc != -1) {
            scope = scope.substring(0, scope.length() - qName.substring(loc).length() - 1);
        } else {
            scope = scope.substring(0, scope.length() - qName.length() - 1);
        }

        /**
         * table结束
         */
        if ("o:Table".equals(qName) && "-Model-RootObject-Children-Model-Tables".equals(scope)) {
            if (table != null) {
                tables.add(table);
                replaceTempTableInDiagram(table);
                table = null;
            }
        }
        /**
         * columns结束
         */
        if ("c:Columns".equals(qName) && "-Model-RootObject-Children-Model-Tables-Table".equals(scope)) {
            if (columns != null && columns.size() >= 0) {
                table.setColumns(columns);
            }
            columns = null;
        }
        /**
         * column结束
         */
        if ("o:Column".equals(qName) && "-Model-RootObject-Children-Model-Tables-Table-Columns".equals(scope)) {
            if (column != null) {
                String code = column.getCode();
                if (!code.equalsIgnoreCase("CREATOR") && !code.equalsIgnoreCase("CREATE_DTTM")
                        && !code.equalsIgnoreCase("UPDATER") && !code.equalsIgnoreCase("UPDATE_DTTM")) {
                    columns.add(column);
                }
            }
            column = null;
        }

        if ("c:Key.Columns".equals(qName) && "-Model-RootObject-Children-Model-Tables-Table-Keys-Key".equals(scope)) {
            if (keyColumns != null) {
                key.setRefColumns(keyColumns);
            }
            keyColumns = null;
        }
        if ("o:Key".equals(qName) && "-Model-RootObject-Children-Model-Tables-Table-Keys".equals(scope)) {
            if (key != null) {
                keys.add(key);
            }
            key = null;
        }
        if ("c:Keys".equals(qName) && "-Model-RootObject-Children-Model-Tables-Table".equals(scope)) {
            if (keys != null) {
                table.setKeys(keys);
            }
            keys = null;
        }

        if ("c:IndexColumns".equals(qName)
                && "-Model-RootObject-Children-Model-Tables-Table-Indexes-Index".equals(scope)) {
            if (indexColumns != null) {
                index.setRefColumns(indexColumns);
            }
            indexColumns = null;
        }
        if ("o:Index".equals(qName) && "-Model-RootObject-Children-Model-Tables-Table-Indexes".equals(scope)) {
            if (index != null) {
                indexs.add(index);
            }
            index = null;
        }
        if ("c:Indexes".equals(qName) && "-Model-RootObject-Children-Model-Tables-Table".equals(scope)) {
            if (indexs != null) {
                table.setIndexs(indexs);
            }
            indexs = null;
        }

        if ("o:PhysicalDiagram".equals(qName) && "-Model-RootObject-Children-Model-PhysicalDiagrams".equals(scope)) {
            if (diagram != null) {
                diagrams.add(diagram);
            }
            diagram = null;
        }
        if ("c:Symbols".equals(qName)
                && "-Model-RootObject-Children-Model-PhysicalDiagrams-PhysicalDiagram".equals(scope)) {
            if (diagramTables != null) {
                diagram.setTables(diagramTables);
                diagramTables = null;
            }
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if ("-Model-RootObject-Children-Model-Tables-Table-Name".equals(scope)) {
            table.setName(new String(ch, start, length));
        }
        if ("-Model-RootObject-Children-Model-Tables-Table-Code".equals(scope)) {
            String p = table.getCode();
            if (p == null) {
                table.setCode(new String(ch, start, length));
            } else {
                p = p + new String(ch, start, length);
                table.setCode(p);
            }
        }
        if ("-Model-RootObject-Children-Model-Tables-Table-Comment".equals(scope)) {
            table.setDesc(new String(ch, start, length));
        }
        if ("-Model-RootObject-Children-Model-Tables-Table-PhysicalOptions".equals(scope)) {
            String p = table.getPhysicalOptions();
            if (p == null) {
                table.setPhysicalOptions(new String(ch, start, length));
            } else {
                p = p + new String(ch, start, length);
                table.setPhysicalOptions(p);
            }
        }
        if ("-Model-RootObject-Children-Model-Tables-Table-Columns-Column-Name".equals(scope)) {
            column.setName(new String(ch, start, length));
        }
        if ("-Model-RootObject-Children-Model-Tables-Table-Columns-Column-Code".equals(scope)) {
            String p = column.getCode();
            if (p == null) {
                column.setCode(new String(ch, start, length));
            } else {
                p = p + new String(ch, start, length);
                column.setCode(p);
            }
        }
        if ("-Model-RootObject-Children-Model-Tables-Table-Columns-Column-DataType".equals(scope)) {
            String p = column.getDataType();
            if (p == null) {
                column.setDataType(new String(ch, start, length));
            } else {
                p = p + new String(ch, start, length);
                column.setDataType(p);
            }
        }
        if ("-Model-RootObject-Children-Model-Tables-Table-Columns-Column-Length".equals(scope)) {
            column.setLength(new String(ch, start, length));
        }
        if ("-Model-RootObject-Children-Model-Tables-Table-Columns-Column-Precision".equals(scope)) {
            column.setPrecision(new String(ch, start, length));
        }
        if ("-Model-RootObject-Children-Model-Tables-Table-Columns-Column-Mandatory".equals(scope)) {
            column.setMandatory(new String(ch, start, length));
        }
        if ("-Model-RootObject-Children-Model-Tables-Table-Columns-Column-DefaultValue".equals(scope)) {
            column.setDefaultValue(new String(ch, start, length));
        }
        if ("-Model-RootObject-Children-Model-Tables-Table-Columns-Column-Identity".equals(scope)) {
            column.setIdentity(new String(ch, start, length));
        }
        if ("-Model-RootObject-Children-Model-Tables-Table-Columns-Column-Comment".equals(scope)) {
            column.setComment(new String(ch, start, length));
        }
        if ("-Model-RootObject-Children-Model-Tables-Table-Columns-Column-PhysicalOptions".equals(scope)) {
            String p = column.getPhysicalOptions();
            if (p == null) {
                column.setPhysicalOptions(new String(ch, start, length));
            } else {
                p = p + new String(ch, start, length);
                column.setPhysicalOptions(p);
            }
        }
        if ("-Model-RootObject-Children-Model-Tables-Table-CreationDate".equals(scope)) {
            table.setCreateTimeStr(new String(ch, start, length) + "000");
        }
        if ("-Model-RootObject-Children-Model-Tables-Table-ModificationDate".equals(scope)) {
            table.setModifyTimeStr(new String(ch, start, length) + "000");
        }
        if ("-Model-RootObject-Children-Model-Tables-Table-Columns-Column-CreationDate".equals(scope)) {
            column.setCreateTimeStr((new String(ch, start, length)) + "000");
        }
        if ("-Model-RootObject-Children-Model-Tables-Table-Columns-Column-ModificationDate".equals(scope)) {
            column.setModifyTimeStr((new String(ch, start, length)) + "000");
        }
        if ("-Model-RootObject-Children-Model-PhysicalDiagrams-PhysicalDiagram-Name".equals(scope)) {
            diagram.setName(new String(ch, start, length));
        }
        if ("-Model-RootObject-Children-Model-Tables-Table-Keys-Key-Code".equals(scope)) {
            key.setCode("P_" + new String(ch, start, length));
        }
        if ("-Model-RootObject-Children-Model-Tables-Table-Indexes-Index-Code".equals(scope)) {
            index.setCode(new String(ch, start, length));
        }
        if ("-Model-RootObject-Children-Model-Tables-Table-Indexes-Index-Unique".equals(scope)) {
            index.setUnique(new String(ch, start, length));
        }

    }

    public List<Table> getTables() {
        return this.tables;
    }

    public ParserIntf process(String filePath) throws Exception {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        File file = new File(filePath);
        if (!file.exists()) {
            throw new Exception("pdm File not exist!");
        }
        FileInputStream is = new FileInputStream(filePath);
        parser.parse(is, this);
        return this;
    }

    /**
     * 既得column列表中指定ID的column
     * 
     * @param columns
     * @param colId
     * @return
     */
    private Column getColumnById(List<Column> columns, String colId) {
        if (colId == null) {
            return null;
        }
        if (columns == null || columns.isEmpty()) {
            return null;
        }
        for (Column col : columns) {
            if (colId.equals(col.getId())) {
                return col;
            }
        }
        return null;
    }

    /**
     * 指定table表中指定key对应列是主键列
     * 
     * @param table
     * @param keyId
     */
    private void setColumnPrimary(Table table, String keyId) {
        if (keyId == null) {
            return;
        }
        if (table == null || table.getKeys() == null || table.getKeys().isEmpty() || table.getColumns() == null
                || table.getColumns().isEmpty()) {
            return;
        }
        for (Keys key : table.getKeys()) {
            if (keyId.equals(key.getId()) && key.getRefColumns() != null) {
                for (Column col : key.getRefColumns()) {
                    col.setIsPrimary(Boolean.TRUE);
                }
            }
        }
    }

    private void replaceTempTableInDiagram(Table table) {
        if (this.diagrams == null) {
            return;
        }

        if (table == null || table.getId() == null) {
            return;
        }

        for (PhysicalDiagram diagram : this.diagrams) {
            for (Table tab : diagram.getTables()) {
                if (table.getId().equals(tab.getId())) {
                    tab.setCode(table.getCode());
                    tab.setColumns(table.getColumns());
                    tab.setCreateTimeStr(table.getCreateTimeStr());
                    tab.setKeys(table.getKeys());
                    tab.setIndexs(table.getIndexs());
                    tab.setModifyTimeStr(table.getModifyTimeStr());
                    tab.setName(table.getName());
                }
            }
        }
    }

    @Override
    public ParserIntf process(InputStream pdmFileStream) throws Exception {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        parser.parse(pdmFileStream, this);
        return this;
    }

    @Override
    public List<PhysicalDiagram> getPyhsicalDiagrams() {
        return this.diagrams;
    }

}

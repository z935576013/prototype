package com.suning.vgs.lifesquare.autotool.bean;

import java.util.List;

public class Table extends AbstractBean {

    /**
	 * 
	 */
    private static final long serialVersionUID = 1538199467813130606L;
    private String name;
    private String code;
    private List<Column> columns;
    private List<Keys> keys;
    private List<Index> indexs;
    private String desc;
    private String physicalOptions;

    public List<Index> getIndexs() {
        return indexs;
    }

    public void setIndexs(List<Index> indexs) {
        this.indexs = indexs;
    }

    public List<Keys> getKeys() {
        return keys;
    }

    public void setKeys(List<Keys> keys) {
        this.keys = keys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the physicalOptions
     */
    public String getPhysicalOptions() {
        return physicalOptions;
    }

    /**
     * @param physicalOptions the physicalOptions to set
     */
    public void setPhysicalOptions(String physicalOptions) {
        this.physicalOptions = physicalOptions;
    }
    
}

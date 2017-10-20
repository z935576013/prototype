package com.suning.vgs.lifesquare.autotool.util;

public enum SupportedAttributes {
    NAME("name","列名"),
    CODE("code","列码"),
    DATATYPE("dataType","类型"),
    MANDATORY("mandatory","必填"),
    DEFAULTVALUE("defaultValue","默认值"),
    IDENTITY("identity","自增"),
    PRECISION("precision","精度"),
    ISPRIMARY("isPrimary","主键"),
    COMMENT("comment","注释"),
    LENGTH("length","长度"),
    TABLENAME("tableName","表名"),
    TABLECODE("tableCode","表码");
    
    private String key;
    private String value;
    
    private SupportedAttributes(String key,String value){
        this.key=key;
        this.value=value;
    }
    
    
    
    public String getKey() {
        return key;
    }



    public void setKey(String key) {
        this.key = key;
    }



    public String getValue() {
        return value;
    }



    public void setValue(String value) {
        this.value = value;
    }



    
    public boolean equals(SupportedAttributes target){
        return (this.getKey().equals(target.getKey()));
    }
}

package com.suning.vgs.lifesquare.autotool.adapter;

/**
 * 具体属性的转换器，比如PDM文件里解析出字段类型是varchar(400)，但是在EXCEL中只需显示varchar，可以实现此接口 
 * <br/>注：如果不知道PDM文件解析出的属性是什么样的，可以先不用Adapter生成一个示例EXCEL文件，然后针对哪些显示需要修改再写相应的Adapter
 * @author lsg
 *
 */
public interface FormatAdapterIntf {
    /**
     * "数据类型”显示值
     * @param sourceDataType
     * @return
     */
    String retrieveDataType(String sourceDataType);
    
    /**
     * “字段长度”显示值
     * @param sourceLength
     * @return
     */
    String retrieveLength(String sourceLength);
    
    /**
     * “是否必填”显示值
     * @param sourceMandatory
     * @return
     */
    String retrieveMandatory(String sourceMandatory);
    
    /**
     * “默认值”显示值
     * @param sourceDefaultValue
     * @return
     */
    String retrieveDefaultValue(String sourceDefaultValue);
    
    /**
     * “是否自增”显示值
     * @param sourceIdentiry
     * @return
     */
    String retrieveIdentity(String sourceIdentiry);
    
    /**
     * "字段名“显示值
     * @param sourceColumnName
     * @return
     */
    String retrieveColumnName(String sourceColumnName);
    
    /**
     * “字段代码”显示值
     * @param sourceColumnCode
     * @return
     */
    String retrieveColumnCode(String sourceColumnCode);
    
    /**
     * “精度”显示值
     * @param sourcePrecision
     * @return
     */
    String retrievePrecision(String sourcePrecision);
    
    /**
     * “字段注释”显示值
     * @param sourceColumnComment
     * @return
     */
    String retrieveColumnComment(String sourceColumnComment);
    
    /**
     * “表名”显示值
     * @param sourceTableName
     * @return
     */
    String retrieveTableName(String sourceTableName);
    
    /**
     * "表代码“显示值
     * @param sourceTableCode
     * @return
     */
    String retrieveTableCode(String sourceTableCode);
    
    /**
     * “是否主键”显示值
     * @param sourceIsPrimary
     * @return
     */
    String retrieveIsPrimary(Boolean sourceIsPrimary);  
}

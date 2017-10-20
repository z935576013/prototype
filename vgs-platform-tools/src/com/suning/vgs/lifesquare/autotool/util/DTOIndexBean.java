package com.suning.vgs.lifesquare.autotool.util;

import java.util.ArrayList;
import java.util.List;


/**
 * DTOIndexBean
 */
public class DTOIndexBean {
    String indexCode;
    String unique;
    List<String> colList=new ArrayList<String>();
    /**
     * @return the indexCode
     */
    public String getIndexCode() {
        return indexCode;
    }
    /**
     * @param indexCode the indexCode to set
     */
    public void setIndexCode(String indexCode) {
        this.indexCode = indexCode;
    }
    /**
     * @return the unique
     */
    public String getUnique() {
        return unique;
    }
    /**
     * @param unique the unique to set
     */
    public void setUnique(String unique) {
        this.unique = unique;
    }
    /**
     * @return the colList
     */
    public List<String> getColList() {
        return colList;
    }
    /**
     * @param colList the colList to set
     */
    public void setColList(List<String> colList) {
        this.colList = colList;
    }
    
    

}

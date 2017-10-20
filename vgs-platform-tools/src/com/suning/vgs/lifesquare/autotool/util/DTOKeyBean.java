package com.suning.vgs.lifesquare.autotool.util;

import java.util.ArrayList;
import java.util.List;


/**
 * DTOKeyBean
 */
public class DTOKeyBean {
    String keyCode;
    List<String> colList=new ArrayList<String>();
    /**
     * @return the keyCode
     */
    public String getKeyCode() {
        return keyCode;
    }
    /**
     * @param keyCode the keyCode to set
     */
    public void setKeyCode(String keyCode) {
        this.keyCode = keyCode;
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

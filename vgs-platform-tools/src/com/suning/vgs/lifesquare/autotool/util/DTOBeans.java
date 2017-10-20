package com.suning.vgs.lifesquare.autotool.util;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * DTOBeans
 */
public class DTOBeans {
    /**
     * Excel Data Container
     */
    Map<String, DTOBean> sheets = new LinkedHashMap<String, DTOBean>();

   /**
     * @param sheet the sheet to add
     */
    public void addSheet(String name, DTOBean sheet) {
        this.sheets.put(name, sheet);
    }
    /**
     * @return the sheets
     */
    public Map<String, DTOBean> getSheets() {
        return sheets;
    }
}

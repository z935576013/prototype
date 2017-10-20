package com.suning.vgs.lifesquare.autotool.util;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * DTOBeans
 */
public class ServiceBeans {
    /**
     * Excel Data Container
     */
    Map<String, ServiceBean> sheets = new LinkedHashMap<String, ServiceBean>();

   /**
     * @param sheet the sheet to add
     */
    public void addSheet(String name, ServiceBean sheet) {
        this.sheets.put(name, sheet);
    }
    /**
     * @return the sheets
     */
    public Map<String, ServiceBean> getSheets() {
        return sheets;
    }
}

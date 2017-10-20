package com.suning.vgs.lifesquare.autotool.util;


/**
 * DTOBean
 */
public class DefaultCacheKeyBuilder implements Builder {
    /**
     * build
     */
    @Override
    public void build(Bean bean) {
    }

    /**
     * isPK
     * 
     * @param field
     * @return
     */
    protected boolean isPK(DTOFieldBean field) {
        if ("YES".equalsIgnoreCase(field.getColPK().trim()) || "true".equalsIgnoreCase(field.getColPK().trim())
                || "Y".equalsIgnoreCase(field.getColPK().trim()) || "○".equalsIgnoreCase(field.getColPK().trim())) {
            return true;
        }
        return false;
    }

    /**
     * dbName2JavaName
     * 
     * @param name
     * @return
     */
    protected String dbName2JavaName(String name) {
        if (!name.contains("_")) {
            return capFirstChar(name.toLowerCase());
        }
        String[] nameSplit = name.split("_");
        StringBuilder builder = new StringBuilder(capFirstChar(nameSplit[0].toLowerCase()));
        for (int i = 1; i < nameSplit.length; i++) {
            builder.append(capFirstChar(nameSplit[i].toLowerCase()));
        }
        return builder.toString();
    }

    /**
     * capFirstChar
     * 
     * @param name
     * @return
     */
    public String capFirstChar(String name) {
        return String.valueOf(name.charAt(0)).toUpperCase() + name.substring(1);
    }

    /**
     * lowFirstChar
     * 
     * @param name
     * @return
     */
    public String lowFirstChar(String name) {
        return String.valueOf(name.charAt(0)).toLowerCase() + name.substring(1);
    }
}

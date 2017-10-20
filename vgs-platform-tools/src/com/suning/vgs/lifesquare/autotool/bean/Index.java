package com.suning.vgs.lifesquare.autotool.bean;

import java.util.List;

public class Index extends AbstractBean {

    /**
     */
    private static final long serialVersionUID = 4627349303867461400L;
    /**
	 * 
	 */
    private List<Column> refColumns;

    private String unique;
    
    private String code;

    public List<Column> getRefColumns() {
        return refColumns;
    }

    public void setRefColumns(List<Column> refColumns) {
        this.refColumns = refColumns;
    }

    public boolean containsColId(String colId) {
        if (colId == null) {
            return false;
        }
        if (refColumns != null && !refColumns.isEmpty()) {
            for (Column col : refColumns) {
                if (colId.equals(col.getId())) {
                    return true;
                }
            }
        }
        return false;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}

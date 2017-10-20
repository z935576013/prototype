package com.suning.vgs.lifesquare.autotool.bean;

import java.util.List;

public class Keys extends AbstractBean{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6826627345601263813L;
	private List<Column> refColumns;
	
	private String code;
	
	/**
     * @return the code
     */
    public String getCode() {
        return code;
    }
    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }
    public List<Column> getRefColumns() {
		return refColumns;
	}
	public void setRefColumns(List<Column> refColumns) {
		this.refColumns = refColumns;
	}
	
	public boolean containsColId(String colId){
		if (colId == null){
			return false;
		}
		if (refColumns != null && !refColumns.isEmpty()){
			for (Column col : refColumns){
				if (colId.equals(col.getId())){
					return true;
				}
			}
		}
		return false;
	}
}

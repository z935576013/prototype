package com.suning.vgs.lifesquare.autotool.bean;

import java.util.List;

public class PhysicalDiagram extends AbstractBean{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7925543608011634907L;
	private String name;
	private List<Table> tables;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Table> getTables() {
		return tables;
	}
	public void setTables(List<Table> tables) {
		this.tables = tables;
	}
	
	
}

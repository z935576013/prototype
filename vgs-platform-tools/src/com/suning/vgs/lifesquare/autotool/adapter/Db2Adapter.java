package com.suning.vgs.lifesquare.autotool.adapter;

/**
 * 
 * @author lsg
 *
 */
public class Db2Adapter extends DefaultAdapter implements FormatAdapterIntf{
	
	
	@Override
	public String retrieveDataType(String sourceDataType) {
		if (sourceDataType == null){
			return "";
		}
		return sourceDataType.trim().toUpperCase();
	}
}

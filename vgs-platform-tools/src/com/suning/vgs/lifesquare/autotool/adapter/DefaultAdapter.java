package com.suning.vgs.lifesquare.autotool.adapter;

public class DefaultAdapter implements FormatAdapterIntf {

	@Override
	public String retrieveDataType(String sourceDataType) {
		if (sourceDataType == null){
			return "";
		}
		return sourceDataType.trim();
	}

	@Override
	public String retrieveLength(String sourceLength) {
		if (sourceLength == null){
			return "";
		}
		return sourceLength.trim();
	}

	@Override
	public String retrieveMandatory(String sourceMandatory) {
		if (sourceMandatory == null){
			return String.valueOf(Boolean.FALSE);
		}
		if ("1".equals(sourceMandatory.trim())){
			return String.valueOf(Boolean.TRUE);
		}
		return String.valueOf(Boolean.FALSE);
	}

	@Override
	public String retrieveDefaultValue(String sourceDefaultValue) {
		if (sourceDefaultValue == null){
			return "";
		}
		return sourceDefaultValue.trim();
	}

	@Override
	public String retrieveIdentity(String sourceIdentiry) {
		if (sourceIdentiry == null){
			return String.valueOf(Boolean.FALSE);
		}
		if ("1".equals(sourceIdentiry.trim())){
			return String.valueOf(Boolean.TRUE);
		}
		return String.valueOf(Boolean.FALSE);
	}

	@Override
	public String retrieveColumnName(String sourceColumnName) {
		if (sourceColumnName == null){
			return "";
		}
		return sourceColumnName.trim();
	}

	@Override
	public String retrieveColumnCode(String sourceColumnCode) {
		if (sourceColumnCode == null){
			return "";
		}
		return sourceColumnCode.trim();
	}

	@Override
	public String retrievePrecision(String sourcePrecision) {
		if (sourcePrecision == null){
			return "";
		}
		return sourcePrecision.trim();
	}

	@Override
	public String retrieveColumnComment(String sourceColumnComment) {
		if (sourceColumnComment == null){
			return "";
		}
		return sourceColumnComment.trim();
	}

	@Override
	public String retrieveTableName(String sourceTableName) {
		if (sourceTableName == null){
			return "";
		}
		return sourceTableName.trim();
	}

	@Override
	public String retrieveTableCode(String sourceTableCode) {
		if (sourceTableCode == null){
			return "";
		}
		return sourceTableCode.trim();
	}

	@Override
	public String retrieveIsPrimary(Boolean sourceIsPrimary) {
		if (sourceIsPrimary == null){
			return String.valueOf(Boolean.FALSE);
		}
		return String.valueOf(sourceIsPrimary);
	}

}

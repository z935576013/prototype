package com.suning.vgs.lifesquare.autotool.util;

import java.util.ArrayList;
import java.util.List;


/**
 * DTOFieldBean
 */
public class DTOFieldBean {
    String colNo;
    String colName;
    String colId;
    String colDataType;
    String colDataTypeWithLength;
    String colReference;
	String colLength;
    String colByteLength;
    String colPK;
    String colFK;
    String colNotNull;
    String colMinValue;
    String colMaxValue;
    String colDefaultValue;
    String colIndexName;
    String colComment;
    String identity;
    String physicalOptions;
    String fieldId;
    String fieldIdCap;
    String fieldName;
    String fieldComment;
    String fieldType;
    List<String> fieldAnnotations  = new ArrayList<String>();
    
    /**
     * @return the physicalOptions
     */
    public String getPhysicalOptions() {
        return physicalOptions;
    }

    /**
     * @param physicalOptions the physicalOptions to set
     */
    public void setPhysicalOptions(String physicalOptions) {
        this.physicalOptions = physicalOptions;
    }

    /**
	 * @return the colNo
	 */
	public String getColNo() {
		return colNo;
	}

	/**
	 * @param colNo the colNo to set
	 */
	public void setColNo(String colNo) {
		this.colNo = colNo;
	}

	/**
	 * @return the colName
	 */
	public String getColName() {
		return colName;
	}

	/**
	 * @param colName the colName to set
	 */
	public void setColName(String colName) {
		this.colName = colName;
	}

	/**
	 * @return the colId
	 */
	public String getColId() {
		return colId;
	}

	/**
	 * @param colId the colId to set
	 */
	public void setColId(String colId) {
		this.colId = colId;
	}

	/**
	 * @return the colDataType
	 */
	public String getColDataType() {
		return colDataType;
	}

	/**
	 * @param colDataType the colDataType to set
	 */
	public void setColDataType(String colDataType) {
		this.colDataType = colDataType;
	}

	/**
	 * @return the colLength
	 */
	public String getColLength() {
		return colLength;
	}

	/**
	 * @param colLength the colLength to set
	 */
	public void setColLength(String colLength) {
		this.colLength = colLength;
	}

	/**
	 * @return the colByteLength
	 */
	public String getColByteLength() {
		return colByteLength;
	}

	/**
	 * @param colByteLength the colByteLength to set
	 */
	public void setColByteLength(String colByteLength) {
		this.colByteLength = colByteLength;
	}

	/**
	 * @return the colPK
	 */
	public String getColPK() {
		return colPK;
	}

	/**
	 * @param colPK the colPK to set
	 */
	public void setColPK(String colPK) {
		this.colPK = colPK;
	}

	/**
	 * @return the colFK
	 */
	public String getColFK() {
		return colFK;
	}

	/**
	 * @param colFK the colFK to set
	 */
	public void setColFK(String colFK) {
		this.colFK = colFK;
	}

	/**
	 * @return the colNotNull
	 */
	public String getColNotNull() {
		return colNotNull;
	}

	/**
	 * @param colNotNull the colNotNull to set
	 */
	public void setColNotNull(String colNotNull) {
		this.colNotNull = colNotNull;
	}

	/**
	 * @return the colMinValue
	 */
	public String getColMinValue() {
		return colMinValue;
	}

	/**
	 * @param colMinValue the colMinValue to set
	 */
	public void setColMinValue(String colMinValue) {
		this.colMinValue = colMinValue;
	}

	/**
	 * @return the colMaxValue
	 */
	public String getColMaxValue() {
		return colMaxValue;
	}

	/**
	 * @param colMaxValue the colMaxValue to set
	 */
	public void setColMaxValue(String colMaxValue) {
		this.colMaxValue = colMaxValue;
	}

	/**
	 * @return the colDefaultValue
	 */
	public String getColDefaultValue() {
		return colDefaultValue;
	}

	/**
	 * @param colDefaultValue the colDefaultValue to set
	 */
	public void setColDefaultValue(String colDefaultValue) {
		this.colDefaultValue = colDefaultValue;
	}

	/**
	 * @return the colIndexName
	 */
	public String getColIndexName() {
		return colIndexName;
	}

	/**
	 * @param colIndexName the colIndexName to set
	 */
	public void setColIndexName(String colIndexName) {
		this.colIndexName = colIndexName;
	}

	/**
	 * @return the colComment
	 */
	public String getColComment() {
		return colComment;
	}

	/**
	 * @param colComment the colComment to set
	 */
	public void setColComment(String colComment) {
		this.colComment = colComment;
	}

	/**
	 * @return the fieldId
	 */
	public String getFieldId() {
		return fieldId;
	}

	/**
	 * @param fieldId the fieldId to set
	 */
	public void setFieldId(String fieldId) {
		this.fieldId = fieldId;
	}

	/**
	 * @return the fieldIdCap
	 */
	public String getFieldIdCap() {
		return fieldIdCap;
	}

	/**
	 * @param fieldIdCap the fieldIdCap to set
	 */
	public void setFieldIdCap(String fieldIdCap) {
		this.fieldIdCap = fieldIdCap;
	}

	/**
	 * @return the fieldName
	 */
	public String getFieldName() {
		return fieldName;
	}

	/**
	 * @param fieldName the fieldName to set
	 */
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	/**
	 * @return the fieldComment
	 */
	public String getFieldComment() {
		return fieldComment;
	}

	/**
	 * @param fieldComment the fieldComment to set
	 */
	public void setFieldComment(String fieldComment) {
		this.fieldComment = fieldComment;
	}

	/**
	 * @return the fieldType
	 */
	public String getFieldType() {
		return fieldType;
	}

	/**
	 * @param fieldType the fieldType to set
	 */
	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

	/**
	 * @return the fieldAnnotations
	 */
	public List<String> getFieldAnnotations() {
		return fieldAnnotations;
	}

	/**
	 * @param fieldAnnotations the fieldAnnotations to set
	 */
	public void setFieldAnnotations(List<String> fieldAnnotations) {
		this.fieldAnnotations = fieldAnnotations;
	}

	/**
     * addFieldAnnotations
     * @param e the fieldAnnotation to add
     */
    public void addFieldAnnotations(String e) {
    	if (e != null)
    		this.fieldAnnotations.add(e);
    }
    
    /**
	 * @return the colReference
	 */
	public String getColReference() {
		return colReference;
	}

	/**
	 * @param colReference the colReference to set
	 */
	public void setColReference(String colReference) {
		this.colReference = colReference;
	}

	/**
	 * @return the colDataTypeWithLength
	 */
	public String getColDataTypeWithLength() {
		return colDataTypeWithLength;
	}

	/**
	 * @param colDataTypeWithLength the colDataTypeWithLength to set
	 */
	public void setColDataTypeWithLength(String colDataTypeWithLength) {
		this.colDataTypeWithLength = colDataTypeWithLength;
	}

    /**
     * @return the identity
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * @param identity the identity to set
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }

}

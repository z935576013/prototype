package com.suning.vgs.lifesquare.autotool.util;

import java.util.ArrayList;
import java.util.List;

/**
 * DTOBean
 */
public class DTOBean extends Bean {
    String tblName;
    String tblId;
    String tbDesc;
    String nameSpace;
    String classId;
    String className;
    String classComment;
    String physicalOptions;
    List<DTOFieldBean> fields = new ArrayList<DTOFieldBean>();
    List<DTOFieldBean> pkFields = new ArrayList<DTOFieldBean>();
    List<String> classAnnotations = new ArrayList<String>();
    private List<DTOKeyBean> keys = new ArrayList<DTOKeyBean>();
    private List<DTOIndexBean> indexs = new ArrayList<DTOIndexBean>();

    /**
     * @return the tbDesc
     */
    public String getTbDesc() {
        return tbDesc;
    }

    /**
     * @param tbDesc the tbDesc to set
     */
    public void setTbDesc(String tbDesc) {
        this.tbDesc = tbDesc;
    }

    /**
     * @return the keys
     */
    public List<DTOKeyBean> getKeys() {
        return keys;
    }

    /**
     * @param keys the keys to set
     */
    public void setKeys(List<DTOKeyBean> keys) {
        this.keys = keys;
    }

    /**
     * @return the indexs
     */
    public List<DTOIndexBean> getIndexs() {
        return indexs;
    }

    /**
     * @param indexs the indexs to set
     */
    public void setIndexs(List<DTOIndexBean> indexs) {
        this.indexs = indexs;
    }

    /**
     * addFields
     * 
     * @param e the Fields to add
     */
    public void addFields(DTOFieldBean e) {
        this.fields.add(e);
    }

    /**
     * addPkFields
     * 
     * @param e the pkFields to add
     */
    public void addPkFields(DTOFieldBean e) {
        this.pkFields.add(e);
    }

    /**
     * addClassAnnotations
     * 
     * @param e the classAnnotation to add
     */
    public void addClassAnnotations(String e) {
        if (e != null)
            this.classAnnotations.add(e);
    }

    /**
     * @return the tblName
     */
    public String getTblName() {
        return tblName;
    }

    /**
     * @param tblName the tblName to set
     */
    public void setTblName(String tblName) {
        this.tblName = tblName;
    }

    /**
     * @return the tblId
     */
    public String getTblId() {
        return tblId;
    }

    /**
     * @param tblId the tblId to set
     */
    public void setTblId(String tblId) {
        this.tblId = tblId;
    }

    /**
     * @return the nameSpace
     */
    public String getNameSpace() {
        return nameSpace;
    }

    /**
     * @param nameSpace the nameSpace to set
     */
    public void setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
    }

    /**
     * @return the classId
     */
    public String getClassId() {
        return classId;
    }

    /**
     * @param classId the classId to set
     */
    public void setClassId(String classId) {
        this.classId = classId;
    }

    /**
     * @return the className
     */
    public String getClassName() {
        return className;
    }

    /**
     * @param className the className to set
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * @return the classComment
     */
    public String getClassComment() {
        return classComment;
    }

    /**
     * @param classComment the classComment to set
     */
    public void setClassComment(String classComment) {
        this.classComment = classComment;
    }

    /**
     * @return the fields
     */
    public List<DTOFieldBean> getFields() {
        return fields;
    }

    /**
     * @param fields the fields to set
     */
    public void setFields(List<DTOFieldBean> fields) {
        this.fields = fields;
    }

    /**
     * @return the classAnnotations
     */
    public List<String> getClassAnnotations() {
        return classAnnotations;
    }

    /**
     * @param classAnnotations the classAnnotations to set
     */
    public void setClassAnnotations(List<String> classAnnotations) {
        this.classAnnotations = classAnnotations;
    }

    /**
     * @return the pkFields
     */
    public List<DTOFieldBean> getPkFields() {
        return pkFields;
    }

    /**
     * @param pkFields the pkFields to set
     */
    public void setPkFields(List<DTOFieldBean> pkFields) {
        this.pkFields = pkFields;
    }

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

}

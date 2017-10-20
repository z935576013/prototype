package com.suning.vgs.lifesquare.autotool.util;

import java.util.ArrayList;
import java.util.List;

/**
 * DTOBean
 */
public class ServiceBean extends Bean{
    String serviceName;
    String isBasic;
    String desc;
    String packageName;
    String packName;
    List<ServiceMethoddBean> method = new ArrayList<ServiceMethoddBean>();

    /**
     * @param e the Fields to add
     */
    public void addFields(ServiceMethoddBean e) {
        this.method.add(e);
    }

	/**
     * @return the serviceName
     */
    public String getServiceName() {
    	return serviceName;
    }

	/**
     * @param serviceName the serviceName to set
     */
    public void setServiceName(String serviceName) {
    	this.serviceName = serviceName;
    }

	/**
     * @return the isBasic
     */
    public String getIsBasic() {
    	return isBasic;
    }

	/**
     * @param isBasic the isBasic to set
     */
    public void setIsBasic(String isBasic) {
    	this.isBasic = isBasic;
    }

	/**
     * @return the desc
     */
    public String getDesc() {
    	return desc;
    }

	/**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
    	this.desc = desc;
    }

	/**
     * @return the method
     */
    public List<ServiceMethoddBean> getMethod() {
    	return method;
    }

	/**
     * @param method the method to set
     */
    public void setMethod(List<ServiceMethoddBean> method) {
    	this.method = method;
    }

	/**
     * @return the packageName
     */
    public String getPackageName() {
    	return packageName;
    }

	/**
     * @param packageName the packageName to set
     */
    public void setPackageName(String packageName) {
    	this.packageName = packageName;
    }

    /**
     * @return the packName
     */
    public String getPackName() {
        return packName;
    }

    /**
     * @param packName the packName to set
     */
    public void setPackName(String packName) {
        this.packName = packName;
    }
    
}

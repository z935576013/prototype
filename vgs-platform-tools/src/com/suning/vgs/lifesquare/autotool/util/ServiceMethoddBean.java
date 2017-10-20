package com.suning.vgs.lifesquare.autotool.util;

import java.util.List;



/**
 * DTOFieldBean
 */
public class ServiceMethoddBean {
    String methodName;
    String methodDesc;
    String methodArgs;
    String methodArgsDescs;
    String methodRet;
    String methodRetDesc;
    List<ArgBean> argBeans;
	/**
     * @return the methodName
     */
    public String getMethodName() {
    	return methodName;
    }
	/**
     * @param methodName the methodName to set
     */
    public void setMethodName(String methodName) {
    	this.methodName = methodName;
    }
	/**
     * @return the methodDesc
     */
    public String getMethodDesc() {
    	return methodDesc;
    }
	/**
     * @param methodDesc the methodDesc to set
     */
    public void setMethodDesc(String methodDesc) {
    	this.methodDesc = methodDesc;
    }
	/**
     * @return the methodArgs
     */
    public String getMethodArgs() {
    	return methodArgs;
    }
	/**
     * @param methodArgs the methodArgs to set
     */
    public void setMethodArgs(String methodArgs) {
    	this.methodArgs = methodArgs;
    }
	/**
     * @return the methodRet
     */
    public String getMethodRet() {
    	return methodRet;
    }
	/**
     * @param methodRet the methodRet to set
     */
    public void setMethodRet(String methodRet) {
    	this.methodRet = methodRet;
    }
	/**
     * @return the methodArgsDesc
     */
    public String getMethodArgsDescs() {
    	return methodArgsDescs;
    }
	/**
     * @param methodArgsDesc the methodArgsDesc to set
     */
    public void setMethodArgsDescs(String methodArgsDescs) {
    	this.methodArgsDescs = methodArgsDescs;
    }
	/**
     * @return the methodRetDesc
     */
    public String getMethodRetDesc() {
    	return methodRetDesc;
    }
	/**
     * @param methodRetDesc the methodRetDesc to set
     */
    public void setMethodRetDesc(String methodRetDesc) {
    	this.methodRetDesc = methodRetDesc;
    }
	/**
     * @return the argBeans
     */
    public List<ArgBean> getArgBeans() {
    	return argBeans;
    }
	/**
     * @param argBeans the argBeans to set
     */
    public void setArgBeans(List<ArgBean> argBeans) {
    	this.argBeans = argBeans;
    }
   



}

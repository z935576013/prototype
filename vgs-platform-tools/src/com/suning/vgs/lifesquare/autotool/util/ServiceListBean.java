package com.suning.vgs.lifesquare.autotool.util;

import java.util.Map;

/**
 * ServiceListBean
 */
public class ServiceListBean extends Bean {
    Map<String, String> serviceDescMap;
    Map<String, String> serviceBasicMap;
    Map<String, String> servicePackgeMap;

    /**
     * @return the serviceDescMap
     */
    public Map<String, String> getServiceDescMap() {
        return serviceDescMap;
    }

    /**
     * @param serviceDescMap the serviceDescMap to set
     */
    public void setServiceDescMap(Map<String, String> serviceDescMap) {
        this.serviceDescMap = serviceDescMap;
    }

    /**
     * @return the serviceBasicMap
     */
    public Map<String, String> getServiceBasicMap() {
        return serviceBasicMap;
    }

    /**
     * @param serviceBasicMap the serviceBasicMap to set
     */
    public void setServiceBasicMap(Map<String, String> serviceBasicMap) {
        this.serviceBasicMap = serviceBasicMap;
    }

    /**
     * @return the servicePackgeMap
     */
    public Map<String, String> getServicePackgeMap() {
        return servicePackgeMap;
    }

    /**
     * @param servicePackgeMap the servicePackgeMap to set
     */
    public void setServicePackgeMap(Map<String, String> servicePackgeMap) {
        this.servicePackgeMap = servicePackgeMap;
    }

}

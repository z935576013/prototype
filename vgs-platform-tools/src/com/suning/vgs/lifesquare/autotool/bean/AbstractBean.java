package com.suning.vgs.lifesquare.autotool.bean;

import java.io.Serializable;

public abstract class AbstractBean implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = 954302595644648927L;
    private String id;
    private String createTimeStr;
    private String modifyTimeStr;
    private Boolean isDeleted = Boolean.FALSE;
    
    public Boolean getIsDeleted() {
        return isDeleted;
    }
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getCreateTimeStr() {
        return createTimeStr;
    }
    public void setCreateTimeStr(String createTimeStr) {
        this.createTimeStr = createTimeStr;
    }
    public String getModifyTimeStr() {
        return modifyTimeStr;
    }
    public void setModifyTimeStr(String modifyTimeStr) {
        this.modifyTimeStr = modifyTimeStr;
    }
    
    /**
     * 显示组件的变更事件
     * @param millseconds
     * @return 20 组件被创建  10 组件被更新 0组件未变化
     *         
     */
    public int getChangeEvent(long millseconds){
        if (this.createTimeStr != null){
            if (Long.parseLong(this.createTimeStr) >= millseconds){
                return 20;
            }
        }
        if (this.modifyTimeStr != null){
            if (Long.parseLong(this.modifyTimeStr) >= millseconds){
                return 10;
            }
        }
        return 0;
    }
}

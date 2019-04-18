package com.wuaipic.model;

import java.util.Date;

public class PictureEntity {
    private String picId;

    private String picSource;

    private String picPath;

    private Date createTime;

    private Date updateTime;

    private String picStatus;

    public String getPicId() {
        return picId;
    }

    public void setPicId(String picId) {
        this.picId = picId == null ? null : picId.trim();
    }

    public String getPicSource() {
        return picSource;
    }

    public void setPicSource(String picSource) {
        this.picSource = picSource == null ? null : picSource.trim();
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath == null ? null : picPath.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getPicStatus() {
        return picStatus;
    }

    public void setPicStatus(String picStatus) {
        this.picStatus = picStatus == null ? null : picStatus.trim();
    }
}
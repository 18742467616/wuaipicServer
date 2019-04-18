package com.wuaipic.model;

public class BlogEntity {
    private String blogId;

    private String blogTitle;

    private String blogSubtitle;

    private String blogContent;

    private String createTime;

    private String updateTime;

    private String beTop;

    private String blogStatus;

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId == null ? null : blogId.trim();
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle == null ? null : blogTitle.trim();
    }

    public String getBlogSubtitle() {
        return blogSubtitle;
    }

    public void setBlogSubtitle(String blogSubtitle) {
        this.blogSubtitle = blogSubtitle == null ? null : blogSubtitle.trim();
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent == null ? null : blogContent.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public String getBeTop() {
        return beTop;
    }

    public void setBeTop(String beTop) {
        this.beTop = beTop == null ? null : beTop.trim();
    }

    public String getBlogStatus() {
        return blogStatus;
    }

    public void setBlogStatus(String blogStatus) {
        this.blogStatus = blogStatus == null ? null : blogStatus.trim();
    }
}
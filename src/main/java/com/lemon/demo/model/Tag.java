package com.lemon.demo.model;

import javax.persistence.*;

public class Tag {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 分类标签名称
     */
    @Column(name = "tag_name")
    private String tagName;


    /**
     * 分类标签内容
     */
    @Column(name = "tag_content")
    private String tagContent;

    /**
     *分类状态
     */
    private Integer status;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取分类标签名称
     *
     * @return tag_name - 分类标签名称
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * 设置分类标签名称
     *
     * @param tagName 分类标签名称
     */
    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    public String getTagContent() {
        return tagContent;
    }

    public void setTagContent(String tagContent) {
        this.tagContent = tagContent;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
package com.lemon.demo.model;

import java.util.Date;
import javax.persistence.*;

public class Note {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 分类id
     */
    private Integer tagid;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建人id
     */
    @Column(name = "create_by")
    private Integer createBy;

    /**
     * 发布内容
     */
    private String message;

    /**
     * 文章状态
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
     * 获取分类id
     *
     * @return tagid - 分类id
     */
    public Integer getTagid() {
        return tagid;
    }

    /**
     * 设置分类id
     *
     * @param tagid 分类id
     */
    public void setTagid(Integer tagid) {
        this.tagid = tagid;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取创建人id
     *
     * @return create_by - 创建人id
     */
    public Integer getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人id
     *
     * @param createBy 创建人id
     */
    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取发布内容
     *
     * @return message - 发布内容
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置发布内容
     *
     * @param message 发布内容
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
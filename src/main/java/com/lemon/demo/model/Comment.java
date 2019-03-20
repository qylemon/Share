package com.lemon.demo.model;

import java.util.Date;
import javax.persistence.*;

public class Comment {
    /**
     * 评论id
     */
    @Id
    private Integer id;

    /**
     * 文章id
     */
    @Column(name = "note_id")
    private Integer noteId;

    /**
     * 评论人id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 评论内容
     */
    @Column(name = "reply_msg")
    private String replyMsg;

    /**
     * 评论时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 赞数
     */
    @Column(name = "zan_count")
    private Integer zanCount;

    /**
     * 回复对象id
     */
    @Column(name = "to_user_id")
    private Integer toUserId;

    /**
     * 评论状态
     */
    private Integer status;

    /**
     * 获取评论id
     *
     * @return id - 评论id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置评论id
     *
     * @param id 评论id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取文章id
     *
     * @return note_id - 文章id
     */
    public Integer getNoteId() {
        return noteId;
    }

    /**
     * 设置文章id
     *
     * @param noteId 文章id
     */
    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }

    /**
     * 获取评论人id
     *
     * @return user_id - 评论人id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置评论人id
     *
     * @param userId 评论人id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取评论内容
     *
     * @return reply_msg - 评论内容
     */
    public String getReplyMsg() {
        return replyMsg;
    }

    /**
     * 设置评论内容
     *
     * @param replyMsg 评论内容
     */
    public void setReplyMsg(String replyMsg) {
        this.replyMsg = replyMsg == null ? null : replyMsg.trim();
    }

    /**
     * 获取评论时间
     *
     * @return create_time - 评论时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置评论时间
     *
     * @param createTime 评论时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取赞数
     *
     * @return zan_count - 赞数
     */
    public Integer getZanCount() {
        return zanCount;
    }

    /**
     * 设置赞数
     *
     * @param zanCount 赞数
     */
    public void setZanCount(Integer zanCount) {
        this.zanCount = zanCount;
    }

    /**
     * 获取回复对象id
     *
     * @return to_user_id - 回复对象id
     */
    public Integer getToUserId() {
        return toUserId;
    }

    /**
     * 设置回复对象id
     *
     * @param toUserId 回复对象id
     */
    public void setToUserId(Integer toUserId) {
        this.toUserId = toUserId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
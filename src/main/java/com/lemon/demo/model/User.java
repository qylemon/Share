package com.lemon.demo.model;

import java.util.Date;
import java.util.Set;
import javax.persistence.*;

public class User {
    /**
     * user_id
     */
    @Id
    private Integer id;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 加密盐值
     */
    private String salt;

    /**
     * 用户头像
     */
    @Column(name = "portrait_url")
    private String portraitUrl;

    /**
     * 用户性别
     */
    private String sex;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 个签
     */
    private String autograph;

    /**
     * 用户所有角色值，用于shiro做角色权限的判断
     */
    @Transient
    private Set<String> roles;

    /**
     * 用户所有权限值，用于shiro做资源权限的判断
     */
    @Transient
    private Set<String> perms;


    /**
     * 0:正常用户 1:封禁用户
     */
    private Integer status;

    /**
     * 发文篇数
     */
    @Column(name = "reportNums")
    private Integer reportnums;

    /**
     * 用户创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改信息时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 最后登录时间
     */
    @Column(name = "login_time")
    private Date loginTime;


    /**
     * 获取用户头像
     *
     * @return portrait_url - 用户头像
     */
    public String getPortraitUrl() {
        return portraitUrl;
    }

    /**
     * 设置用户头像
     *
     * @param portraitUrl 用户头像
     */
    public void setPortraitUrl(String portraitUrl) {
        this.portraitUrl = portraitUrl == null ? null : portraitUrl.trim();
    }

    /**
     * 获取用户性别
     *
     * @return sex - 用户性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置用户性别
     *
     * @param sex 用户性别
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * 获取生日
     *
     * @return birthday - 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取个签
     *
     * @return autograph - 个签
     */
    public String getAutograph() {
        return autograph;
    }

    /**
     * 设置个签
     *
     * @param autograph 个签
     */
    public void setAutograph(String autograph) {
        this.autograph = autograph == null ? null : autograph.trim();
    }

    /**
     * 获取0:正常用户 1:封禁用户
     *
     * @return status - 0:正常用户 1:封禁用户
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置0:正常用户 1:封禁用户
     *
     * @param status 0:正常用户 1:封禁用户
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取发文篇数
     *
     * @return reportNums - 发文篇数
     */
    public Integer getReportnums() {
        return reportnums;
    }

    /**
     * 设置发文篇数
     *
     * @param reportnums 发文篇数
     */
    public void setReportnums(Integer reportnums) {
        this.reportnums = reportnums;
    }

    /**
     * 获取用户创建时间
     *
     * @return create_time - 用户创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置用户创建时间
     *
     * @param createTime 用户创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改信息时间
     *
     * @return update_time - 修改信息时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改信息时间
     *
     * @param updateTime 修改信息时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取最后登录时间
     *
     * @return login_time - 最后登录时间
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * 设置最后登录时间
     *
     * @param loginTime 最后登录时间
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : autograph.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    public Set<String> getPerms() {
        return perms;
    }

    public void setPerms(Set<String> perms) {
        this.perms = perms;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
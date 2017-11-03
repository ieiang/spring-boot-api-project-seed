package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "mc_user")
public class McUser {
    /**
     * PK
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 账号（登录名）
     */
    @Column(name = "USERNAME")
    private String username;

    /**
     * 密码
     */
    @Column(name = "PASSWORD")
    private String password;

    /**
     * 昵称
     */
    @Column(name = "NICK_NAME")
    private String nickName;

    /**
     * 手机号码
     */
    @Column(name = "MOBILE_PHONE")
    private String mobilePhone;

    /**
     * 姓名
     */
    @Column(name = "REAL_NAME")
    private String realName;

    /**
     * 邮箱
     */
    @Column(name = "EMAIL")
    private String email;

    /**
     * 登录次数
     */
    @Column(name = "LOGIN_COUNT")
    private Integer loginCount;

    /**
     * 最后登录时间
     */
    @Column(name = "LAST_LOGIN")
    private Date lastLogin;

    /**
     * 编辑人
     */
    @Column(name = "EDITOR")
    private Long editor;

    /**
     * 编辑时间
     */
    @Column(name = "EDIT_TIME")
    private Date editTime;

    /**
     * 状态
     */
    @Column(name = "STATUS")
    private String status;

    @Column(name = "USER_TYPE")
    private String userType;

    @Column(name = "SHOP_ID")
    private Long shopId;

    /**
     * 获取PK
     *
     * @return ID - PK
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置PK
     *
     * @param id PK
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取账号（登录名）
     *
     * @return USERNAME - 账号（登录名）
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置账号（登录名）
     *
     * @param username 账号（登录名）
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return PASSWORD - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取昵称
     *
     * @return NICK_NAME - 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称
     *
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取手机号码
     *
     * @return MOBILE_PHONE - 手机号码
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * 设置手机号码
     *
     * @param mobilePhone 手机号码
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * 获取姓名
     *
     * @return REAL_NAME - 姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置姓名
     *
     * @param realName 姓名
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 获取邮箱
     *
     * @return EMAIL - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取登录次数
     *
     * @return LOGIN_COUNT - 登录次数
     */
    public Integer getLoginCount() {
        return loginCount;
    }

    /**
     * 设置登录次数
     *
     * @param loginCount 登录次数
     */
    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    /**
     * 获取最后登录时间
     *
     * @return LAST_LOGIN - 最后登录时间
     */
    public Date getLastLogin() {
        return lastLogin;
    }

    /**
     * 设置最后登录时间
     *
     * @param lastLogin 最后登录时间
     */
    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    /**
     * 获取编辑人
     *
     * @return EDITOR - 编辑人
     */
    public Long getEditor() {
        return editor;
    }

    /**
     * 设置编辑人
     *
     * @param editor 编辑人
     */
    public void setEditor(Long editor) {
        this.editor = editor;
    }

    /**
     * 获取编辑时间
     *
     * @return EDIT_TIME - 编辑时间
     */
    public Date getEditTime() {
        return editTime;
    }

    /**
     * 设置编辑时间
     *
     * @param editTime 编辑时间
     */
    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    /**
     * 获取状态
     *
     * @return STATUS - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return USER_TYPE
     */
    public String getUserType() {
        return userType;
    }

    /**
     * @param userType
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * @return SHOP_ID
     */
    public Long getShopId() {
        return shopId;
    }

    /**
     * @param shopId
     */
    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }
}
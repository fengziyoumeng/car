package com.rongdu.cashloan.core.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息表实体
 * 
 * @author zwk
 * @version 1.0.0
 * @date 2018-03-19 10:52:00
 * Copyright 杭州民华金融信息服务有限公司  cashloan All Rights Reserved
 * 官方网站：www.yongqianbei.com
 * 未经授权不得进行修改、复制、出售及商业使用
 */
 public class CrmUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * 用户编号
    */
    private Long userId;

    /**
    * 用户名
    */
    private String userName;

    /**
    * 用户手机号码
    */
    private String loginMobile;

    /**
    * 
    */
    private String password;

    /**
    * 
    */
    private String lastLoginLocation;

    /**
    * 
    */
    private Date lastLoginTime;

    /**
    * 推荐码
    */
    private String recommendCode;

    /**
    * 渠道code
    */
    private String channelCode;

    /**
    * 推荐次数
    */
    private Integer recommendNum;

    /**
    * 添加时间
    */
    private String addTime;

    /**
    * 修改时间
    */
    private String updateTime;

    /**
    * 用户状态
    */
    private Integer userState;

    /**
    * 反欺诈认证 -所有认证状态1-已认证;0-未认证
    */
    private Integer antiFraudAuth;

    /**
    * 黑名单认证
    */
    private Integer blacklistAuth;

    /**
    * 魔蝎运营商认证
    */
    private Integer operatorAuth;

    /**
    * 魔蝎支付宝认证
    */
    private Integer alipayAuth;

    /**
    * 魔蝎运营商任务号
    */
    private String carrierId;

    /**
    * 魔蝎支付宝任务号
    */
    private String alipayId;


    /**
    * 获取用户编号
    *
    * @return 用户编号
    */
    public Long getUserId(){
        return userId;
    }

    /**
    * 设置用户编号
    * 
    * @param userId 要设置的用户编号
    */
    public void setUserId(Long userId){
        this.userId = userId;
    }

    /**
    * 获取用户名
    *
    * @return 用户名
    */
    public String getUserName(){
        return userName;
    }

    /**
    * 设置用户名
    * 
    * @param userName 要设置的用户名
    */
    public void setUserName(String userName){
        this.userName = userName;
    }

    /**
    * 获取用户手机号码
    *
    * @return 用户手机号码
    */
    public String getLoginMobile(){
        return loginMobile;
    }

    /**
    * 设置用户手机号码
    * 
    * @param loginMobile 要设置的用户手机号码
    */
    public void setLoginMobile(String loginMobile){
        this.loginMobile = loginMobile;
    }

    /**
    * 获取
    *
    * @return 
    */
    public String getPassword(){
        return password;
    }

    /**
    * 设置
    * 
    * @param password 要设置的
    */
    public void setPassword(String password){
        this.password = password;
    }

    /**
    * 获取
    *
    * @return 
    */
    public String getLastLoginLocation(){
        return lastLoginLocation;
    }

    /**
    * 设置
    * 
    * @param lastLoginLocation 要设置的
    */
    public void setLastLoginLocation(String lastLoginLocation){
        this.lastLoginLocation = lastLoginLocation;
    }

    /**
    * 获取
    *
    * @return 
    */
    public Date getLastLoginTime(){
        return lastLoginTime;
    }

    /**
    * 设置
    * 
    * @param lastLoginTime 要设置的
    */
    public void setLastLoginTime(Date lastLoginTime){
        this.lastLoginTime = lastLoginTime;
    }

    /**
    * 获取推荐码
    *
    * @return 推荐码
    */
    public String getRecommendCode(){
        return recommendCode;
    }

    /**
    * 设置推荐码
    * 
    * @param recommendCode 要设置的推荐码
    */
    public void setRecommendCode(String recommendCode){
        this.recommendCode = recommendCode;
    }

    /**
    * 获取渠道code
    *
    * @return 渠道code
    */
    public String getChannelCode(){
        return channelCode;
    }

    /**
    * 设置渠道code
    * 
    * @param channelCode 要设置的渠道code
    */
    public void setChannelCode(String channelCode){
        this.channelCode = channelCode;
    }

    /**
    * 获取推荐次数
    *
    * @return 推荐次数
    */
    public Integer getRecommendNum(){
        return recommendNum;
    }

    /**
    * 设置推荐次数
    * 
    * @param recommendNum 要设置的推荐次数
    */
    public void setRecommendNum(Integer recommendNum){
        this.recommendNum = recommendNum;
    }

    /**
    * 获取添加时间
    *
    * @return 添加时间
    */
    public String getAddTime(){
        return addTime;
    }

    /**
    * 设置添加时间
    * 
    * @param addTime 要设置的添加时间
    */
    public void setAddTime(String addTime){
        this.addTime = addTime;
    }

    /**
    * 获取修改时间
    *
    * @return 修改时间
    */
    public String getUpdateTime(){
        return updateTime;
    }

    /**
    * 设置修改时间
    * 
    * @param updateTime 要设置的修改时间
    */
    public void setUpdateTime(String updateTime){
        this.updateTime = updateTime;
    }

    /**
    * 获取用户状态
    *
    * @return 用户状态
    */
    public Integer getUserState(){
        return userState;
    }

    /**
    * 设置用户状态
    * 
    * @param userState 要设置的用户状态
    */
    public void setUserState(Integer userState){
        this.userState = userState;
    }

    /**
    * 获取反欺诈认证 -所有认证状态1-已认证;0-未认证
    *
    * @return 反欺诈认证 -所有认证状态1-已认证;0-未认证
    */
    public Integer getAntiFraudAuth(){
        return antiFraudAuth;
    }

    /**
    * 设置反欺诈认证 -所有认证状态1-已认证;0-未认证
    * 
    * @param antiFraudAuth 要设置的反欺诈认证 -所有认证状态1-已认证;0-未认证
    */
    public void setAntiFraudAuth(Integer antiFraudAuth){
        this.antiFraudAuth = antiFraudAuth;
    }

    /**
    * 获取黑名单认证
    *
    * @return 黑名单认证
    */
    public Integer getBlacklistAuth(){
        return blacklistAuth;
    }

    /**
    * 设置黑名单认证
    * 
    * @param blacklistAuth 要设置的黑名单认证
    */
    public void setBlacklistAuth(Integer blacklistAuth){
        this.blacklistAuth = blacklistAuth;
    }

    /**
    * 获取魔蝎运营商认证
    *
    * @return 魔蝎运营商认证
    */
    public Integer getOperatorAuth(){
        return operatorAuth;
    }

    /**
    * 设置魔蝎运营商认证
    * 
    * @param operatorAuth 要设置的魔蝎运营商认证
    */
    public void setOperatorAuth(Integer operatorAuth){
        this.operatorAuth = operatorAuth;
    }

    /**
    * 获取魔蝎支付宝认证
    *
    * @return 魔蝎支付宝认证
    */
    public Integer getAlipayAuth(){
        return alipayAuth;
    }

    /**
    * 设置魔蝎支付宝认证
    * 
    * @param alipayAuth 要设置的魔蝎支付宝认证
    */
    public void setAlipayAuth(Integer alipayAuth){
        this.alipayAuth = alipayAuth;
    }

    /**
    * 获取魔蝎运营商任务号
    *
    * @return 魔蝎运营商任务号
    */
    public String getCarrierId(){
        return carrierId;
    }

    /**
    * 设置魔蝎运营商任务号
    * 
    * @param carrierId 要设置的魔蝎运营商任务号
    */
    public void setCarrierId(String carrierId){
        this.carrierId = carrierId;
    }

    /**
    * 获取魔蝎支付宝任务号
    *
    * @return 魔蝎支付宝任务号
    */
    public String getAlipayId(){
        return alipayId;
    }

    /**
    * 设置魔蝎支付宝任务号
    * 
    * @param alipayId 要设置的魔蝎支付宝任务号
    */
    public void setAlipayId(String alipayId){
        this.alipayId = alipayId;
    }

}
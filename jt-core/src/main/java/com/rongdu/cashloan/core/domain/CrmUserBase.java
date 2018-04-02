package com.rongdu.cashloan.core.domain;


import java.io.Serializable;
import java.util.Date;

/**
 * 用户报表基础信息表实体
 * 
 * @author zwk
 * @version 1.0.0
 * @date 2018-03-19 11:02:22
 * Copyright 杭州民华金融信息服务有限公司  cashloan All Rights Reserved
 * 官方网站：www.yongqianbei.com
 * 未经授权不得进行修改、复制、出售及商业使用
 */
 public class CrmUserBase implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * 用户编号
    */
    private Long userId;

    /**
    * 证件号码
    */
    private String cardId;

    /**
    * 证件类型
    */
    private Integer cardType;

    /**
    * 认证手机号
    */
    private String authMobile;

    /**
    * 真实姓名
    */
    private String realName;

    /**
    * 出生日期
    */
    private Date birthday;

    /**
    * 住址
    */
    private String address;

    /**
    * 性别
    */
    private Integer sex;

    /**
    * 年龄
    */
    private Integer age;

    /**
    * qq号码
    */
    private String qq;

    /**
    * 微信号码
    */
    private String weixin;

    /**
    * 手机运营商1-移动;2-电信;3-联通
    */
    private Integer mobileOperator;

    /**
    * 芝麻分
    */
    private Integer zhimaScore;


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
    * 获取证件号码
    *
    * @return 证件号码
    */
    public String getCardId(){
        return cardId;
    }

    /**
    * 设置证件号码
    * 
    * @param cardId 要设置的证件号码
    */
    public void setCardId(String cardId){
        this.cardId = cardId;
    }

    /**
    * 获取证件类型
    *
    * @return 证件类型
    */
    public Integer getCardType(){
        return cardType;
    }

    /**
    * 设置证件类型
    * 
    * @param cardType 要设置的证件类型
    */
    public void setCardType(Integer cardType){
        this.cardType = cardType;
    }

    /**
    * 获取认证手机号
    *
    * @return 认证手机号
    */
    public String getAuthMobile(){
        return authMobile;
    }

    /**
    * 设置认证手机号
    * 
    * @param authMobile 要设置的认证手机号
    */
    public void setAuthMobile(String authMobile){
        this.authMobile = authMobile;
    }

    /**
    * 获取真实姓名
    *
    * @return 真实姓名
    */
    public String getRealName(){
        return realName;
    }

    /**
    * 设置真实姓名
    * 
    * @param realName 要设置的真实姓名
    */
    public void setRealName(String realName){
        this.realName = realName;
    }

    /**
    * 获取出生日期
    *
    * @return 出生日期
    */
    public Date getBirthday(){
        return birthday;
    }

    /**
    * 设置出生日期
    * 
    * @param birthday 要设置的出生日期
    */
    public void setBirthday(Date birthday){
        this.birthday = birthday;
    }

    /**
    * 获取住址
    *
    * @return 住址
    */
    public String getAddress(){
        return address;
    }

    /**
    * 设置住址
    * 
    * @param address 要设置的住址
    */
    public void setAddress(String address){
        this.address = address;
    }

    /**
    * 获取性别
    *
    * @return 性别
    */
    public Integer getSex(){
        return sex;
    }

    /**
    * 设置性别
    * 
    * @param sex 要设置的性别
    */
    public void setSex(Integer sex){
        this.sex = sex;
    }

    /**
    * 获取
    *
    * @return 
    */
    public Integer getAge(){
        return age;
    }

    /**
    * 设置
    * 
    * @param age 要设置的
    */
    public void setAge(Integer age){
        this.age = age;
    }

    /**
    * 获取
    *
    * @return 
    */
    public String getQq(){
        return qq;
    }

    /**
    * 设置
    * 
    * @param qq 要设置的
    */
    public void setQq(String qq){
        this.qq = qq;
    }

    /**
    * 获取
    *
    * @return 
    */
    public String getWeixin(){
        return weixin;
    }

    /**
    * 设置
    * 
    * @param weixin 要设置的
    */
    public void setWeixin(String weixin){
        this.weixin = weixin;
    }

    /**
    * 获取手机运营商1-移动;2-电信;3-联通
    *
    * @return 手机运营商1-移动;2-电信;3-联通
    */
    public Integer getMobileOperator(){
        return mobileOperator;
    }

    /**
    * 设置手机运营商1-移动;2-电信;3-联通
    * 
    * @param mobileOperator 要设置的手机运营商1-移动;2-电信;3-联通
    */
    public void setMobileOperator(Integer mobileOperator){
        this.mobileOperator = mobileOperator;
    }

    /**
    * 获取芝麻分
    *
    * @return 芝麻分
    */
    public Integer getZhimaScore(){
        return zhimaScore;
    }

    /**
    * 设置芝麻分
    * 
    * @param zhimaScore 要设置的芝麻分
    */
    public void setZhimaScore(Integer zhimaScore){
        this.zhimaScore = zhimaScore;
    }

}
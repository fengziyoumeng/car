package com.rongdu.cashloan.core.domain;


import java.io.Serializable;
import java.util.Date;

/**
 * 用户详细报表信息表实体
 * 
 * @author zwk
 * @version 1.0.0
 * @date 2018-03-19 11:05:41
 * Copyright 杭州民华金融信息服务有限公司  cashloan All Rights Reserved
 * 官方网站：www.yongqianbei.com
 * 未经授权不得进行修改、复制、出售及商业使用
 */
 public class CrmUserDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * 
    */
    private Long userId;

    /**
    * 学历
    */
    private Integer education;

    /**
    * 是否学生
    */
    private Integer isStudent;

    /**
    * 会否有工作
    */
    private Integer isWork;

    /**
    * 工作地址
    */
    private String workAddr;

    /**
    * 公积金
    */
    private Double pubFund;

    /**
    * 联系人数量
    */
    private Integer contactsNum;

    /**
    * 手机号实名认证月数
    */
    private Integer mobRealMons;

    /**
    * 三号是否统一
    */
    private Integer is3codeUnify;

    /**
    * 花呗额度
    */
    private Double hbLimit;

    /**
    * 借呗额度
    */
    private Double jbLimit;

    /**
    * 芝麻分
    */
    private Integer zhimaScore;

    /**
    * 基金
    */
    private Double fund;

    /**
    * 余额
    */
    private Double balance;

    /**
    * 余额宝
    */
    private Double yuEBao;

    /**
    * 招财宝
    */
    private Double zhaoCaiBao;

    /**
    * 存金宝
    */
    private Double cunJinBao;

    /**
    * 淘宝理财
    */
    private Double tbLiCai;

    /**
    * 淘宝实名
    */
    private String tbName;

    /**
    * 淘宝认证身份证号
    */
    private String tbIdCard;

    /**
    * 淘宝认证邮箱
    */
    private String tbEmail;

    /**
    * 淘宝认证手机号
    */
    private String tbMobile;

    /**
    * 安欺诈评分
    */
    private Integer antiFraudScore;

    /**
    * 是否有支付宝负面
    */
    private Integer zfbNegative;

    /**
    * 紧急联系人
    */
    private String exigentContacts;

    /**
    * 更新时间
    */
    private Date updateTime;

    /**
    * 创建时间
    */
    private Date addTime;


    /**
    * 获取
    *
    * @return 
    */
    public Long getUserId(){
        return userId;
    }

    /**
    * 设置
    * 
    * @param userId 要设置的
    */
    public void setUserId(Long userId){
        this.userId = userId;
    }

    /**
    * 获取学历
    *
    * @return 学历
    */
    public Integer getEducation(){
        return education;
    }

    /**
    * 设置学历
    * 
    * @param education 要设置的学历
    */
    public void setEducation(Integer education){
        this.education = education;
    }

    /**
    * 获取是否学生
    *
    * @return 是否学生
    */
    public Integer getIsStudent(){
        return isStudent;
    }

    /**
    * 设置是否学生
    * 
    * @param isStudent 要设置的是否学生
    */
    public void setIsStudent(Integer isStudent){
        this.isStudent = isStudent;
    }

    /**
    * 获取会否有工作
    *
    * @return 会否有工作
    */
    public Integer getIsWork(){
        return isWork;
    }

    /**
    * 设置会否有工作
    * 
    * @param isWork 要设置的会否有工作
    */
    public void setIsWork(Integer isWork){
        this.isWork = isWork;
    }

    /**
    * 获取工作地址
    *
    * @return 工作地址
    */
    public String getWorkAddr(){
        return workAddr;
    }

    /**
    * 设置工作地址
    * 
    * @param workAddr 要设置的工作地址
    */
    public void setWorkAddr(String workAddr){
        this.workAddr = workAddr;
    }

    /**
    * 获取公积金
    *
    * @return 公积金
    */
    public Double getPubFund(){
        return pubFund;
    }

    /**
    * 设置公积金
    * 
    * @param pubFund 要设置的公积金
    */
    public void setPubFund(Double pubFund){
        this.pubFund = pubFund;
    }

    /**
    * 获取联系人数量
    *
    * @return 联系人数量
    */
    public Integer getContactsNum(){
        return contactsNum;
    }

    /**
    * 设置联系人数量
    * 
    * @param contactsNum 要设置的联系人数量
    */
    public void setContactsNum(Integer contactsNum){
        this.contactsNum = contactsNum;
    }

    /**
    * 获取手机号实名认证月数
    *
    * @return 手机号实名认证月数
    */
    public Integer getMobRealMons(){
        return mobRealMons;
    }

    /**
    * 设置手机号实名认证月数
    * 
    * @param mobRealMons 要设置的手机号实名认证月数
    */
    public void setMobRealMons(Integer mobRealMons){
        this.mobRealMons = mobRealMons;
    }

    /**
    * 获取三号是否统一
    *
    * @return 三号是否统一
    */
    public Integer getIs3codeUnify(){
        return is3codeUnify;
    }

    /**
    * 设置三号是否统一
    * 
    * @param is3codeUnify 要设置的三号是否统一
    */
    public void setIs3codeUnify(Integer is3codeUnify){
        this.is3codeUnify = is3codeUnify;
    }

    /**
    * 获取花呗额度
    *
    * @return 花呗额度
    */
    public Double getHbLimit(){
        return hbLimit;
    }

    /**
    * 设置花呗额度
    * 
    * @param hbLimit 要设置的花呗额度
    */
    public void setHbLimit(Double hbLimit){
        this.hbLimit = hbLimit;
    }

    /**
    * 获取借呗额度
    *
    * @return 借呗额度
    */
    public Double getJbLimit(){
        return jbLimit;
    }

    /**
    * 设置借呗额度
    * 
    * @param jbLimit 要设置的借呗额度
    */
    public void setJbLimit(Double jbLimit){
        this.jbLimit = jbLimit;
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

    /**
    * 获取基金
    *
    * @return 基金
    */
    public Double getFund(){
        return fund;
    }

    /**
    * 设置基金
    * 
    * @param fund 要设置的基金
    */
    public void setFund(Double fund){
        this.fund = fund;
    }

    /**
    * 获取余额
    *
    * @return 余额
    */
    public Double getBalance(){
        return balance;
    }

    /**
    * 设置余额
    * 
    * @param balance 要设置的余额
    */
    public void setBalance(Double balance){
        this.balance = balance;
    }

    /**
    * 获取余额宝
    *
    * @return 余额宝
    */
    public Double getYuEBao(){
        return yuEBao;
    }

    /**
    * 设置余额宝
    * 
    * @param yuEBao 要设置的余额宝
    */
    public void setYuEBao(Double yuEBao){
        this.yuEBao = yuEBao;
    }

    /**
    * 获取招财宝
    *
    * @return 招财宝
    */
    public Double getZhaoCaiBao(){
        return zhaoCaiBao;
    }

    /**
    * 设置招财宝
    * 
    * @param zhaoCaiBao 要设置的招财宝
    */
    public void setZhaoCaiBao(Double zhaoCaiBao){
        this.zhaoCaiBao = zhaoCaiBao;
    }

    /**
    * 获取存金宝
    *
    * @return 存金宝
    */
    public Double getCunJinBao(){
        return cunJinBao;
    }

    /**
    * 设置存金宝
    * 
    * @param cunJinBao 要设置的存金宝
    */
    public void setCunJinBao(Double cunJinBao){
        this.cunJinBao = cunJinBao;
    }

    /**
    * 获取淘宝理财
    *
    * @return 淘宝理财
    */
    public Double getTbLiCai(){
        return tbLiCai;
    }

    /**
    * 设置淘宝理财
    * 
    * @param tbLiCai 要设置的淘宝理财
    */
    public void setTbLiCai(Double tbLiCai){
        this.tbLiCai = tbLiCai;
    }

    /**
    * 获取淘宝实名
    *
    * @return 淘宝实名
    */
    public String getTbName(){
        return tbName;
    }

    /**
    * 设置淘宝实名
    * 
    * @param tbName 要设置的淘宝实名
    */
    public void setTbName(String tbName){
        this.tbName = tbName;
    }

    /**
    * 获取淘宝认证身份证号
    *
    * @return 淘宝认证身份证号
    */
    public String getTbIdCard(){
        return tbIdCard;
    }

    /**
    * 设置淘宝认证身份证号
    * 
    * @param tbIdCard 要设置的淘宝认证身份证号
    */
    public void setTbIdCard(String tbIdCard){
        this.tbIdCard = tbIdCard;
    }

    /**
    * 获取淘宝认证邮箱
    *
    * @return 淘宝认证邮箱
    */
    public String getTbEmail(){
        return tbEmail;
    }

    /**
    * 设置淘宝认证邮箱
    * 
    * @param tbEmail 要设置的淘宝认证邮箱
    */
    public void setTbEmail(String tbEmail){
        this.tbEmail = tbEmail;
    }

    /**
    * 获取淘宝认证手机号
    *
    * @return 淘宝认证手机号
    */
    public String getTbMobile(){
        return tbMobile;
    }

    /**
    * 设置淘宝认证手机号
    * 
    * @param tbMobile 要设置的淘宝认证手机号
    */
    public void setTbMobile(String tbMobile){
        this.tbMobile = tbMobile;
    }

    /**
    * 获取安欺诈评分
    *
    * @return 安欺诈评分
    */
    public Integer getAntiFraudScore(){
        return antiFraudScore;
    }

    /**
    * 设置安欺诈评分
    * 
    * @param antiFraudScore 要设置的安欺诈评分
    */
    public void setAntiFraudScore(Integer antiFraudScore){
        this.antiFraudScore = antiFraudScore;
    }

    /**
    * 获取是否有支付宝负面
    *
    * @return 是否有支付宝负面
    */
    public Integer getZfbNegative(){
        return zfbNegative;
    }

    /**
    * 设置是否有支付宝负面
    * 
    * @param zfbNegative 要设置的是否有支付宝负面
    */
    public void setZfbNegative(Integer zfbNegative){
        this.zfbNegative = zfbNegative;
    }

    /**
    * 获取紧急联系人
    *
    * @return 紧急联系人
    */
    public String getExigentContacts(){
        return exigentContacts;
    }

    /**
    * 设置紧急联系人
    * 
    * @param exigentContacts 要设置的紧急联系人
    */
    public void setExigentContacts(String exigentContacts){
        this.exigentContacts = exigentContacts;
    }

    /**
    * 获取
    *
    * @return 
    */
    public Date getUpdateTime(){
        return updateTime;
    }

    /**
    * 设置
    * 
    * @param updateTime 要设置的
    */
    public void setUpdateTime(Date updateTime){
        this.updateTime = updateTime;
    }

    /**
    * 获取
    *
    * @return 
    */
    public Date getAddTime(){
        return addTime;
    }

    /**
    * 设置
    * 
    * @param addTime 要设置的
    */
    public void setAddTime(Date addTime){
        this.addTime = addTime;
    }

}
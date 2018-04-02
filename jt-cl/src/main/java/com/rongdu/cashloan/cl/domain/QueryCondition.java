package com.rongdu.cashloan.cl.domain;

import com.rongdu.cashloan.core.common.util.StringUtil;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户消息实体
 * 
 * @author Yang
 * @version 1.0.0
 * @date 2018-02-26 10:56:07
 * Copyright 杭州民华金融信息服务有限公司  cashloan All Rights Reserved
 * 官方网站：www.yongqianbei.com
 * 未经授权不得进行修改、复制、出售及商业使用
 */
 public class QueryCondition implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * 主键Id
    */
    private Long id;

    /**
    * 商家id
    */
    private Long merchantId;

    /**
    * 最低芝麻分阶段
    */
    private Integer zmScoreLevel;

    /**
    * 最小年龄
    */
    private Integer ageMin;

    /**
    * 最大年龄
    */
    private Integer ageMax;

    /**
    * 需要的数据 量
    */
    private Integer dataAmount;

    /**
    * 更新时间
    */
    private Date updateTime;

    /**
     * 过滤地址
     */
    private String addressFilter;

    private String[] addressFilterVo;


    /**
    * 获取主键Id
    *
    * @return id
    */
    public Long getId(){
        return id;
    }

    /**
    * 设置主键Id
    * 
    * @paramId 要设置的主键Id
    */
    public void setId(Long id){
        this.id = id;
    }

    /**
    * 获取商家id
    *
    * @return 商家id
    */
    public Long getMerchantId(){
        return merchantId;
    }

    /**
    * 设置商家id
    * 
    * @param merchantId 要设置的商家id
    */
    public void setMerchantId(Long merchantId){
        this.merchantId = merchantId;
    }

    public Integer getZmScoreLevel() {
        return zmScoreLevel;
    }

    public void setZmScoreLevel(Integer zmScoreLevel) {
        this.zmScoreLevel = zmScoreLevel;
    }

    public String getAddressFilter() {
        return this.addressFilter;
    }

    //==========================================
    public String[] getAddressFilterVo(){
        if(StringUtil.isNotBlank(this.addressFilter)){
            String[] split = this.addressFilter.split(",");
            return split;
        }else {
            return new String[]{};
        }
    }
    public String[] getAddress(){
        return this.addressFilterVo;
    }
    public void setAddressFilterVo(String[] addressFilter) {
        this.addressFilterVo = addressFilter;
    }
    //==========================================

    public void setAddressFilter(String addressFilter) {
        this.addressFilter = addressFilter;
    }

    /**
    * 获取最小年龄
    *
    * @return 最小年龄
    */
    public Integer getAgeMin(){
        return ageMin;
    }

    /**
    * 设置最小年龄
    * 
    * @param ageMin 要设置的最小年龄
    */
    public void setAgeMin(Integer ageMin){
        this.ageMin = ageMin;
    }

    /**
    * 获取最大年龄
    *
    * @return 最大年龄
    */
    public Integer getAgeMax(){
        return ageMax;
    }

    /**
    * 设置最大年龄
    * 
    * @param ageMax 要设置的最大年龄
    */
    public void setAgeMax(Integer ageMax){
        this.ageMax = ageMax;
    }

    /**
    * 获取需要的数据 量
    *
    * @return 需要的数据 量
    */
    public Integer getDataAmount(){
        return dataAmount;
    }

    /**
    * 设置需要的数据 量
    * 
    * @param dataAmount 要设置的需要的数据 量
    */
    public void setDataAmount(Integer dataAmount){
        this.dataAmount = dataAmount;
    }

    /**
    * 获取更新时间
    *
    * @return 更新时间
    */
    public Date getUpdateTime(){
        return updateTime;
    }

    /**
    * 设置更新时间
    * 
    * @param updateTime 要设置的更新时间
    */
    public void setUpdateTime(Date updateTime){
        this.updateTime = updateTime;
    }

}
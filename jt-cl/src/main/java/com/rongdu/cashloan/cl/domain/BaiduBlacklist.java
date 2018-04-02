package com.rongdu.cashloan.cl.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 百度黑名单报告实体
 *
 * @author zwk
 * @version 1.0.0
 * @date 2017-10-27 12:03:11
 * Copyright 杭州民华金融信息服务有限公司  cashloan All Rights Reserved
 * 官方网站：www.yongqianbei.com
 * 未经授权不得进行修改、复制、出售及商业使用
 */
public class BaiduBlacklist implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
    private Long id;

    /**
     * 用户user_id
     */
    private Long userId;

    /**
     * 用户风险等级
     */
    private String blacklevel;

    /**
     * 认证时间
     */
    private Date createTime;

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
     * @param 要设置的主键Id
     */
    public void setId(Long id){
        this.id = id;
    }

    /**
     * 获取用户user_id
     *
     * @return 用户user_id
     */
    public Long getUserId(){
        return userId;
    }

    /**
     * 设置用户user_id
     *
     * @param userId 要设置的用户user_id
     */
    public void setUserId(Long userId){
        this.userId = userId;
    }

    /**
     * 获取用户风险等级
     *
     * @return 用户风险等级
     */
    public String getBlacklevel(){
        return blacklevel;
    }

    /**
     * 设置用户风险等级
     *
     * @param blacklevel 要设置的用户风险等级
     */
    public void setBlacklevel(String blacklevel){
        this.blacklevel = blacklevel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

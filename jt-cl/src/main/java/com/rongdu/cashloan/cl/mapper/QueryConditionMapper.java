package com.rongdu.cashloan.cl.mapper;

import com.rongdu.cashloan.cl.domain.MerchantBorrower;
import com.rongdu.cashloan.core.common.mapper.BaseMapper;
import com.rongdu.cashloan.core.common.mapper.RDBatisDao;
import com.rongdu.cashloan.cl.domain.QueryCondition;

import java.util.List;
import java.util.Map;

/**
 * 用户消息Dao
 * 
 * @author Yang
 * @version 1.0.0
 * @date 2018-02-26 10:56:07
 * Copyright 杭州民华金融信息服务有限公司  cashloan All Rights Reserved
 * 官方网站：www.yongqianbei.com
 * 未经授权不得进行修改、复制、出售及商业使用
 */
@RDBatisDao
public interface QueryConditionMapper extends BaseMapper<QueryCondition, Long> {


    List<MerchantBorrower> queryUserByCondition(Map<String, Object> condition);

    QueryCondition getConditionById(Long merchantId);

    void updateMySelective(QueryCondition queryCondition);
}

package com.rongdu.cashloan.core.mapper;

import com.rongdu.cashloan.core.common.mapper.BaseMapper;
import com.rongdu.cashloan.core.common.mapper.RDBatisDao;
import com.rongdu.cashloan.core.domain.CrmUserDetail;

import java.util.List;

/**
 * 用户详细报表信息表Dao
 * 
 * @author zwk
 * @version 1.0.0
 * @date 2018-03-19 11:05:41
 * Copyright 杭州民华金融信息服务有限公司  cashloan All Rights Reserved
 * 官方网站：www.yongqianbei.com
 * 未经授权不得进行修改、复制、出售及商业使用
 */
@RDBatisDao
public interface CrmUserDetailMapper extends BaseMapper<CrmUserDetail, Long> {


    List<CrmUserDetail> getUserDetailById(Long userId);
}

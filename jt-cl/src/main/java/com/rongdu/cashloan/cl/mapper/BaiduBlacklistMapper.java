package com.rongdu.cashloan.cl.mapper;

import com.rongdu.cashloan.cl.domain.BaiduBlacklist;
import com.rongdu.cashloan.core.common.mapper.BaseMapper;
import com.rongdu.cashloan.core.common.mapper.RDBatisDao;

/**
 * 百度黑名单报告Dao
 *
 * @author zwk
 * @version 1.0.0
 * @date 2017-10-27 13:54:43
 * Copyright 杭州民华金融信息服务有限公司  cashloan All Rights Reserved
 * 官方网站：www.yongqianbei.com
 * 未经授权不得进行修改、复制、出售及商业使用
 */
@RDBatisDao
public interface BaiduBlacklistMapper extends BaseMapper<BaiduBlacklist,Long> {

    BaiduBlacklist getByUserId(Long userId);

    void delByUserId(Long userId);

}

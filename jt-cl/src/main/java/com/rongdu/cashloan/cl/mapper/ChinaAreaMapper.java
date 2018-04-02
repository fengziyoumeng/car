package com.rongdu.cashloan.cl.mapper;


import com.rongdu.cashloan.cl.domain.ChinaArea;
import com.rongdu.cashloan.core.common.mapper.BaseMapper;
import com.rongdu.cashloan.core.common.mapper.RDBatisDao;
import com.rongdu.cashloan.core.domain.Borrow;

import java.util.List;

/**
 * <p>
  * 中国区域地名表 Mapper 接口
 * </p>
 *
 * @author ding
 * @since 2017-09-13
 */
@RDBatisDao
public interface ChinaAreaMapper extends BaseMapper<ChinaArea,Long> {
	
	List<ChinaArea> selectAllProvince();

	List<ChinaArea> selectAreaByPid(Long parentId);

}
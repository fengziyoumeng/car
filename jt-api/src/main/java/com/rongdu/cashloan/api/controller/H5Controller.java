package com.rongdu.cashloan.api.controller;

import com.rongdu.cashloan.cl.domain.ClFlowInfo;
import com.rongdu.cashloan.cl.domain.FlowPic;
import com.rongdu.cashloan.cl.domain.FlowRadio;
import com.rongdu.cashloan.core.common.context.Constant;
import com.rongdu.cashloan.core.common.exception.ServiceException;
import com.rongdu.cashloan.core.common.util.ServletUtils;
import com.rongdu.cashloan.core.common.web.controller.BaseController;
import com.rongdu.cashloan.core.redis.ShardedJedisClient;
import com.rongdu.cashloan.system.domain.SysConfig;
import com.rongdu.cashloan.system.domain.SysDictDetail;
import com.rongdu.cashloan.system.serviceNoSharding.SysConfigService;
import com.rongdu.cashloan.system.serviceNoSharding.SysDictDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * H5页面Controller
 * @author xx
 * @version 1.0.0
 * @date 2017年2月24日 下午4:34:51
 * Copyright 杭州民华金融信息服务有限公司 金融创新事业部 此处填写项目英文简称  All Rights Reserved
 * 官方网站：www.yongqianbei.com
 * 未经授权不得进行修改、复制、出售及商业使用
 */
@Scope("prototype")
@Controller
@CrossOrigin
public class H5Controller extends BaseController{
	public static final Logger logger = LoggerFactory.getLogger(H5Controller.class);
	@Resource
	private SysConfigService sysConfigService;
	@Autowired
	private ShardedJedisClient redisClient;
	@Resource
	private SysDictDetailService sysDictDetailService;
	/**
	 * 获取H5页面清单
	 * @param
	 * @throws Exception
	 */
	@RequestMapping(value = "/api/h5/list.htm", method = RequestMethod.GET)
	public void list() throws Exception {
		List<Map<String,Object>> dataList = new ArrayList<Map<String,Object>>();
		List<SysConfig> list = sysConfigService.listByCode("h5_");
		for (int i = 0; i < list.size(); i++) {
			Map<String,Object> pro =new HashMap<>();
			pro.put("code",list.get(i).getCode());
			pro.put("value",list.get(i).getValue());
			pro.put("name",list.get(i).getName());
			dataList.add(pro);
		}
		Map<String,Object> data = new HashMap<>();
		data.put("list", dataList);
		
		Map<String,Object> result = new HashMap<String,Object>();
		result.put(Constant.RESPONSE_DATA, data);
		result.put(Constant.RESPONSE_CODE, Constant.SUCCEED_CODE_VALUE);
		result.put(Constant.RESPONSE_CODE_MSG, "查询成功");
		ServletUtils.writeToResponse(response,result);
	}
	
	/**
	 * 生成图片验证码
	 * @param
	 * @throws Exception
	 */
	@RequestMapping(value = "/api/h5/imgCode/generate.htm", method = RequestMethod.GET)
	public void generate() throws Exception {
		super.generateImgCode();
	}

	//处理字典字符串拼接
	private String handleDict(String pProcess,String itemCode,String flag) {
		String[] process=pProcess.split(",");
		String processStr="";
		for(int i=0;i<process.length;i++){
			try {
				SysDictDetail itemDict = sysDictDetailService.findDetail(process[i],itemCode);
				if(i<process.length-1) {
					if("process".equals(flag)){
						processStr += itemDict.getItemValue() + "=>";
					}else{
						processStr += itemDict.getItemValue() + "|";
					}
				}else{
					processStr += itemDict.getItemValue();
				}
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return processStr;
	}

}

package com.rongdu.cashloan.manage.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.Page;
import com.rongdu.cashloan.core.common.context.Constant;
import com.rongdu.cashloan.core.common.util.JsonUtil;
import com.rongdu.cashloan.core.common.util.RdPage;
import com.rongdu.cashloan.core.common.util.ServletUtils;
import com.rongdu.cashloan.core.common.web.controller.BaseController;
import com.rongdu.cashloan.system.domain.SysAccessCode;
import com.rongdu.cashloan.system.domain.SysUser;
import com.rongdu.cashloan.system.model.SysAccessCodeModel;
import com.rongdu.cashloan.system.permission.annotation.RequiresPermission;
import com.rongdu.cashloan.system.serviceNoSharding.SysAccessCodeService;

 /**
 * 访问码Controller
 * 
 * @author dufy
 * @version 1.0.0
 * @date 2017-03-24 17:37:49
 * Copyright 杭州民华金融信息服务有限公司  arc All Rights Reserved
 * 官方网站：www.yongqianbei.com
 * 
 * 未经授权不得进行修改、复制、出售及商业使用
 */
@Controller
@Scope("prototype")
public class SysAccessCodeController extends BaseController {

	@Resource
	private SysAccessCodeService sysAccessCodeService;
	
	
	/**
	 * 访问码信息列表
	 * @param searchParams
	 * @param current
	 * @param pageSize
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/modules/manage/user/accessCode/list.htm",method={RequestMethod.GET,RequestMethod.POST})
	@RequiresPermission(code = "modules:manage:accessCode:list",name = "访问码信息列表")
	public void list(@RequestParam(value="searchParams",required=false) String searchParams,
			@RequestParam(value = "current") int current,
			@RequestParam(value = "pageSize") int pageSize){
		Map<String, Object> params = JsonUtil.parse(searchParams, Map.class);
		Page<SysAccessCodeModel> page = sysAccessCodeService.listAccessCodeModel(params, current, pageSize);
		Map<String,Object> result = new HashMap<String,Object>();
		result.put(Constant.RESPONSE_DATA, page);
		result.put(Constant.RESPONSE_DATA_PAGE, new RdPage(page));
		result.put(Constant.RESPONSE_CODE, Constant.SUCCEED_CODE_VALUE);
		result.put(Constant.RESPONSE_CODE_MSG, "获取成功");
		ServletUtils.writeToResponse(response,result);
	}
	
	/**
	 * 新增访问码
	 * @param userName
	 * @param code
	 */
	@RequestMapping(value="/modules/manage/user/accessCode/save.htm",method={RequestMethod.GET,RequestMethod.POST})
	@RequiresPermission(code = "modules:manage:accessCode:add",name = "新增访问码")
	public void add(@RequestParam(value="sysUserId") long sysUserId,
			@RequestParam(value="code") String code,
			@RequestParam(value="time") String time){
		Map<String,Object> result = new HashMap<String,Object>();
		int codeCount = sysAccessCodeService.countCode(sysUserId, code);
		if(codeCount > 0){
			result.put(Constant.RESPONSE_CODE, Constant.FAIL_CODE_VALUE);
			result.put(Constant.RESPONSE_CODE_MSG, "添加失败，该用户已存在此访问码，请重新输入访问码");
		} else {
			SysAccessCode accessCode = new SysAccessCode();
			accessCode.setSysUserId(sysUserId);
			accessCode.setCode(code);
			int msg = sysAccessCodeService.save(accessCode, time);
			
			if (msg>0) {
	        	result.put(Constant.RESPONSE_CODE, Constant.SUCCEED_CODE_VALUE);
				result.put(Constant.RESPONSE_CODE_MSG, "添加成功");
			} else {
				result.put(Constant.RESPONSE_CODE, Constant.FAIL_CODE_VALUE);
				result.put(Constant.RESPONSE_CODE_MSG, "添加失败");
			}
		}
		
		ServletUtils.writeToResponse(response,result);
	}
	
	/**
	 * 启用访问码
	 * @param id
	 */
	@RequestMapping(value="/modules/manage/user/accessCode/enable.htm",method={RequestMethod.GET,RequestMethod.POST})
	@RequiresPermission(code = "modules:manage:accessCode:enable",name = "访问码启用")
	public void enable(@RequestParam(value="id") Long id){
		Map<String,Object> result = new HashMap<String,Object>();
		SysAccessCode accessCode = sysAccessCodeService.getById(id);
		accessCode.setState(SysAccessCodeModel.STATE_ENABLE);
		int msg = sysAccessCodeService.updateState(accessCode);
        if (msg > 0) {
        	result.put(Constant.RESPONSE_CODE, Constant.SUCCEED_CODE_VALUE);
			result.put(Constant.RESPONSE_CODE_MSG, "启用成功");
		}else {
			result.put(Constant.RESPONSE_CODE, Constant.FAIL_CODE_VALUE);
			result.put(Constant.RESPONSE_CODE_MSG, "启用失败");
		}
        ServletUtils.writeToResponse(response,result);
	}
	
	
	/**
	 * 禁用访问码
	 * @param id
	 */
	@RequestMapping(value="/modules/manage/user/accessCode/disable.htm",method={RequestMethod.GET,RequestMethod.POST})
	@RequiresPermission(code = "modules:manage:accessCode:disable",name = "访问码禁用")
	public void disable(@RequestParam(value="id") Long id){
		Map<String,Object> result = new HashMap<String,Object>();
		SysAccessCode accessCode = sysAccessCodeService.getById(id);
		accessCode.setState(SysAccessCodeModel.STATE_DISABLE);
		int msg = sysAccessCodeService.updateState(accessCode);
        if (msg > 0) {
        	result.put(Constant.RESPONSE_CODE, Constant.SUCCEED_CODE_VALUE);
			result.put(Constant.RESPONSE_CODE_MSG, "禁用成功");
		}else {
			result.put(Constant.RESPONSE_CODE, Constant.FAIL_CODE_VALUE);
			result.put(Constant.RESPONSE_CODE_MSG, "禁用失败");
		}
        ServletUtils.writeToResponse(response,result);
	}
	
	
	/**
	 * 修改访问码信息
	 * @param id
	 * @param code
	 */
	@RequestMapping(value="/modules/manage/user/accessCode/modify.htm",method={RequestMethod.GET,RequestMethod.POST})
	@RequiresPermission(code = "modules:manage:accessCode:modify",name = "修改访问码")
	public void modify(@RequestParam(value="id") long id,
			@RequestParam(value="time") String time){
		SysAccessCode accessCode = sysAccessCodeService.getById(id);
		int msg = sysAccessCodeService.update(accessCode,time); 
        Map<String,Object> result = new HashMap<String,Object>();
        if (msg > 0) {
        	result.put(Constant.RESPONSE_CODE, Constant.SUCCEED_CODE_VALUE);
			result.put(Constant.RESPONSE_CODE_MSG, Constant.OPERATION_SUCCESS);
		}else {
			result.put(Constant.RESPONSE_CODE, Constant.FAIL_CODE_VALUE);
			result.put(Constant.RESPONSE_CODE_MSG, Constant.OPERATION_FAIL);
		}
        ServletUtils.writeToResponse(response,result);
	}
	
	/**
	 * 用户名列表
	 */
	@RequestMapping(value="/modules/manage/user/accessCode/listName.htm",method={RequestMethod.GET,RequestMethod.POST})
	@RequiresPermission(code = "modules:manage:accessCode:listName",name = "用户名列表")
	public void listUserName(){
		List<SysUser> list = sysAccessCodeService.listUserName();
		Map<String,Object> result = new HashMap<String,Object>();
		result.put(Constant.RESPONSE_DATA, list);
		result.put(Constant.RESPONSE_CODE, Constant.SUCCEED_CODE_VALUE);
		result.put(Constant.RESPONSE_CODE_MSG, "获取成功");
		ServletUtils.writeToResponse(response,result);
	}
}

package com.llg.oas.controller;

import com.llg.oas.entity.Department;
import com.llg.oas.service.DepartmentService;
import com.alibaba.fastjson.JSONObject;
import com.jy.medusa.stuff.Pager;
import com.jy.medusa.stuff.param.MyRestrictions;
import com.llg.oas.utils.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.annotation.Resource;

/**
 * Created by llg on 2018-04-02 22:13:00
 */
@Controller
@RequestMapping("/department")
public class DepartmentController {

	private static final Logger logger = LoggerFactory.getLogger(DepartmentController.class);

	@Resource
	DepartmentService departmentService;

	/**
	 * 列表部门
	 * @param pageNum
	 * @param param
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/listDept.json", method = RequestMethod.GET)
	@ResponseBody
	public JSONObject index(@RequestParam Integer pageNum, Department param, HttpServletRequest request) {
		JSONObject json = new JSONObject();
		try {
			Pager<Department> pager = MyRestrictions.getPager().setPageSize(10).setPageNumber(pageNum);
			departmentService.selectByGaze(param, pager);
			JsonUtil.buildPageSuccess(json,pager);
		} catch (Exception e) {
			JsonUtil.buildBaseFail(json,e.getMessage());
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		return json;
	}

	/**
	 * 添加部门
	 * @param param
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/save.json", method = RequestMethod.POST)
	@ResponseBody
	public JSONObject save(Department param, HttpServletRequest request) {
		JSONObject json = new JSONObject();
		try {
			if(param != null) departmentService.save(param);
			JsonUtil.buildBaseSuccess(json);
		} catch (Exception e) {
			JsonUtil.buildBaseFail(json,e.getMessage());
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		return json;
	}

	/**
	 * 更新部门
	 * @param param
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/update.json", method = RequestMethod.POST)
	@ResponseBody
	public JSONObject update(Department param, HttpServletRequest request) {
		JSONObject json = new JSONObject();
		try {
			if(param != null) departmentService.updateSelective(param);
			JsonUtil.buildBaseSuccess(json);
		} catch (Exception e) {
			JsonUtil.buildBaseFail(json,e.getMessage());
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		return json;
	}

	/**
	 * 删除部门
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/delete.json", method = RequestMethod.GET)
	@ResponseBody
	public JSONObject delete(@RequestParam Integer id, HttpServletRequest request) {
		JSONObject json = new JSONObject();
		try {
			//TODO 如果部门下有子部门或者有员工，不能删除
			departmentService.deleteById(id);
			JsonUtil.buildBaseSuccess(json);
		} catch (Exception e) {
			JsonUtil.buildBaseFail(json,e.getMessage());
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		return json;
	}

	/**
	 * 禁用部门
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/disableDept.json", method = RequestMethod.GET)
	@ResponseBody
	public JSONObject disableDept(@RequestParam Integer id, HttpServletRequest request) {
		JSONObject json = new JSONObject();
		try {
			//TODO 如果部门下有子部门或者有员工，不能禁用
			Department d = new Department();
			d.setId(id);
			d.setStatus(0);//0表示禁用
			departmentService.updateSelective(d);
			JsonUtil.buildBaseSuccess(json);
		} catch (Exception e) {
			JsonUtil.buildBaseFail(json,e.getMessage());
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		return json;
	}

	/**
	 * 根据id查询部门
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/selectDeptById.json", method = RequestMethod.GET)
	@ResponseBody
	public JSONObject selectDeptById(@RequestParam Integer id, HttpServletRequest request) {
		JSONObject json = new JSONObject();
		try {
			Department d = departmentService.selectById(id);
			JsonUtil.buildBaseSuccess(json,d);
		} catch (Exception e) {
			JsonUtil.buildBaseFail(json,e.getMessage());
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		return json;
	}



}
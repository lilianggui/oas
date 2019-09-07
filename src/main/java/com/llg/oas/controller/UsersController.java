package com.llg.oas.controller;

import com.llg.oas.entity.Users;
import com.llg.oas.service.UsersService;
import com.alibaba.fastjson.JSONObject;
import com.jy.medusa.stuff.Pager;
import com.jy.medusa.stuff.param.MyRestrictions;
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
 * Created by llg on 2018-04-02 22:13:04
 */
@Controller
@RequestMapping("/users")
public class UsersController {

	private static final Logger logger = LoggerFactory.getLogger(UsersController.class);

	@Resource
	UsersService usersService;

	@RequestMapping(value = "/index.json", method = RequestMethod.GET)
	@ResponseBody
	public JSONObject index(@RequestParam Integer pageNum, Users param, HttpServletRequest request) {

		JSONObject json = new JSONObject();

		try {
			Pager<Users> pager = MyRestrictions.getPager().setPageSize(10).setPageNumber(pageNum);
			usersService.selectByGaze(param, pager);

			json.put("data", pager);
			json.put("result",0);
			json.put("msg","ok");
		} catch (Exception e) {
			json.put("result",1);
			json.put("msg","服务器异常：" + e.getMessage());
			json.put("data", null);
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		return json;
	}

	@RequestMapping(value = "/save.json", method = RequestMethod.POST)
	@ResponseBody
	public JSONObject save(Users param, HttpServletRequest request) {

		JSONObject json = new JSONObject();

		try {
			if(param != null) usersService.save(param);

			json.put("data", param);
			json.put("result",0);
			json.put("msg","ok");
		} catch (Exception e) {
			json.put("result",1);
			json.put("msg","服务器异常：" + e.getMessage());
			json.put("data", null);
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		return json;
	}

	@RequestMapping(value = "/update.json", method = RequestMethod.POST)
	@ResponseBody
	public JSONObject update(Users param, HttpServletRequest request) {

		JSONObject json = new JSONObject();

		try {
			if(param != null) usersService.updateSelective(param);

			json.put("data", param);
			json.put("result",0);
			json.put("msg","ok");
		} catch (Exception e) {
			json.put("result",1);
			json.put("msg","服务器异常：" + e.getMessage());
			json.put("data", null);
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		return json;
	}

	@RequestMapping(value = "/delete.json", method = RequestMethod.GET)
	@ResponseBody
	public JSONObject delete(@RequestParam Integer id, HttpServletRequest request) {

		JSONObject json = new JSONObject();

		try {
			int param = usersService.deleteById(id);

			json.put("data", param);
			json.put("result",0);
			json.put("msg","ok");
		} catch (Exception e) {
			json.put("result",1);
			json.put("msg","服务器异常：" + e.getMessage());
			json.put("data", null);
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		return json;
	}

}
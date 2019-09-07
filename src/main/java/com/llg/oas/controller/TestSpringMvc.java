package com.llg.oas.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestSpringMvc {

    @RequestMapping("/spring")
    @ResponseBody
    public JSONObject testSpring(){

        JSONObject json = new JSONObject();
        json.put("result","0");
        json.put("msg","成功");
        return json;

    }
}

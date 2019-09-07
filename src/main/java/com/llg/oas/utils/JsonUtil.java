package com.llg.oas.utils;

import com.alibaba.fastjson.JSONObject;
import com.jy.medusa.stuff.Pager;

public class JsonUtil {

    /**
     * 简单成功时返回
     * @param json 返回json
     * @return
     */
    public static JSONObject buildBaseSuccess(JSONObject json){
        if(json == null){
            json = new JSONObject();
        }
        json.put("result",0);
        json.put("msg","success");
        json.put("data",null);
        return json;
    }

    /**
     * 成功返回，有数据
     * @param json 返回json
     * @param data 返回数据
     * @return
     */
    public static JSONObject buildBaseSuccess(JSONObject json,Object data){
        if(json == null){
            json = new JSONObject();
        }
        json.put("result",0);
        json.put("msg","success");
        json.put("data",data);
        return json;
    }

    /**
     * 成功返回，分页
     * @param json 返回json
     * @param pager 分页数据
     * @return
     */
    public static JSONObject buildPageSuccess(JSONObject json,Pager pager){
        if(json == null){
            json = new JSONObject();
        }
        json.put("data", pager);
        json.put("result",0);
        json.put("msg","ok");
        return json;
    }



    /**
     * 失败返回
     * @param json 返回json
     * @param msg 错误信息
     * @return
     */
    public static JSONObject buildBaseFail(JSONObject json,String msg){
        if(json == null){
            json = new JSONObject();
        }
        json.put("result",1);
        json.put("msg",msg);
        json.put("data",null);
        return json;
    }

}

package com.java.controller;

import com.java.common.RequetsUtil;
import com.java.dto.Param;
import com.java.interceptor.NoLogin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by iss on 17/12/20.
 */
@Controller
public class Test {

    @NoLogin
    @ResponseBody
    @RequestMapping("login")
    public String testLogin(HttpServletRequest request){
        RequetsUtil.getIpAddr(request);
        return "login";
    }

    @ResponseBody
    @RequestMapping("noLogin")
    public String testNoLogin(){
        return "no login";
    }


    @ResponseBody
    @RequestMapping("testParam")
    public String testParam(@RequestBody Param param){

        return "success";
    }
}

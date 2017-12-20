package com.java;

import com.java.interceptor.NoLogin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by iss on 17/12/20.
 */
@Controller
public class Test {

    @NoLogin
    @ResponseBody
    @RequestMapping("login")
    public String testLogin(){
        return "login";
    }

    @ResponseBody
    @RequestMapping("noLogin")
    public String testNoLogin(){
        return "no login";
    }
}

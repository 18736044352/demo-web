package com.java.controller;

import com.java.interfaces.DubboInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by iss on 18/1/18.
 */
@Controller
@RequestMapping("dubbo/")
public class DubboController {

    @Autowired
    private DubboInterface dubboService;

    @ResponseBody
    @RequestMapping("/getMessage")
    public String getMessage(){
        System.out.println(dubboService.getDubboDto("hello"));
        return "";
    }
}

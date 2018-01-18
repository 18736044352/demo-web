package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by iss on 18/1/18.
 */
@Controller
@RequestMapping("dubbo/")
public class DubboController {

    @RequestMapping("/getMessage")
    public String getMessage(){
        return "";
    }
}

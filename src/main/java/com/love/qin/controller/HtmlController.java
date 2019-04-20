package com.love.qin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: html页面跳转
 * @author: LUNING
 * @create: 2019-04-18 15:37
 */
@Controller
@RequestMapping("/")
public class HtmlController {

    @GetMapping("/lovel")
    public String pc() {

        return "lovel";
    }

    @GetMapping("/loveq")
    public String mo() {

        return "loveq";
    }

}

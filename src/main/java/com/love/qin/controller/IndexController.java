package com.love.qin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotNull;

/**
 * @description: todo
 * @author: LUNING
 * @create: 2019-04-18 20:00
 */
@RestController
@RequestMapping(value = "test")
public class IndexController {

    @GetMapping(value = "/test")
    public void scoreList(){

    }
}

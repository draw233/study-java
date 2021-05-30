package com.mirai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author mirau on 2021/5/30.
 * @version 1.0
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/show.do")
    public ModelAndView show() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", "zhangxj");
        mv.setViewName("show");
        return mv;
    }

    @RequestMapping("hello.do")
    public @ResponseBody
    String hello() {
        return "hello";
    }
}

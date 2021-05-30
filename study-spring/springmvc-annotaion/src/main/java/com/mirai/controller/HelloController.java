package com.mirai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author mirau on 2021/5/30.
 * @version 1.0
 */
@Controller
public class HelloController {

    @GetMapping("hello")
    public @ResponseBody
    String helloAnnotation() {
        return "hello Annotation springmvc";
    }

    @RequestMapping(value = "/show")
    public ModelAndView show() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", "who are your?");
        mv.setViewName("show");
        return mv;
    }
}

package com.mirai.web;

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
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", "zhangxj");
        mv.setViewName("/show.jsp");
        return mv;

    }
}

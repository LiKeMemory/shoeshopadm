package com.hpe.ssa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

    @RequestMapping(value = "/edit/shoe/{sid}",method = RequestMethod.GET)
    public ModelAndView editShoeById(@PathVariable String sid){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("pages/productManagement/shoesEdit");
        return mv;
    }
}

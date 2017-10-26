package com.hpe.ssa.controller;

import com.hpe.ssa.pojo.Shoes;
import com.hpe.ssa.pojo.Shoes4List;
import com.hpe.ssa.pojo.Types;
import com.hpe.ssa.service.TypeService;
import com.hpe.ssa.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TypeController {

    @Autowired
    private TypeService typeService;

    @RequestMapping("/typemgmt")
    public String showTypeMgmtPage(){
        return "pages/productManagement/typesList";
    }

    @RequestMapping("/typesnum")
    @ResponseBody
    public String getTotalNum(){
        return String.valueOf(typeService.selectTypesNum());
    }

    @RequestMapping(value = "/get/typeslist",method = RequestMethod.GET)
    @ResponseBody
    public List<Types> showShoesList(String index){
        return typeService.selectTypes4List(Integer.parseInt(index));
    }

    @RequestMapping(value = "/edit/type/{tid}",method = RequestMethod.GET)
    public ModelAndView editTypeById(@PathVariable String tid){
        Types type = typeService.selectTypeDetailById(Integer.parseInt(tid));
        ModelAndView mv = new ModelAndView();
        mv.addObject("type", JsonUtils.objectToJson(type));
        mv.setViewName("pages/productManagement/typesEdit");
        return mv;
    }
}

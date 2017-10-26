package com.hpe.ssa.controller;

import com.hpe.ssa.pojo.Brands;
import com.hpe.ssa.service.BrandService;
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
public class BrandController {
    @Autowired
    private BrandService brandService;

    @RequestMapping("/brandmgmt")
    public String showTypeMgmtPage(){
        return "pages/productManagement/brandsList";
    }

    @RequestMapping("/get/brand/tnum")
    @ResponseBody
    public String getTotalNum(){
        return String.valueOf(brandService.selectBrandsNum());
    }

    @RequestMapping(value = "/get/brandslist",method = RequestMethod.GET)
    @ResponseBody
    public List<Brands> showBrandsList(String index){
        return brandService.selectBrands4List(Integer.parseInt(index));
    }

    @RequestMapping(value = "/edit/brand/{bid}",method = RequestMethod.GET)
    public ModelAndView editTypeById(@PathVariable String bid){
        Brands brand = brandService.selectBrandDetailById(Integer.parseInt(bid));
        ModelAndView mv = new ModelAndView();
        mv.addObject("brand", JsonUtils.objectToJson(brand));
        mv.setViewName("pages/productManagement/brandsEdit");
        return mv;
    }
    @RequestMapping(value = "/get/bname",method = RequestMethod.GET)
    @ResponseBody
    public List<Brands> getBrandNames(){
        return brandService.selectBrandNames();
    }
}

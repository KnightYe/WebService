package com.zhu.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zhu.bean.User;
import com.zhu.service.IUserService;

@Controller 
public class HomeController {
	@Resource
	IUserService userService;
	 /*** 
     * 首页 返回至/page/home.jsp页面 
     * @return 
     */  
    @RequestMapping("index")  
    public ModelAndView index(){
        //创建模型跟视图，用于渲染页面。并且指定要返回的页面为home页面
        ModelAndView mav = new ModelAndView("home");
        return mav;
    } 
    
    @RequestMapping("/index/{username}")
    public ModelAndView index(@PathVariable("username") String username) {
        ModelAndView mav = new ModelAndView("home");
        User bean = userService.getUserById(username);
        return mav;
    }
}

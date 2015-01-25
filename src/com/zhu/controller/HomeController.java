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
     * ��ҳ ������/page/home.jspҳ�� 
     * @return 
     */  
    @RequestMapping("index")  
    public ModelAndView index(){
        //����ģ�͸���ͼ��������Ⱦҳ�档����ָ��Ҫ���ص�ҳ��Ϊhomeҳ��
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

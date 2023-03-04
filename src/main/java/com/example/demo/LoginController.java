package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class LoginController {



	@RequestMapping("/")
	public ModelAndView index(HttpServletRequest request,HttpServletResponse response) {
		
			ModelAndView mv=new ModelAndView();
			
			
		
			mv.setViewName("index.jsp");
	return mv;
	}

	
	
	@RequestMapping("/adminlogin")
	public ModelAndView insertControl(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		String userName=request.getParameter("user");
		String Password=request.getParameter("pwd");
		
		if(userName.equals(Password)) {
			mv.setViewName("success.jsp");
		}
		return mv;
	}
}



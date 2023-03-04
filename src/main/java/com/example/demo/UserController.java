package com.example.demo;



import java.util.List;


import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@Autowired
	UserDAO dao;
	@Autowired
	FooditemsDAO fooddao;

	
	@RequestMapping("/insertuser")
	public ModelAndView insertControl(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		User u=new User();
		u.setUserid(Integer.parseInt(request.getParameter("userid")));
		u.setFname(request.getParameter("Fname"));
		u.setLname(request.getParameter("Lname"));
	     u.setUsername(request.getParameter("username"));
	     u.setPassword(request.getParameter("password"));
		User u1=dao.insertuser(u);
		if(u1!=null) {
			mv.setViewName("successuser.jsp");
		}
		return mv;
	}

//
//	@RequestMapping("/getalll")
//	public ModelAndView displayAll(HttpServletRequest request,HttpServletResponse response) {
//		
//		ModelAndView mv=new ModelAndView();
//		List<User> list= dao.getalll();
//		mv.setViewName("successbuy.jsp");
//		mv.addObject("list",list);
//		return mv;
//		
//}
	
	@RequestMapping("/getalll")
	public ModelAndView displayAll(HttpServletRequest request,HttpServletResponse response) {
		
		ModelAndView mv=new ModelAndView();
		List<Fooditems> list= fooddao.getall();
		mv.setViewName("extra.jsp");
		mv.addObject("list",list);
		return mv;
		
	}
}


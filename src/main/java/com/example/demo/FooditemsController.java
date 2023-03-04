package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FooditemsController {
	@Autowired
	FooditemsDAO dao;
	
	@RequestMapping("/insertfooditems")
	public ModelAndView insertControl(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Fooditems f=new Fooditems();
		f.setFoodid(Integer.parseInt(request.getParameter("foodid")));
		f.setCategory(request.getParameter("category"));
		f.setDish(request.getParameter("dish"));
          f.setFoodprice(Integer.parseInt(request.getParameter("foodprice")));	
		Fooditems f1=dao.insert(f);
		if(f1!=null) {
			mv.setViewName("successpurchase.jsp");
		}
		return mv;
	}

@RequestMapping("/getall")
public ModelAndView displayAll(HttpServletRequest request,HttpServletResponse response) {
	
	ModelAndView mv=new ModelAndView();
	List<Fooditems> list= dao.getall();
	mv.setViewName("displayfooditems.jsp");
	mv.addObject("list",list);
	return mv;
	
}
@RequestMapping("/editcontroller")
public ModelAndView edit(HttpServletRequest request,HttpServletResponse response) {
	
	ModelAndView mv=new ModelAndView();
	Fooditems f=new Fooditems();
	f.setFoodid(Integer.parseInt(request.getParameter("foodid")));
	f.setDish(request.getParameter("dish"));
	Fooditems f2=dao.edit(f);
	if(f2!=null)
	{
		mv.setViewName("successedit.jsp");
	}
	return mv;
}

@RequestMapping("/DeleteController")
public ModelAndView dlt(HttpServletRequest request,HttpServletResponse response) {
	
	ModelAndView mv=new ModelAndView();
	Fooditems f=new Fooditems();
	f.setFoodid(Integer.parseInt(request.getParameter("foodid")));

	String f2=dao.delete(f);
	if(f2!=null)
	{
		mv.setViewName("successdelete.jsp");
	}
	return mv;
}
	}



	



package com.example.demo;




import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class BankController {
	
	@Autowired
	BankDAO dao;
	
	@RequestMapping("/paycheck1")
	public ModelAndView paycheck(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Bank b=new Bank();
	b.setBname(request.getParameter("bname"));
	String bname=b.getBname();
	int bal=dao.getBalance(bname);
	System.out.println(bal);
	int foodpr=Integer.parseInt(request.getParameter("foodpr"));
	
	if(bal>foodpr) {
		mv.setViewName("successpurchasedd.jsp");
	}
	else {
		mv.setViewName("failpurchasedd.jsp");
	}
	return mv;
	}

	
	@RequestMapping("/insertbank")
	public ModelAndView insertControl(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Bank b=new Bank();
		b.setBid(Integer.parseInt(request.getParameter("Bid")));
		b.setBname(request.getParameter("bname"));
		b.setBbalance(Integer.parseInt(request.getParameter("Bbalance")));
	  //  float bb=b.getBbalance();
		Bank b1=dao.insert(b);
		if(b1!=null) {
		//	if(b.equals(b1)) {
				
			
			mv.setViewName("bankbal.jsp");
		}
			else
			{
				mv.setViewName("payfail.jsp");
			}
		
	
		return mv;
	}

}

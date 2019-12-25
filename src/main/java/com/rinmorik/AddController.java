package com.rinmorik;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mysql.jdbc.PreparedStatement.ParseInfo;
import com.rinmorik.services.AddService;


@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response){
		
		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
		
		AddService as = new AddService();
		int k = as.add(i, j);
		 
		//System.out.println("Hiiii");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Display.jsp");
		mv.addObject("result",k);
		return mv;
	}

}

package com.newlecture.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HomeController{
	
	@RequestMapping("index")
	@ResponseBody
	public String index() {
		return "Hello Index";
	}
	/*public void index(HttpServletResponse response) {
		PrintWriter out;
		try {
			out = response.getWriter();
			out.println("Hello Index");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/
	


//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		// TODO Auto-generated method stub
//		
//		ModelAndView mv = new ModelAndView("root.index");
//		mv.addObject("data","Hello Spring MVC");
////		mv.setViewName("index.jsp");
//		return mv;
//	}

	
}

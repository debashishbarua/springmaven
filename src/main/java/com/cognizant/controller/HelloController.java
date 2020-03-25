package com.cognizant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("hello")
	public ModelAndView sayHello() {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("hello");
		return mv;
	}

}

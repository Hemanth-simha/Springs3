package com.jspiders.webapp.first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyControllerClass {
	
	@RequestMapping("/display")
	public ModelAndView display()
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("sample");
		return mv;
	}

	@RequestMapping("/sendPrimitive")
	public ModelAndView sendPrimitiveDate() {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("displayPrimitive");
		mv.addObject("id",101);
		mv.addObject("name","king");
		return mv;
	}
	
	@RequestMapping("/getStudent")
	public ModelAndView getStudent()
	{
		ModelAndView mv= new ModelAndView();
		Student student = new Student();
		student.setId(101);
		student.setName("king");
		mv.addObject("student",student);
		
		mv.setViewName("StudentDetails");
		
		return mv;
	}
	
}

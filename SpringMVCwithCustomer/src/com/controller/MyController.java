
package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/Home")
	public ModelAndView details(Customer customer){
		return new ModelAndView("hello", "customer", customer);
	}
}
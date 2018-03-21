package com.example.hylandcentral.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {

	@RequestMapping(path="/employees", method=RequestMethod.GET)
	public String goHome(){
		return "employees";
	}
}

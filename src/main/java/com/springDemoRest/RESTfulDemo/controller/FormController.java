package com.springDemoRest.RESTfulDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springDemoRest.RESTfulDemo.model.Student;

@Controller
@RequestMapping("/student")
public class FormController {

	@RequestMapping("/form")
	public String showForm(Model theModel) {
		// create student object
		Student theStudent = new Student();
				
		// add student object to the model
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		
		return "confirmation";
	}
	
}

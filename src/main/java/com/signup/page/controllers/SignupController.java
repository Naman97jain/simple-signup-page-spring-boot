package com.signup.page.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.signup.page.entities.SignupData;

@Controller
public class SignupController {
	@GetMapping("/form")
	public String getForm(Model model) {
		model.addAttribute("signupData", new SignupData());
		System.out.println(new SignupData());
		return "form";
	}
	
	@PostMapping("/process")
	public String processForm(@Valid @ModelAttribute("signupData") SignupData signupData, BindingResult result) {
		if(result.hasErrors()) {
			System.out.println(result.getAllErrors());
			
			return "form";	
		}
		System.out.println(signupData);
		return "success";
	}
}

package com.example.inquirydemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {
	
	@GetMapping("/form")
	public String inputForm(@ModelAttribute FormData formData) {
		return "form";
	}
 
	@PostMapping("/result")
	public String Result(@ModelAttribute FormData formData) {
		return "result";
	}
}

package com.herokuapp.naviochan2.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TestController {
	
	@GetMapping("/")
	public String test(Model model) {
		model.addAttribute("key", "value");
		
		return "test";
	}
}

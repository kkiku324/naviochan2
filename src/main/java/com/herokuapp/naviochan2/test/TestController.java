package com.herokuapp.naviochan2.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class TestController {
	public String test(Model model) {
		model.addAttribute("key", "value");
		
		return "test";
	}
}

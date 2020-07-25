package com.herokuapp.naviochan2.test;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class TestController {
	
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public TestController(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@GetMapping("/")
	public String test(Model model) {
		//String sql = "SELECT id, name, body FROM comments ORDER BY id DESC";
		String sql = "SELECT id, name, body FROM comments WHERE id = 1";
		
		Map<String, Object> map = jdbcTemplate.queryForMap(sql);
		
		model.addAttribute("id", map.get("id"));
		model.addAttribute("name", map.get("name"));
		model.addAttribute("body", map.get("body"));
		
		return "test";
	}
}

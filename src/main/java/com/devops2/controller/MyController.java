package com.devops2.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/")
	public String welcome() {
		return "Welcome to rest api...it's working...docker-compose";
	}
	
	@GetMapping("/about")
	public Map<String,String> about() {
		Map<String, String> map = new HashMap<>();
		
		map.put("name", "Md Hamid Hussain");
		map.put("address", "Shivganj, Narkatiaganj");
		map.put("mobile", "9354804504");
		
		return map;
		
	}
}

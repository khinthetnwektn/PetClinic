package com.springStudy.petClicnic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping({"", "/", "/welcome", "/welcome.html"})
	public String welcome() {
		return "welcome";
	}
}

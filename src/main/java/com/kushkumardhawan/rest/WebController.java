package com.kushkumardhawan.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	
	@RequestMapping(value="/hello")
	public String hello() {
		return "hello";
	}

}

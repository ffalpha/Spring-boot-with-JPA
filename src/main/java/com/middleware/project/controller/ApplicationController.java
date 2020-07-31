package com.middleware.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ApplicationController {

	   @ResponseBody
		@RequestMapping("/h")
		public String Hello() {
			return "Hello From Spring";
		}
	    @ResponseBody
	    @RequestMapping("/ak")
		public String Hellos() {
			return "Hesafng";
		}
}


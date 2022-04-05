package com.jforce.tr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class StudentController {
	@RequestMapping(path = "/hello",method = RequestMethod.GET)
	public String hello() {
		return "Hello metodum calisti.";
	}
}

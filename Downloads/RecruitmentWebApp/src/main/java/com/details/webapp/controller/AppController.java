package com.details.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.details.webapp.mapper.RestMapper;
import com.details.webapp.pojo.ApplicationForm;
import com.google.gson.Gson;

@RestController
public class AppController {

	@Autowired
	RestMapper restMapper;

	@RequestMapping(value = "/hello")
	public String sayHello() {

		return "hello";
	}

	@RequestMapping(value="/saveApplication",method = RequestMethod.POST)
	public String recieveApplication(@RequestBody ApplicationForm input) {
		restMapper.mapForSave(input);
		return "dataSaved";

	}
}

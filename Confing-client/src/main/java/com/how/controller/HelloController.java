package com.how.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class HelloController {

	@Value("${msg:Hello world - Config Server is not working..pelase check}")
	private String msg;

	@Value("${message:Hello world - Config Server is not working..pelase check}")
	private String message;

	@RequestMapping("/msg")
	String getMsg() {
		return this.msg;
	}
	
	@RequestMapping("/message")
	String getMessage() {
		return this.message;
	}

}

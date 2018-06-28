package com.nurettinyakit.controler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {
	
	@Value("${words}")
	private String words;


	@GetMapping("/")
	public String getWord() {
		String [] wordArr = words.split(",");
		int i=(int)Math.round(Math.random()* ( wordArr.length-1) );
		return wordArr[i];
	}
	
}

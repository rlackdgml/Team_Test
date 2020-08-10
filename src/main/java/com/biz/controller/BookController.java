package com.biz.controller;

import org.springframework.stereotype.Controller;

@Controller
public class BookController {
	
	public String List() {
		return "book/list" ;
	}

}

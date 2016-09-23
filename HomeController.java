package com.hello.world.app;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(value="/greet", method = RequestMethod.GET)
	public String greetings(){
		return "Hello World";
	}
}

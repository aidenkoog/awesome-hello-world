package io.github.aidenkoog.spring_boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@RequestMapping("/")
	public String index() {
		return "Hello World! AidenKooG!";
	}
}
package com.example.spring_boot_1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class MessageController 
{
	@GetMapping("/message")
	public String getMessage (Model m) {
			m.addAttribute("msg","Hello ! Welcome to Spring Boot");
			return "message";
		}
}

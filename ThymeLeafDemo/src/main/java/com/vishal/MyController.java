package com.vishal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@Autowired
	Contact contact;
	
	@RequestMapping("/message")
	public String getMessage(Model model) {
		model.addAttribute("contact", contact);
		return "hello";
	}
}

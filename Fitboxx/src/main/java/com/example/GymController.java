package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GymController {
	@RequestMapping("home")
	public java.lang.String String() {
		System.out.println("hiii");;
	return "home.jsp";
	}
}

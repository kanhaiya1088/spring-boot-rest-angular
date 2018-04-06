package com.demo.spring.boot.angular.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Kanhaiya.Sahu
 *
 */
@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		return "index";
	}

}

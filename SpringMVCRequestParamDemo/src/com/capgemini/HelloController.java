package com.capgemini;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String display(@RequestParam("username") String username, @RequestParam("pass") String password, Model model)
	{
		if(password.equals("admin"))
		{
			String msg="Hello"+" " +username;
			model.addAttribute("message", msg);
			return "viewpage";
		}
		else
		{
			String msg="Sorry"+" " +username+" " +"You entered incorrect password";
			model.addAttribute("message", msg);
			return "error";
		}
	}
}

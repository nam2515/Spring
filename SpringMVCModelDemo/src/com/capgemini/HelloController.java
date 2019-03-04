package com.capgemini;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String display(HttpServletRequest request, Model model)
	{
		String username= request.getParameter("username");
		String password=request.getParameter("pass");
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

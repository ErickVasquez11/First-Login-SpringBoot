package com.erickvasquez.documentos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainControllers {

	@GetMapping("/login")
	public String getLogin()	{
		return "login";
	}
}

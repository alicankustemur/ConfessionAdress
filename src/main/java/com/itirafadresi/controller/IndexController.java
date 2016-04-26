package com.itirafadresi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController
{

	@RequestMapping("/")
	public String view(Model model)
	{
		model.addAttribute("title", "İtiraf Adresi");
		return "index";
	}

	@RequestMapping("/validation")
	public String validation(Model model)
	{
		model.addAttribute("title", "İtiraf Adresi");
		return "validation";
	}

}

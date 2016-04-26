package com.itirafadresi.confess.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController
{

	@RequestMapping("")
	public String view(Model model)
	{
		model.addAttribute("title", "İtiraf Adresi");
		return "index";
	}

}

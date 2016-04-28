package com.itirafadresi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itirafadresi.confess.service.ConfessService;

@Controller
@RequestMapping("/")
public class IndexController
{

	@Autowired
	private ConfessService confessService;

	@RequestMapping("")
	public String view(Model model)
	{
		model.addAttribute("title", "İtiraf Adresi");
		model.addAttribute("confessions", confessService.getAllConfess());

		return "index";
	}

}

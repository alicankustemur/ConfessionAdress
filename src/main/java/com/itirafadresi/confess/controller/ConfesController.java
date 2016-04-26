package com.itirafadresi.confess.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itirafadresi.confess.domain.Confess;
import com.itirafadresi.confess.service.ConfessService;

@Controller
@RequestMapping("/confess")
public class ConfesController
{

	@Autowired
	private ConfessService service;

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String save(@ModelAttribute Confess confess)
	{
		service.saveConfess(confess);
		return "redirect:/";
	}

}

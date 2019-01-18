package com.org.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.org.entity.Item;
import com.org.service.OnlineService;

@Controller
public class ItemController {
	
	
	@Autowired
	private OnlineService onlineService;

	public OnlineService getOnlineService() {
		return onlineService;
	}

	public void setOnlineService(OnlineService onlineService) {
		this.onlineService = onlineService;
	}
	

	
	@RequestMapping(value = "/registerItem", method = RequestMethod.GET)
	public String registerPage(Model model) {

		model.addAttribute("item", new Item());

		return "registerItem";

	}
	
	
	@RequestMapping(value = "/registerSuccess", method = RequestMethod.POST)
	public ModelAndView registerSuccess(@Valid @ModelAttribute("item") Item item, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {

			return new ModelAndView("registerItem");

		}
		getOnlineService().registerItem(item);
		ModelAndView modelAndView = new ModelAndView("welcome");
		modelAndView.addObject("item", item);
		return modelAndView;

	}
	
	@ModelAttribute
	public void headerMessage(Model model) {

		model.addAttribute("headerMessage","Online Shop By Akash");

	}
	
	
}

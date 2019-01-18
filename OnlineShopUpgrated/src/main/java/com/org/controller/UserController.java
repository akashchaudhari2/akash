package com.org.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.org.entity.Item;
import com.org.entity.User;

import com.org.service.OnlineShopService;

@Controller
public class UserController {

	
	private OnlineShopService onlineShopService;

	public OnlineShopService getOnlineShopService() {
		return onlineShopService;
	}

	@Autowired(required=true)
	@Qualifier(value="onlineShopService")

	public void setOnlineShopService(OnlineShopService onlineShopService) {
		this.onlineShopService = onlineShopService;
	}
	
	
	@RequestMapping(value = "/registeruser", method = RequestMethod.GET)
	public String registerPage(Model model) {

		model.addAttribute("user", new User());

		return "registeruser";

	}
	
	
	@RequestMapping(value = "/registeruser", method = RequestMethod.POST)
	public ModelAndView registerSuccess(@Valid @ModelAttribute("user") User user, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {

			return new ModelAndView("registeruser");

		}
		getOnlineShopService().registerUser(user);
		ModelAndView modelAndView = new ModelAndView("welcome");
		modelAndView.addObject("user", user);
		return modelAndView;

	}
	
	
	@ModelAttribute
	public void headerMessage(Model model) {

		model.addAttribute("headerMessage","Online Shop By Akash");

	}
	
	
	
	
}

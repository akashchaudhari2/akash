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

import com.org.entity.Category;
import com.org.entity.OrderOnlineEntity;

import com.org.service.OnlineShopService;

@Controller
public class OrderController {

	
	

	private OnlineShopService onlineShopService;

	public OnlineShopService getOnlineShopService() {
		return onlineShopService;
	}

	@Autowired(required = true)
	@Qualifier(value = "onlineShopService")

	public void setOnlineShopService(OnlineShopService onlineShopService) {
		this.onlineShopService = onlineShopService;
	}
	
	
	@RequestMapping(value = "/registerorder", method = RequestMethod.GET)
	public String registerCat(Model model) {

		model.addAttribute("order", new OrderOnlineEntity());

		return "registerorder";

	}
	
	
	
	@RequestMapping(value = "/registerorder", method = RequestMethod.POST)
	public ModelAndView registerCategory(@Valid @ModelAttribute("order") OrderOnlineEntity order, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {

			return new ModelAndView("registerorder");

		}
		getOnlineShopService().registerOrder(order);
		ModelAndView modelAndView = new ModelAndView("welcome");
		modelAndView.addObject("order", order);
		return modelAndView;

	}
	
	@ModelAttribute
	public void headerMessage(Model model) {

		model.addAttribute("headerMessage","Online Shop By Akash");

	}
	
	
}

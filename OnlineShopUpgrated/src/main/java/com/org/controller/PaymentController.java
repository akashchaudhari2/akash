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
import com.org.entity.Payment;

import com.org.service.OnlineShopService;

@Controller
public class PaymentController {

	
	private OnlineShopService onlineShopService;

	public OnlineShopService getOnlineShopService() {
		return onlineShopService;
	}

	@Autowired(required=true)
	@Qualifier(value="onlineShopService")

	public void setOnlineShopService(OnlineShopService onlineShopService) {
		this.onlineShopService = onlineShopService;
	}
	
	@RequestMapping(value = "/registerpayment", method = RequestMethod.GET)
	public String registerPage(Model model) {

		model.addAttribute("payment", new Payment());

		return "registerpayment";

	}
	
	
	@RequestMapping(value = "/registerpayment", method = RequestMethod.POST)
	public ModelAndView registerSuccess(@Valid @ModelAttribute("payment") Payment payment, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {

			return new ModelAndView("registerpayment");

		}
		getOnlineShopService().registerPayment(payment);
		ModelAndView modelAndView = new ModelAndView("welcome");
		modelAndView.addObject("payment", payment);
		return modelAndView;

	}
	
	@ModelAttribute
	public void headerMessage(Model model) {

		model.addAttribute("headerMessage","Online Shop By Akash");

	}
	
	
	
}

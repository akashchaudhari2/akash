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
import com.org.entity.Payment;
import com.org.service.OnlineService;

@Controller
public class PaymentController {

	
	@Autowired
	private OnlineService onlineService;

	public OnlineService getOnlineService() {
		return onlineService;
	}

	public void setOnlineService(OnlineService onlineService) {
		this.onlineService = onlineService;
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
		getOnlineService().registerPayment(payment);
		ModelAndView modelAndView = new ModelAndView("welcome");
		modelAndView.addObject("payment", payment);
		return modelAndView;

	}
	
	@ModelAttribute
	public void headerMessage(Model model) {

		model.addAttribute("headerMessage","Online Shop By Akash");

	}
	
	
	
}

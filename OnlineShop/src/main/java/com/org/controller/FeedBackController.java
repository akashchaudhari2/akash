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

import com.org.entity.Category;
import com.org.entity.Feedback;
import com.org.service.OnlineService;

@Controller
public class FeedBackController {

	
	@Autowired
	private OnlineService onlineService;
	public OnlineService getOnlineService() {
		return onlineService;
	}

    public void setOnlineService(OnlineService onlineService) {
		this.onlineService = onlineService;
	}
	
    @RequestMapping(value = "/registerfeedback", method = RequestMethod.GET)
	public String registerCat(Model model) {

		model.addAttribute("feedback", new Feedback());

		return "registerfeedback";

	}
	
	
	
	@RequestMapping(value = "/registerfeedback", method = RequestMethod.POST)
	public ModelAndView registerCategory(@Valid @ModelAttribute("feedback") Feedback feedback, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {

			return new ModelAndView("registerfeedback");

		}
		getOnlineService().registerfeedback(feedback);
		ModelAndView modelAndView = new ModelAndView("welcome");
		modelAndView.addObject("feedback", feedback);
		return modelAndView;

	}
	
    
	@ModelAttribute
	public void headerMessage(Model model) {

		model.addAttribute("headerMessage","Online Shop By Akash");

	}
	
	
	
}

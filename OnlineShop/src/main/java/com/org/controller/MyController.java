package com.org.controller;

import javax.xml.bind.annotation.XmlRegistry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.org.entity.Category;
import com.org.entity.Item;
import com.org.entity.OnlineCredentials;
import com.org.service.OnlineService;

@Controller
public class MyController {

	@Autowired
	private OnlineService onlineService;

	public OnlineService getOnlineService() {
		return onlineService;
	}

	public void setOnlineService(OnlineService onlineService) {
		this.onlineService = onlineService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homePage() {

		return "home";

	}

	@RequestMapping(value = "/Alldata", method = RequestMethod.GET)
	public String AllData() {

		return "Alldata";

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(Model model) {

		model.addAttribute("onlineCredentials", new OnlineCredentials());
		return "login";

	}

	@RequestMapping(value = "/loginSuccess", method = RequestMethod.POST)
	public ModelAndView loginSucess(@ModelAttribute("onlineCredentials") OnlineCredentials onlineCredentials,
			BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {

			return new ModelAndView("login");

		}

		ModelAndView modelAndView = new ModelAndView("welcome");

		Item item = getOnlineService().validateItemService(onlineCredentials.getEmail(),
				onlineCredentials.getPassword());

		if (item != null) {

			modelAndView.addObject("item", item);

		}

		else {

			modelAndView = new ModelAndView("notFound");

		}

		return modelAndView;

	}

	@ModelAttribute
	public void headerMessage(Model model) {

		model.addAttribute("headerMessage", "Welcome To OnlineShopping Project");

	}

}

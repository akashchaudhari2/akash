package com.org.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.org.entity.Item;
import com.org.entity.OnlineCredentials;
import com.org.service.OnlineShopService;

@Controller
public class MyController {

	private OnlineShopService onlineShopService;

	public OnlineShopService getOnlineShopService() {
		return onlineShopService;
	}

	@Autowired(required = true)
	@Qualifier(value = "onlineShopService")

	public void setOnlineShopService(OnlineShopService onlineShopService) {
		this.onlineShopService = onlineShopService;
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

		model.addAttribute("item", new Item());
		return "login";

	}

	@RequestMapping(value = "/loginSuccess", method = RequestMethod.POST)
	public ModelAndView loginSucess(@ModelAttribute("item") Item item, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {

			return new ModelAndView("login");

		}

		ModelAndView modelAndView = new ModelAndView("welcome");

		Item item1 = getOnlineShopService().ItemById(item.getItemId());

		if (item1 != null) {

			modelAndView.addObject("item", item1);

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

/*
 * @org.springframework.web.bind.annotation.InitBinder public void
 * InitBinder(WebDataBinder dataBinder) { StringTrimmerEditor
 * stringTrimmerEditor = new StringTrimmerEditor(true);
 * dataBinder.registerCustomEditor(String.class, stringTrimmerEditor); }
 */

/*
 * @RequestMapping(value = "/items", method = RequestMethod.GET) public String
 * listItems(Model model) {
 * 
 * model.addAttribute("item", new Item()); model.addAttribute("listItems",
 * this.onlineShopService.listItem());
 * 
 * return "registeritem"; }
 * 
 * @RequestMapping(value = "/item/add", method = RequestMethod.POST) public
 * String addItem(@ModelAttribute("item") Item item) {
 * 
 * if (item.getItemId() == 0) {
 * 
 * this.onlineShopService.addItem(item);
 * 
 * }
 * 
 * else {
 * 
 * this.onlineShopService.updateItem(item);
 * 
 * }
 * 
 * return "redirect:/items"; }
 * 
 * @RequestMapping("/remove/{itemId}") public String
 * removeItem(@PathVariable("itemId") int id) {
 * 
 * this.onlineShopService.removeItem(id); return "redirect:/items";
 * 
 * }
 * 
 * @RequestMapping("/edit/{itemId}") public String
 * editItem(@PathVariable("itemId") int id, Model model) {
 * model.addAttribute("person", this.onlineShopService.ItemById(id));
 * model.addAttribute("listPersons", this.onlineShopService.listItem());
 * 
 * return "registeritem"; }
 */

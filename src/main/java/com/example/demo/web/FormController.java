package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.domain.User;

@Controller
public class FormController {

	@RequestMapping("/")
	public String getForm(Model model) {
		model.addAttribute("formData", new User());
		return "index";
		
	}
	@RequestMapping(value="/success", method=RequestMethod.POST)
	public String successSubmit(User user,RedirectAttributes attr)
	{
		attr.addFlashAttribute("user", user);
		return "redirect:/printData";
	}
	@RequestMapping("/printData")
	public String printData(User user)
	{
		return "success";
	}
}

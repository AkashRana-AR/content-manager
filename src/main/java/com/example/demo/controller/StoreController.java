package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entities.LoginData;

@Controller
public class StoreController {

	@GetMapping("/storeForm")
	public String openForm(Model model) {
		model.addAttribute("loginData", new LoginData());
		return "storeForm";
	}

	@PostMapping("/submitStoreLogin")
	public String processStoreForm(@Valid @ModelAttribute("loginData") LoginData loginData, BindingResult result) {
		
		if(result.hasErrors()) {
			System.out.println(result);
			return "storeForm";
		}
		
		System.out.println(loginData);
		return "successStoreForm";
	}
}

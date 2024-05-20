package com.example.demo.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.model.TaxLogic;

@Controller
@SessionAttributes({ "uname", "sal", "gender", "tax"})

public class TaxController {
	@GetMapping("showTax")
	public String showTax() {
		System.out.println("Inside the income tax details");
		return "incomedetails";
	}
	@PostMapping("showTaxDetails")
	public String showTaxDetails(@RequestParam("username") String username, @RequestParam("salary") int salary,@RequestParam("gender") String gender,@ModelAttribute TaxLogic objtax,Model model) {

		float tax = objtax.getTax(salary, gender);
		model.addAttribute("username", username);
		model.addAttribute("salary", salary);
		model.addAttribute("gender", gender);
		model.addAttribute("tax", tax);
		
		return "taxdisplay";
	}

}

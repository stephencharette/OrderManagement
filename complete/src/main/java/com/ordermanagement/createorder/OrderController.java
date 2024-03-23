package com.ordermanagement.createorder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {

	@GetMapping("/order")
	public String orderForm(Model model) {
		model.addAttribute("order", new Order());
		return "order";
	}

	@PostMapping("/order")
	public String orderSubmit(@ModelAttribute Order order, Model model) {
		model.addAttribute("order", order);
		return "result";
	}
}

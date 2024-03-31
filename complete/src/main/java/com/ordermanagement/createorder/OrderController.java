package com.ordermanagement.createorder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {

	private final MenuItemRepository menuItemRepository;

	public OrderController(MenuItemRepository menuItemRepository) {
		this.menuItemRepository = menuItemRepository;
	}

	@GetMapping("/order")
	public String orderForm(Model model) {
		Iterable<MenuItem> menuItems = menuItemRepository.findAll();
		model.addAttribute("menuItems", menuItems);
		model.addAttribute("order", new Order());
		return "order";
	}

	@PostMapping("/order")
	public String orderSubmit(@ModelAttribute Order order, Model model) {
		model.addAttribute("order", order);
		return "result";
	}
}

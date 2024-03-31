package com.ordermanagement.createorder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {

	private final MenuItemRepository menuItemRepository;
	private final SizeRepository sizeRepository;
	private final OrderRepository orderRepository;

	public OrderController(MenuItemRepository menuItemRepository, SizeRepository sizeRepository, OrderRepository orderRepository) {
		this.menuItemRepository = menuItemRepository;
		this.sizeRepository = sizeRepository;
		this.orderRepository = orderRepository;
	}

	@GetMapping("/order")
	public String orderForm(Model model) {
		Iterable<MenuItem> menuItems = menuItemRepository.findAll();
		model.addAttribute("menuItems", menuItems);

		Iterable<Size> sizes = sizeRepository.findAll();
		model.addAttribute("sizes", sizes);

		model.addAttribute("order", new Order());
		return "order";
	}

	@PostMapping("/order")
	public String orderSubmit(@ModelAttribute Order order, Model model) {
		orderRepository.save(order);

		model.addAttribute("order", order);
		return "result";
	}
}

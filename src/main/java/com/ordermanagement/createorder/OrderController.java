package com.ordermanagement.createorder;

import java.math.BigDecimal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
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

	public static class YourRequestClass {
    private Long menuItemId;
    private Long sizeId;

    public Long getMenuItemId() {
			return menuItemId;
		}

		public void setMenuItemId(Long menuItemId) {
			this.menuItemId = menuItemId;
		}

		public Long getSizeId() {
			return sizeId;
		}

		public void setSizeId(Long sizeId) {
			this.sizeId = sizeId;
		}
	}

	public class YourResponseClass {
		private BigDecimal total;

		public YourResponseClass(BigDecimal total) {
			this.total = total;
		}

		public BigDecimal getTotal() {
			return total;
		}

		public void setTotal(BigDecimal total) {
			this.total = total;
		}
	}

	@PostMapping("/calculate_total")
	@ResponseBody
	public YourResponseClass calculateTotal(@RequestBody YourRequestClass request) {		
		MenuItem menuItem = menuItemRepository.findById(request.getMenuItemId()).get();
		Size size = sizeRepository.findById(request.getSizeId()).get();
		return new YourResponseClass(Order.calculateTotal(menuItem, size));
		// return new BigDecimal(0.5);
	}

	@GetMapping("/order")
	public String showCreateOrder(Model model) {
		Iterable<MenuItem> menuItems = menuItemRepository.findAll();
		model.addAttribute("menuItems", menuItems);

		Iterable<Size> sizes = sizeRepository.findAll();
		model.addAttribute("sizes", sizes);

		model.addAttribute("order", new Order());
		return "displayCreateOrder";
	}

	@PostMapping("/order")
	public String handleOrderSubmit(@ModelAttribute Order order, Model model) {
		order.setCustomerId(GetCustomer().getId());
		orderRepository.save(order);

		Size size = sizeRepository.findById(order.getSizeId()).get();
		model.addAttribute("size", size);

		MenuItem menuItem = menuItemRepository.findById(order.getMenuItemId()).get();
		model.addAttribute("menuItem", menuItem);

		BigDecimal orderTotal = Order.calculateTotal(menuItem, size);
		model.addAttribute("orderTotal", orderTotal);

		Customer customer = GetCustomer();
		order.setCustomerId(customer.getId());

		model.addAttribute("order", order);
		return "result";
	}

	public Customer GetCustomer() {
		Customer customer = new Customer(1L);

		return customer;
	}
}

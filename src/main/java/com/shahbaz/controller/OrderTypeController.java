package com.shahbaz.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.shahbaz.model.OrderMethod;
import com.shahbaz.service.IOrderTypeService;

@Controller
@RequestMapping("order")
public class OrderTypeController {
	@Autowired
	private IOrderTypeService service;
	
	@GetMapping("/register")
	public String getFormPage() {
		return "OrderRegister";
	}
	
	@PostMapping("/saveorder")
	public String processOrderFormPage(@ModelAttribute OrderMethod order,RedirectAttributes attrs) {
		//using service
		String message=service.saveOrder(order);
		System.out.println("message: "+message);
		System.out.println(order);
		attrs.addFlashAttribute("message", message);
		return "redirect:register";
	}
	
	@GetMapping("/all")
	public String getAllOrdersList(Map<String,Object> map) {
		//use service
		List<OrderMethod> lists=service.getAllOrders();
		map.put("list", lists);
		return "AllOrdersList";
	}
}

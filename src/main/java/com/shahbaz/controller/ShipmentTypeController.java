package com.shahbaz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shahbaz.model.ShipmentType;
import com.shahbaz.service.IShipmentTypeService;

@Controller
@RequestMapping("/st")
public class ShipmentTypeController {
	@Autowired
	private IShipmentTypeService service;
	
	//1.show register page
	@GetMapping("/register")
	public String showReg() {
		return "ShipmentTypeRegister";
	}
	
	//2.save
	@PostMapping("/save")
	public String save(@ModelAttribute ShipmentType shipmentType,Model model) {
		Integer id=service.saveShipmentType(shipmentType);
		String message="ShipmentType "+id+" saved";
		model.addAttribute("message", message);
		return "ShipmentTypeRegister";
	}
	
	//3.display all
	@GetMapping("/all")
	public String showAll(Model model) {
		model.addAttribute("list", service.getAllShipmentType());
		return "ShipmentTypeData";
	}
	
	//4.delete by id
	@GetMapping("/delete")
	public String deleteOne(@RequestParam Integer id,Model model) {
		service.deleteShipmentType(id);
		model.addAttribute("message", "ShipmentTYpe with id "+id+" deleted successfully");
		model.addAttribute("list",  service.getAllShipmentType());
		return "ShipmentTypeData";
	}
	
	//5. show edit
	@GetMapping("/edit")
	public String showEdit(@RequestParam Integer id,Model model) {
		model.addAttribute("shipmentType", service.getOneShipmentType(id));
		return "ShipmentTypeEdit";
		
	}
	
	//6. update
	@PostMapping("/update")
	public String doUpdate(@ModelAttribute ShipmentType shipmentType,Model model) {
		service.updateShipmentType(shipmentType);
		model.addAttribute("message", "ShipmentType with id "+shipmentType.getId()+" updated successfully");
		model.addAttribute("list", service.getAllShipmentType());
		return "ShipmentTypeData";
	}
}

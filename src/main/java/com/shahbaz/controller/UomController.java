package com.shahbaz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.shahbaz.model.Uom;
import com.shahbaz.service.IUomService;

@Controller
@RequestMapping("/uom")
public class UomController {
	@Autowired
	private IUomService service;
	
	//1.show register page
	@GetMapping("/register")
	public String showReg() {
		
		return "UomRegister";
	}
	
	//2.on click save
	@PostMapping("/save")
	public String saveUom(@ModelAttribute Uom uom,RedirectAttributes attrs) {
		//use service
		Integer id=service.saveUom(uom);
		String message="Uom saved with id: "+id;
		//sending data to UI
		//model.addAttribute("message", message);
		attrs.addFlashAttribute("message", message);
		return "redirect:register";
	}
	
	@GetMapping("/all")
	public String getAllUoms(Model model) {
		List<Uom> list=service.getAllUoms();
		model.addAttribute("list", list);
		return "UomData";
	
	}
	
	//4. delete one uom
	@GetMapping("/delete")
	public String deleteUom(@RequestParam Integer id,Model model) {
		service.deleteUom(id);
		model.addAttribute("message", "UOM record with id "+id+" deleted successfully");
		model.addAttribute("list", service.getAllUoms());
		return "UomData";
	}
	
	//5. show uom edit
	@GetMapping("/edit")
	public String showEdit(@RequestParam Integer id,Model model) {
		Uom uom=service.getOneUom(id);
		model.addAttribute("uom", uom);
		return "UomEdit";
	}
	
	//6.Update UOM
	@PostMapping("/update")
	public String updateUom(@ModelAttribute Uom uom,Model model) {
		service.updateUom(uom);
		model.addAttribute("message", "UOM with id: "+uom.getId()+" updated sucessfully");
		model.addAttribute("list", service.getAllUoms());
		return "UomData";
	}
	
}

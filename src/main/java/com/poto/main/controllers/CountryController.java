package com.poto.main.controllers;

import java.util.Optional;

import com.poto.main.models.Country;
import com.poto.main.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class CountryController {
	
private CountryService countryService;
	
	//Get All Countrys
	@GetMapping("countries")
	public String findAll(Model model){		
		model.addAttribute("countries", countryService.findAll());
		return "country";
	}	
	
	@RequestMapping("countries/findById") 
	@ResponseBody
	public Optional<Country> findById(Integer id)
	{
		return countryService.findById(id);
	}
	
	//Add Country
	@PostMapping(value="countries/addNew")
	public String addNew(Country country) {
		countryService.save(country);
		return "redirect:/countries";
	}	
	
	@RequestMapping(value="countries/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Country country) {
		countryService.save(country);
		return "redirect:/countries";
	}
	
	@RequestMapping(value="countries/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		countryService.delete(id);
		return "redirect:/countries";
	}
}

package com.ibra.helloSpring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	//@RequestMapping("/home")
	@GetMapping("/home")
	//@ResponseBody	
	 public String home(@RequestParam String name, ModelMap modelMap) {
		
		
		System.out.println(name);			
		modelMap.put("name", name);
		
	  return "pages/home";
	 }

}

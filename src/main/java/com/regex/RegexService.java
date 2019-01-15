package com.regex;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class RegexService {
	

	@RequestMapping("submit")
	public String display(@Valid Employee empl) {
		return (empl.getName());
	}
	@RequestMapping("/")
	public ModelAndView load() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.html"); 
	    return mv; 
	}
}

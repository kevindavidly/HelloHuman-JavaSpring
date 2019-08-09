package com.codingdojo.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {
    @RequestMapping("/")
    public String index(@RequestParam(value="name", required=false) String searchQuery) {
    	if(searchQuery == null) {
    		return "<h1>Hello Human</h1>";
    	} else {
    		return "Hello " + searchQuery;
    	}
    }
}
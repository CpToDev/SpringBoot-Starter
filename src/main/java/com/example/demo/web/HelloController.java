package com.example.demo.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class HelloController {

	@RequestMapping("/basic")
	public String sayHello() {
		return "<h1>Hello Saurav</h1>";
	}

	@RequestMapping("/proper")
	public String properHello() {
		return "<h1>Hello How are you?</h1>";
	}
	@RequestMapping("/user_entry")
	public String getUserDetail() {
		
		return "<form action=\"/greeting/user_success\" method=\"POST\">\r\n" + 
				"  <label for=\"fname\">First name:</label><br>\r\n" + 
				"  <input type=\"text\" id=\"fname\" name=\"fname\"><br>\r\n" + 
				"  <label for=\"lname\">Last name:</label><br>\r\n" + 
				"  <input type=\"text\" id=\"lname\" name=\"lname\"><br><br>\r\n" + 
				"  <input type=\"submit\" value=\"Submit\">\r\n" + 
				"</form> ";
	}
	@RequestMapping(value="/user_success",method=RequestMethod.POST)
	public String submitForm(@RequestParam String fname,@RequestParam String lname) {
		return "Hello "+fname+" "+lname+ " ,How are you";
	}
	
	@RequestMapping("/orders/{id}")
	public String getOrder(@PathVariable String id) {
		return "Order Id: "+ id;
	}

}

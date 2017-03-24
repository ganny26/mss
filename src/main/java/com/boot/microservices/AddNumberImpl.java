package com.boot.microservices;

import javax.jws.WebService;

import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/add")
public class AddNumberImpl {

	/*@RequestMapping(produces = "application/json", method = RequestMethod.GET)
	@ResponseBody
	public int addNumber(@RequestHeader(value = "username") int a, @RequestHeader(value = "username") int b){
		return a+b;
		
	}*/
	
	private int c;

	/*@RequestMapping(produces = "application/json", method = RequestMethod.POST)
	@ResponseBody
	public AddResponse addNumber(@RequestBody UsersDao a){
		c = a.getA()+a.getB();
		AddResponse addResponse = new AddResponse();
		addResponse.setSum(c);
		return addResponse;		
	}*/
}

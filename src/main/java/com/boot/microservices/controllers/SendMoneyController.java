package com.boot.microservices.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.microservices.SendMoneyResource;
import com.boot.microservices.Response.SendMoneyResponse;
import com.microservices.services.SendMoneyService;

@RestController
@RequestMapping("/sendMoney")
@Configuration
@ComponentScan("com.microservices.services")
public class SendMoneyController {
	
	@Autowired
	private SendMoneyService SendMoneyService;
	
	@RequestMapping(produces = "application/json", method = RequestMethod.POST)
	@ResponseBody
	public SendMoneyResponse addNumber(@RequestBody SendMoneyResource sendMoneyResource){
		SendMoneyResponse SendMoneyResponse = new SendMoneyResponse();
		SendMoneyService.sendMoney(sendMoneyResource);
		return SendMoneyResponse;		
	}

}

package com.boot.microservices.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.microservices.SendMoneyResource;
import com.boot.microservices.Response.SendMoneyResponse;

@Component
@Controller
@RequestMapping("/sendMoney")
@SpringBootApplication
@EnableJpaRepositories(basePackages = "demo", considerNestedRepositories = true)
public class SendMoneyController {
	
	@Autowired
	private SendMoneyService sendMoneyService;
	
	@RequestMapping(produces = "application/json", method = RequestMethod.POST)
	@ResponseBody
	public SendMoneyResponse addNumber(@RequestBody SendMoneyResource sendMoneyResource){
		SendMoneyResponse SendMoneyResponse = new SendMoneyResponse();
		sendMoneyService.sendMoney(sendMoneyResource);
		return SendMoneyResponse;		
	}

}

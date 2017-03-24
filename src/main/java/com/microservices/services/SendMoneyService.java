package com.microservices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.boot.microservices.SendMoneyResource;

@Component
public class SendMoneyService {

	@Autowired
	private SendMoneyManager sendMoneyManager;

	public Object sendMoney(SendMoneyResource sendMoneyResource) {

		return sendMoneyManager.sendMoney(sendMoneyResource);

	}

}

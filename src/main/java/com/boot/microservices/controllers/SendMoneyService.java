package com.boot.microservices.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.microservices.SendMoneyResource;
import com.boot.microservices.services.SendMoneyManager;

@Service
public class SendMoneyService {

	@Autowired
	private SendMoneyManager sendMoneyManager;

	public Object sendMoney(SendMoneyResource sendMoneyResource) {

		return sendMoneyManager.sendMoney(sendMoneyResource);

	}

}

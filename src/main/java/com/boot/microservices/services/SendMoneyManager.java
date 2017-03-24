package com.boot.microservices.services;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.boot.microservices.SendMoneyResource;
import com.boot.microservices.Response.SendMoneyResponse;
import com.boot.microservices.repository.User;
import com.boot.microservices.repository.UserRepository;

@Component
public class SendMoneyManager {

	@Resource
	private UserRepository userRepository;
	private Integer payee;
	private Integer amount;
	private Integer payer;
	private SendMoneyResponse sendMoneyResponse = new SendMoneyResponse();
	
	public SendMoneyResponse sendMoney(SendMoneyResource sendMoneyResource){
		
		payee = sendMoneyResource.getPayee();
		payer = sendMoneyResource.getPayer();
		amount = sendMoneyResource.getAmount();
		
		if(payee!=null && payer!=null && amount!=null){
			User payerUser = userRepository.validateByUserName(payer);
			User payeeUser = userRepository.validateByUserName(payee);
			 if(payerUser.getAmount()> amount){
				 payerUser.setAmount(payerUser.getAmount()-amount);
				 payeeUser.setAmount(payeeUser.getAmount()+amount);
				 sendMoneyResponse.setSuccess(true);
				 sendMoneyResponse.setMessage("Amount transferred successfully!!");
				 sendMoneyResponse.setAmount(amount);
				 sendMoneyResponse.setPayee(payee);
				 sendMoneyResponse.setPayer(payer);
			 }else{
				 sendMoneyResponse.setSuccess(false);
				 sendMoneyResponse.setMessage("insufficent funds in payer account!!");
				 sendMoneyResponse.setAmount(amount);
				 sendMoneyResponse.setPayee(payee);
				 sendMoneyResponse.setPayer(payer);
			 }
		}else{
			 sendMoneyResponse.setSuccess(false);
			 sendMoneyResponse.setMessage("invalid details!!");
			 sendMoneyResponse.setAmount(amount);
			 sendMoneyResponse.setPayee(payee);
			 sendMoneyResponse.setPayer(payer);
		}
		return new SendMoneyResponse();
	}
	
	
}

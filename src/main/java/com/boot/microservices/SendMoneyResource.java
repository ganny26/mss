package com.boot.microservices;

public class SendMoneyResource {

	private Integer payer;
	private Integer payee;
	private Integer amount;
	private Integer currency_Code;
	private String message;
	
	public Integer getPayer() {
		return payer;
	}
	public void setPayer(Integer payer) {
		this.payer = payer;
	}
	public Integer getPayee() {
		return payee;
	}
	public void setPayee(Integer payee) {
		this.payee = payee;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Integer getCurrency_Code() {
		return currency_Code;
	}
	public void setCurrency_Code(Integer currency_Code) {
		this.currency_Code = currency_Code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}

package com.amaris.fab.model;

import java.util.List;

public class SCTOrderDetails 
{
	private String orderId;
	private String cro;
	private String uri;
	private Amount amount;
	private String feeType;
	private List<Fee> fees;
	private String date;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getCro() {
		return cro;
	}
	public void setCro(String cro) {
		this.cro = cro;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public Amount getAmount() {
		return amount;
	}
	public void setAmount(Amount amount) {
		this.amount = amount;
	}
	public String getFeeType() {
		return feeType;
	}
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}
	public List<Fee> getFees() {
		return fees;
	}
	public void setFees(List<Fee> fees) {
		this.fees = fees;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}

class Amount
{
	public String receiverAmount;
	public String receiverCurrency;
	public String exchangeRate;
}
class Fee
{
	public String amount;
	public String currency;
	public String code;
	public String description;
	
}

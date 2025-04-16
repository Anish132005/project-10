package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_Payment")
public class PaymentDTO extends BaseDTO{
	
	@Column(name = "CUSTOMER_NAME", length = 50)
	private String customerName;

	@Column(name = "Amount", length = 50)
	private String amount;

	@Column(name = "PAYMENT_Method", length = 50)
	private String paymentMethod;

	@Column(name = "TRANSACTION_ID", length = 50)
	private String transactionId;
	
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getKey() {

		return id + "";
	}

	public String getValue() {
		return paymentMethod;
	}

	public String getUniqueKey() {
		return "customerName";
	}

	public String getUniqueValue() {
		return customerName;
	}

	public String getLabel() {
		return "customerName";
	}

	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("customerName", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("customerName", customerName);
		return map;

	}

}

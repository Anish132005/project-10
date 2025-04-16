package com.rays.form;

import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.PaymentDTO;

public class PaymentForm extends BaseForm{
	
	@NotNull(message = "please enter customtername")
	private String customerName;

	@NotNull(message = "please enter amount")
	private String amount;

	@NotNull(message = "please enter paymentMethod")
	private String paymentMethod;

	@NotNull(message = "please enter transactionId")
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
	
	@Override
	public BaseDTO getDto() {

		PaymentDTO dto = initDTO(new PaymentDTO());
		dto.setCustomerName(customerName);
		dto.setAmount(amount);
		dto.setPaymentMethod(paymentMethod);
		dto.setTransactionId(transactionId);

		return dto;
	}
	
	



}

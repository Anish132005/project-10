package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ShoppingCartDTO;

public class ShoppingCartForm extends BaseForm{
	
	
	@NotNull(message = "please enter productname")
	private String productName;

	@NotNull(message = "please enter date")
	private Date date;

	@NotNull(message = "please enter quantity")
	private String quantity;

	@NotNull(message = "please enter amount")
	private String amount;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Override
	public BaseDTO getDto() {

		ShoppingCartDTO dto = initDTO(new ShoppingCartDTO());
		dto.setProductName(productName);
		dto.setDate(date);
		dto.setQuantity(quantity);
		dto.setAmount(amount);

		return dto;
	}


}

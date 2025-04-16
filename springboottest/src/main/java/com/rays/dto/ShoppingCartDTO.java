package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_ShoppingCart")
public class ShoppingCartDTO extends BaseDTO {
	
	@Column(name = "PRODUCT_NAME", length = 50)
	private String productName;

	@Column(name = "Date", length = 50)
	private Date date;

	@Column(name = "QUANTITY", length = 50)
	private String quantity;

	@Column(name = "AMOUNT", length = 50)
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
	

	public String getKey() {

		return id + "";
	}

	public String getValue() {
		return productName;
	}

	public String getUniqueKey() {
		return "productName";
	}

	public String getUniqueValue() {
		return productName;
	}

	public String getLabel() {
		return "productName";
	}

	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("productName", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("productName", productName);
		return map;

	}


	

}

package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;


@Entity
@Table(name = "ST_Ticket")
public class TicketDTO  extends BaseDTO{
	
	@Column(name = "TICKETNO", length = 50)
	private String ticketNo;

	@Column(name = "PASSENGER_NAME", length = 50)
	private String passengerName;

	@Column(name = "FROM_STATION", length = 50)
	private String fromStation;

	@Column(name = "TO_STATION", length = 50)
	private String toStation;

	@Column(name = "DOB")
	private Date dob;
	
	
	
	public String getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getFromStation() {
		return fromStation;
	}

	public void setFromStation(String fromStation) {
		this.fromStation = fromStation;
	}

	public String getToStation() {
		return toStation;
	}

	public void setToStation(String toStation) {
		this.toStation = toStation;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getKey() {

		return id + "";
	}

	public String getValue() {
		return passengerName;
	}

	public String getUniqueKey() {
		return "passengerName";
	}

	public String getUniqueValue() {
		return passengerName;
	}

	public String getLabel() {
		return "passengerName";
	}

	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("passengerName", "asc");
		return map;

	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("passengerName", passengerName);
		return map;

	}

	}

	
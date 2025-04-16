package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.TicketDTO;

public class TicketForm extends BaseForm{
	

	@NotNull(message = "please enter passengerName")
	private String passengerName;
	
	@NotNull(message = "please enter TicketNO")
	private String ticketNo;

	@NotNull(message = "please enter From Station")
	private String fromStation;

	@NotNull(message = "please enter To Station")
	private String toStation;

	@NotNull(message = "please enter Dob")
	private Date dob;

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
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
	
	@Override
	public BaseDTO getDto() {

		TicketDTO dto = initDTO(new TicketDTO());
		dto.setPassengerName(passengerName);
		dto.setTicketNo(ticketNo);
		dto.setFromStation(fromStation);
		dto.setToStation(toStation);
		dto.setDob(dob);
		
		return dto;
	}


}

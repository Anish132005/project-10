package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.TicketDTO;
import com.rays.form.TicketForm;
import com.rays.service.TicketServiceInt;

@RestController
@RequestMapping(value = "Ticket")
public class TicketCtl extends BaseCtl<TicketForm, TicketDTO, TicketServiceInt> {
	
	@Autowired
	public TicketServiceInt ticketService;

	@GetMapping("/preload")
	public ORSResponse preload() {

		ORSResponse res = new ORSResponse(true);
		TicketDTO dto = new TicketDTO();

		List<DropdownList> list = ticketService.search(dto, userContext);
		res.addResult("bankList", list);
		return res;
	}


}

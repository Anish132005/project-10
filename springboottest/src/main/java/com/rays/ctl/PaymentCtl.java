package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.PaymentDTO;
import com.rays.form.PaymentForm;
import com.rays.service.PaymentServiceInt;

@RestController
@RequestMapping(value = "Payment")
public class PaymentCtl extends BaseCtl <PaymentForm, PaymentDTO, PaymentServiceInt> {

	@Autowired
	public PaymentServiceInt paymentService;

	@GetMapping("/preload")
	public ORSResponse preload() {

		ORSResponse res = new ORSResponse(true);
		PaymentDTO dto = new PaymentDTO();

		List<DropdownList> list = paymentService.search(dto, userContext);
		res.addResult("paymentList", list);
		return res;
	}
}

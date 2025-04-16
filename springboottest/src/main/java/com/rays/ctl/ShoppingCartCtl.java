package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.ShoppingCartDTO;
import com.rays.form.ShoppingCartForm;
import com.rays.service.ShoppingCartServiceInt;


@RestController
@RequestMapping(value = "ShoppingCart")
public class ShoppingCartCtl extends BaseCtl <ShoppingCartForm, ShoppingCartDTO, ShoppingCartServiceInt> {
	
	@Autowired
	public ShoppingCartServiceInt baseService;

	@GetMapping("/preload")
	public ORSResponse preload() {

		ORSResponse res = new ORSResponse(true);
		ShoppingCartDTO dto = new ShoppingCartDTO();

		List<DropdownList> list = baseService.search(dto, userContext);
		res.addResult("shoppingCartList", list);
		return res;
	}


}

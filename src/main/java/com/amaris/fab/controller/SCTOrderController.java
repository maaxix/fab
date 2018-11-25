package com.amaris.fab.controller;


import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;

import com.amaris.fab.model.SCTOrder;
import com.amaris.fab.model.SCTOrderDetails;
import com.amaris.fab.service.SCTOrderService;

@Controller
@RequestMapping(path = "/api")
public class SCTOrderController {

	@Autowired
	private SCTOrderService service;

	@ResponseBody
	@PostMapping(path = "/postSCT/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	SCTOrderDetails one(@PathVariable Long id, @ModelAttribute @Valid SCTOrder order, BindingResult result) throws Exception {		
		if(result.hasErrors())
		{
			//TODO:
		}
		
		SCTOrderDetails orderDetails = service.postSCTOrder(id,  order);
		
		return orderDetails;
	}


}
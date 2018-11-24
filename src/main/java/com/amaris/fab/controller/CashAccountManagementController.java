package com.amaris.fab.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.amaris.fab.model.AccountBalance;
import com.amaris.fab.service.CashAccountManagementService;

@Controller
@RequestMapping(path = "/api")
public class CashAccountManagementController {

	@Autowired
	private CashAccountManagementService accountService;

	@ResponseBody
	@GetMapping(path = "/accountBalance/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	Object one(@PathVariable Long id) throws Exception {
		AccountBalance accountBalance = accountService.getAccountBalance(id);

		return accountBalance;
	}


}
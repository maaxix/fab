package com.amaris.fab.service;

import com.amaris.fab.model.AccountBalance;

public interface CashAccountManagementService {
	public AccountBalance getAccountBalance(Long accountId);
}

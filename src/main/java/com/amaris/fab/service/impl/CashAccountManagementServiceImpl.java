package com.amaris.fab.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.amaris.fab.config.AppProperties;
import com.amaris.fab.model.AccountBalance;
import com.amaris.fab.model.response.AccountBalanceResponse;
import com.amaris.fab.service.CashAccountManagementService;

/**
 * Customer Info
 */
@Service("CashAccountManagementService")
public class CashAccountManagementServiceImpl implements CashAccountManagementService
{
    @Autowired
    private RestTemplate restTemplate;
    
	@Autowired
	private AppProperties appProp;
	
	/**
	 * get the account balance
	 * @param accountId
	 * @return AccountBalance
	 */
	public AccountBalance getAccountBalance(Long accountId) {	    
	    String url = 	appProp.getUrl() +
	    				appProp.getUri_AccountBalance().replace("{accountId}", accountId.toString());
	    
	    ResponseEntity<AccountBalanceResponse> response = restTemplate.exchange(url, HttpMethod.GET, null, AccountBalanceResponse.class);
	    
	    return response.getBody().getPayload().get(0);
	}


}

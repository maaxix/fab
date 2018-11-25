package com.amaris.fab.service.impl;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import static org.assertj.core.api.Assertions.assertThat;

import com.amaris.fab.model.AccountBalance;
import com.amaris.fab.model.response.AccountBalanceResponse;
import com.amaris.fab.service.CashAccountManagementService;

import com.amaris.util.JMapper;



@RunWith(SpringRunner.class)
@SpringBootTest
public class CashAccountManagementServiceImplTest 
{
	@Autowired
	CashAccountManagementService service;
	@MockBean
	private RestTemplate restTemplate;
	
	Long accountId;
	
	@Before
    public void setUp() {
		/* START test data Init */
		accountId = 235L;
		/* END test data Init */        
    }
	
	@Test
	public void getAccountBalance() throws Exception
	{
		// Parsing mock file
		AccountBalanceResponse mockResponse = JMapper.jsonFile2Object("AccountBalanceResponse.json", AccountBalanceResponse.class);
		
        // Mocking remote service
		/*
		when(restTemplate.exchange(
                Matchers.anyString(), 
                Matchers.any(HttpMethod.class),
                Matchers.<HttpEntity<?>> any(), 
                Matchers.<Class<String>> any()
               )
              )
        .thenReturn(new ResponseEntity(mockResponse, HttpStatus.OK));
		*/
		when(restTemplate.exchange(any(String.class), any(HttpMethod.class),any(),any(Class.class)))
        .thenReturn(new ResponseEntity(mockResponse, HttpStatus.OK));
				

        AccountBalance accBalance= service.getAccountBalance(accountId);
        
        assertThat(accBalance).isNotNull();
  
	}
}

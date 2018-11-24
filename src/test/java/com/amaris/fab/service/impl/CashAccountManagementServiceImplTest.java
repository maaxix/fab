package com.amaris.fab.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

import com.amaris.fab.model.AccountBalance;
import com.amaris.fab.service.CashAccountManagementService;





@RunWith(SpringRunner.class)
@SpringBootTest
public class CashAccountManagementServiceImplTest 
{
	@Autowired
	CashAccountManagementService service;
	
	Long accountId;
	
	@Before
    public void setupMock() {
		/* START test data Init */
		accountId = 235L;
		/* END test data Init */        
    }
	
	@Test
	public void getAccountBalance() throws Exception
	{
		//TODO:
	}
}

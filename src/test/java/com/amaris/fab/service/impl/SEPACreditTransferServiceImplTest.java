package com.amaris.fab.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

import com.amaris.fab.model.SCTOrder;
import com.amaris.fab.model.SCTOrderDetails;
import com.amaris.fab.service.SCTOrderService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SEPACreditTransferServiceImplTest 
{
	@Autowired
	SCTOrderService service;
	
	Long accountId;
	SCTOrder order;
	
	@Before
    public void setupMock() {
		/* START test data Init */
		accountId = 235L;
		order = createOrder();
		/* END test data Init */        
    }
	
	@Test
	public void getAccountBalance() throws Exception
	{
		//TODO:
			
	}

	private SCTOrder createOrder()
	{
		SCTOrder order = new SCTOrder();
		order.setAmount("8000");
		order.setReceiverBic("12");
		
		return order;
	}
}

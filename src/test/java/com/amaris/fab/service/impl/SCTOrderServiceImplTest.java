package com.amaris.fab.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.amaris.fab.model.SCTOrder;
import com.amaris.fab.model.SCTOrderDetails;
import com.amaris.fab.model.response.AccountBalanceResponse;
import com.amaris.fab.model.response.SCTOrderResponse;
import com.amaris.fab.service.SCTOrderService;
import com.amaris.util.JMapper;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SCTOrderServiceImplTest 
{
	@Autowired
	SCTOrderService service;
	@MockBean
	private RestTemplate restTemplate;	
	Long accountId;
	SCTOrder order;
	
	@Before
    public void setUp() {
		/* START test data Init */
		accountId = 235L;
		order = createOrder();
		/* END test data Init */        
    }
	
	@Test
	public void getAccountBalance() throws Exception
	{
		SCTOrderResponse mockResponse = JMapper.jsonFile2Object("SCTOrderResponse.json", SCTOrderResponse.class);
		
		when(restTemplate.exchange(
                Matchers.anyString(), 
                Matchers.any(HttpMethod.class),
                Matchers.<HttpEntity<?>> any(), 
                Matchers.<Class<String>> any(),
                Matchers.<Class<SCTOrder>> any()
                
               )
              )
        .thenReturn(new ResponseEntity(mockResponse, HttpStatus.OK));
		SCTOrderDetails responseOrderDetails = service.postSCTOrder(accountId, order);
		assertThat(responseOrderDetails).isNotNull();		
			
	}

	private SCTOrder createOrder()
	{
		SCTOrder order = new SCTOrder();
		order.setAmount("8000");
		order.setReceiverBic("12");
		
		return order;
	}
}

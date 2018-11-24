package com.amaris.fab.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.amaris.fab.config.AppProperties;
import com.amaris.fab.model.SCTOrder;
import com.amaris.fab.model.SCTOrderDetails;
import com.amaris.fab.model.response.SCTOrderResponse;
import com.amaris.fab.service.SCTOrderService;

/**
 * Payments/SCT - SEPA Credit Transfer
 */
@Service("SCTOrderService")
public class SCTOrderServiceImpl implements SCTOrderService
{
    @Autowired
    private RestTemplate restTemplate;
    
	@Autowired
	private AppProperties appProp;
	
	/**
	 * Create SCT Order
	 * @param accountId
	 * @param order
	 * @return SCTOrderDetails
	 */	
	public SCTOrderDetails postSCTOrder(Long accountId, SCTOrder order) {
	    String url = 	appProp.getUrl() + 
	    				appProp.getUri_CreateSCTOrder().replace("{accountId}", accountId.toString());
	    
	    ResponseEntity<SCTOrderResponse> response = restTemplate.exchange(url, HttpMethod.POST, null, SCTOrderResponse.class, order);	    
	    
	    return response.getBody().getPayload().get(0);
	}


}

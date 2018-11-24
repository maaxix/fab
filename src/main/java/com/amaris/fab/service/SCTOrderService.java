package com.amaris.fab.service;

import com.amaris.fab.model.SCTOrder;
import com.amaris.fab.model.SCTOrderDetails;

public interface SCTOrderService {
	public SCTOrderDetails postSCTOrder(Long accountId, SCTOrder order);
}

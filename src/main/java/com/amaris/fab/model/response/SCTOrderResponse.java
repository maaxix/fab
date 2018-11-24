package com.amaris.fab.model.response;

import java.util.List;

import lombok.Data;

import com.amaris.fab.model.SCTOrder;
/*
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
*/
import com.amaris.fab.model.SCTOrderDetails;

public class SCTOrderResponse {
	private Status 				 status;
	private Error  				 error;
	private List <SCTOrderDetails>      payload;
	
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Error getError() {
		return error;
	}
	public void setError(Error error) {
		this.error = error;
	}
	public List<SCTOrderDetails> getPayload() {
		return payload;
	}
	public void setPayload(List<SCTOrderDetails> payload) {
		this.payload = payload;
	}




	
}

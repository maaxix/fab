package com.amaris.fab.model.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import com.amaris.fab.model.AccountBalance;
/*
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
*/

public class AccountBalanceResponse {
	private Status 				 status;
	private Error  				 error;
	private List<AccountBalance> payload;
	
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
	public List<AccountBalance> getPayload() {
		return payload;
	}
	public void setPayload(List<AccountBalance> payload) {
		this.payload = payload;
	}

	
}

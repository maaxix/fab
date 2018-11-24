package com.amaris.fab.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="fabrick")
public class AppProperties  
{

	private String AuthSchema;
	
	private String url;
	private String uri_AccountBalance;
	private String uri_CreateSCTOrder;
	
	public String getAuthSchema() {
		return AuthSchema;
	}
	public void setAuthSchema(String authSchema) {
		AuthSchema = authSchema;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUri_AccountBalance() {
		return uri_AccountBalance;
	}
	public void setUri_AccountBalance(String uri_AccountBalance) {
		this.uri_AccountBalance = uri_AccountBalance;
	}
	public String getUri_CreateSCTOrder() {
		return uri_CreateSCTOrder;
	}
	public void setUri_CreateSCTOrder(String uri_CreateSCTOrder) {
		this.uri_CreateSCTOrder = uri_CreateSCTOrder;
	}	

	
	
	

	
	
}

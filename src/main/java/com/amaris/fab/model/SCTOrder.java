package com.amaris.fab.model;

import lombok.Data;

@Data
public class SCTOrder 
{
	private String receiverIban;
	private String receiverBic;
	private String receiverSwift;
	private String receiverName;
	private String description ;
	private String amount  ;
	private String currency  ;
	private String executionDate  ;
	private String instant  ;
	private String feeType   ;
	private String receiverAddress   ;
	private String receiverCity    ;
	private String receiverCountry    ;
	private TaxRelief taxRelief;
	
	
	public String getReceiverIban() {
		return receiverIban;
	}
	public void setReceiverIban(String receiverIban) {
		this.receiverIban = receiverIban;
	}
	public String getReceiverBic() {
		return receiverBic;
	}
	public void setReceiverBic(String receiverBic) {
		this.receiverBic = receiverBic;
	}
	public String getReceiverSwift() {
		return receiverSwift;
	}
	public void setReceiverSwift(String receiverSwift) {
		this.receiverSwift = receiverSwift;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getExecutionDate() {
		return executionDate;
	}
	public void setExecutionDate(String executionDate) {
		this.executionDate = executionDate;
	}
	public String getInstant() {
		return instant;
	}
	public void setInstant(String instant) {
		this.instant = instant;
	}
	public String getFeeType() {
		return feeType;
	}
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}
	public String getReceiverAddress() {
		return receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}
	public String getReceiverCity() {
		return receiverCity;
	}
	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}
	public String getReceiverCountry() {
		return receiverCountry;
	}
	public void setReceiverCountry(String receiverCountry) {
		this.receiverCountry = receiverCountry;
	}
	public TaxRelief getTaxRelief() {
		return taxRelief;
	}
	public void setTaxRelief(TaxRelief taxRelief) {
		this.taxRelief = taxRelief;
	}
	class TaxRelief
	{
		public String taxReliefId;
		public String receiverFiscalCode;
		public String beneficiaryType;
		
		public NaturalPersonBeneficiary	naturalPersonBeneficiary;
		public LegalPersonBeneficiary 	legalPersonBeneficiary;
		
		TaxRelief ()
		{
			naturalPersonBeneficiary = new NaturalPersonBeneficiary() ;
			legalPersonBeneficiary = new LegalPersonBeneficiary();
		}
	}

	
	class NaturalPersonBeneficiary
	{
		public String fiscalCode1;
		public String fiscalCode2;
		public String fiscalCode3;
		public String fiscalCode4;
		public String fiscalCode5;

		

		
	}
	class LegalPersonBeneficiary
	{
		public String fiscalCode;
		public String legalRepresentativeFiscalCode;
	}	
}


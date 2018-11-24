package com.amaris.fab.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Builder;

import java.time.LocalDate;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 
 * @author Mohamed
 *
 */

public class AccountBalance {
    @JsonFormat (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date   date;
	private BigDecimal balance;
	private BigDecimal availableBalance;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public BigDecimal getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(BigDecimal availableBalance) {
		this.availableBalance = availableBalance;
	}
	
	
}

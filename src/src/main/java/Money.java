package src.main.java;

import java.math.BigDecimal;

/**
 * Created by Vlad on 19.06.17.
 */
public class Money {
	private BigDecimal amount;
	private String currency;

	public Money(BigDecimal amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public String getCurrency() {
		return currency;
	}


	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
}

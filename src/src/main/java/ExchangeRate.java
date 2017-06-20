package src.main.java;

import java.math.BigDecimal;

/**
 * Created by Vlad on 19.06.17.
 */
public class ExchangeRate {
	private BigDecimal buyPrice;
	private BigDecimal sellPrice;

	public ExchangeRate(BigDecimal buyPrice, BigDecimal sellPrice) {
		this.buyPrice = buyPrice;
		this.sellPrice = sellPrice;
	}

	public BigDecimal getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(BigDecimal buyPrice) {
		this.buyPrice = buyPrice;
	}

	public BigDecimal getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(BigDecimal sellPrice) {
		this.sellPrice = sellPrice;
	}

	public void updateCurencyRate(String currency, ExchangeRate exchangeRate) {

	}

}

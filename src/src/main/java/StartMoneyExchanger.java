package src.main.java;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Vlad on 19.06.17.
 */
public class StartMoneyExchanger {


	public static void main(String[] args) {

		//singleton design pattern - use only one instance of the class
		MoneyExchanger moneyExchanger = MoneyExchanger.getInstance();
		moneyExchanger.startExchange();

	}
}

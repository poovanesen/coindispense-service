package za.co.itlab.coindispense.services;

import java.util.List;
import java.util.Locale;

public interface CoinService {

	List<String> dispenseCoins(double amount);
	
	int[] DENOMINATIONS_IN_CENTS = {10000,5000,2000,1000,500,200,100,50,25,10,5,1};
	
	public final static Locale LOCALE_SA = new Locale("en", "ZA");
}

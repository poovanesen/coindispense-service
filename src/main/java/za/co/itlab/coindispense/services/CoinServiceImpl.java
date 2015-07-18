package za.co.itlab.coindispense.services;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CoinServiceImpl implements CoinService {
	


	@Override
	public List<String> dispenseCoins(double amount) {
		List<String> denominations = new ArrayList<String>();
		int amountInCents = (int) (amount * 100);
		while (amountInCents > 0) {
			for (int denomination : DENOMINATIONS_IN_CENTS) {
				int factor = amountInCents/denomination;
				if (factor > 0) {
					if (denomination < 100) {
						denominations.add(factor + " * "  +  denomination + " cent");
					} else {
						denominations.add(factor + " * "  +  NumberFormat.getCurrencyInstance(LOCALE_SA).format((double)denomination/100) );
					}
					amountInCents -= (factor * denomination);
					if (amountInCents == 0) break;
				}
			}
		}	
		return denominations;
	}

}

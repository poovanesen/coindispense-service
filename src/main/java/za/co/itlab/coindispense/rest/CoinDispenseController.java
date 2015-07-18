/**
 * 
 */
package za.co.itlab.coindispense.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import za.co.itlab.coindispense.domain.User;
import za.co.itlab.coindispense.services.CoinService;
import za.co.itlab.coindispense.services.UserService;


/**
 * @author poovanpillay
 *
 */
@RestController
@RequestMapping("/coin")
public class CoinDispenseController {
	
	@Autowired
	private CoinService coinService;

	@RequestMapping(value="/dispense",method=RequestMethod.POST)
	public List<String> dispenseCoin(@RequestBody Double amount) {
		return coinService.dispenseCoins(amount);
	}
	

}

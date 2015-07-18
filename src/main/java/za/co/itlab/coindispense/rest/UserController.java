/**
 * 
 */
package za.co.itlab.coindispense.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import za.co.itlab.coindispense.domain.User;
import za.co.itlab.coindispense.services.UserService;


/**
 * @author poovanpillay
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value="/login",method=RequestMethod.POST)
	public Boolean login(@RequestBody @Validated User user) {
		return userService.login(user);
	}
	

}

package za.co.itlab.coindispense.services;

import org.springframework.stereotype.Service;

import za.co.itlab.coindispense.domain.User;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public Boolean login(User user) {
		return ("test").equals(user.getPassword()) && ("test").equals(user.getUsername()) ;
	}

}

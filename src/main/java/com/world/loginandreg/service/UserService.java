package com.world.loginandreg.service;

import com.world.loginandreg.model.User;

public interface UserService {
	
	public void saveUser(User user);
	public boolean isUserAlreadyPresent(User user);

}

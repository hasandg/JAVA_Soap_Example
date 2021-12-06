package com.hasandag.ws_jax_example;


//A separate class for handling persistence
public class UserPersistenceService {

	private UserStore store = new UserStore();
	
	public User saveUser(User user) {
		return store.store(user);
	}

	public User getUser(String username) {
		return store.getUser(username);
	}

	public User updateUser(User user) {
		return store.store(user);
	}

	public User deleteUser(User user) {
		return store.delete(user);
	}
}

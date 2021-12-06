package com.hasandag.ws_jax_example;

public class UserController implements UserWebservice {

    private UserPersistenceService userPersistenceService = new UserPersistenceService();


    public User insertUser(User user) {
        return userPersistenceService.saveUser(user);
    }

    public User getUser(String username) {
        return userPersistenceService.getUser(username);
    }

    public User updateUser(User user) {
        return userPersistenceService.updateUser(user);
    }

    public Boolean deleteUser(User user) {
        User deletedUser = userPersistenceService.deleteUser(user);
        return user.getUserName().equals(deletedUser.getUserName());
    }
}

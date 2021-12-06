package com.hasandag.ws_jax_example;

public class UserWebserviceImpl implements UserWebservice {
    UserController userController;

    public User insertUser(User user) {
        return getUserController().insertUser(user);
    }

    public User getUser(String username) {
        return getUserController().getUser(username);
    }

    public User updateUser(User user) {
        return getUserController().updateUser(user);
    }

    public Boolean deleteUser(User user) {
        return getUserController().deleteUser(user);
    }

    UserController getUserController() {
        if (userController == null) {
            userController = new UserController();
        }
        return userController;
    }
}

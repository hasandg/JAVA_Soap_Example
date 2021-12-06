package com.hasandag.ws_jax_example;

public class Main {


    public static void main(String[] args) {

        User user1 = new User(null, "hasandag", "hasan", "dag");
        User user2 = new User(null, "cankara", "can", "kara");

        UserController userController = new UserController();

        userController.insertUser(user1);
        userController.insertUser(user2);

        User userhasandag = userController.getUser("hasandag");
        System.out.println(String.format("%s %s",userhasandag.getFirstName(),userhasandag.getLastName()));

    }
}

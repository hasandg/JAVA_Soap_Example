package com.hasandag.ws_jax_example;

import java.util.HashMap;
import java.util.Map;

public class UserStore {
    private static final Map<String,User> STORE = new HashMap<>();

    public User store(User user){
        synchronized (STORE){
           return STORE.put(user.getUserName(), user);
        }
    }

    public User getUser(String username){
        synchronized (STORE){
            return STORE.get(username);
        }
    }

    public User update(User user){
        synchronized (STORE){
            return STORE.replace(user.getUserName(), user);
        }
    }

    public User delete(User user){
        synchronized (STORE){
            return STORE.remove(user.getUserName());
        }
    }

}

package com.hasandag.ws_jax_example;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface UserWebservice {
    @WebMethod
    User insertUser(User user);

    @WebMethod
    User getUser(String username);

    @WebMethod
    User updateUser(User user);

    @WebMethod
    Boolean deleteUser(User user);
}

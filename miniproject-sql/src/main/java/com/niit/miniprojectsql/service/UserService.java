package com.niit.miniprojectsql.service;

import com.niit.miniprojectsql.exception.InvalidCredentialsException;
import com.niit.miniprojectsql.model.User;

public interface UserService {
    User saveUser(User user);

    User findByEmailAndPassword(String email,String password) throws InvalidCredentialsException;
}

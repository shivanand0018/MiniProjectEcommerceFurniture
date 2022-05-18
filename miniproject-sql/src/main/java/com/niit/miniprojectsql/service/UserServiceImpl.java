package com.niit.miniprojectsql.service;

import com.niit.miniprojectsql.exception.InvalidCredentialsException;
import com.niit.miniprojectsql.model.User;
import com.niit.miniprojectsql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@Service
public class UserServiceImpl implements UserService{
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public User saveUser(User user)
    {
        return userRepository.save(user);
    }

    @Override
    public User findByEmailAndPassword(String email, String password) throws InvalidCredentialsException{
        User loggedInUser = userRepository.findByEmailAndPassword(email,password);
        System.out.println(loggedInUser);
        if(loggedInUser == null)
        {
            throw new InvalidCredentialsException();
        }

        return loggedInUser;
    }
}

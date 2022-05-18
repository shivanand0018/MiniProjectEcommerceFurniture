package com.niit.miniprojectsql.controller;

import com.niit.miniprojectsql.exception.InvalidCredentialsException;
import com.niit.miniprojectsql.model.User;
import com.niit.miniprojectsql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*")
public class UserController {
    private UserService  userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public ResponseEntity<?> saveUser(@RequestBody User user)
    {
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody User user) throws InvalidCredentialsException {
        User retrievedUser=userService.findByEmailAndPassword(user.getEmail(),user.getPassword());
        if(retrievedUser==null)
        {
            throw new InvalidCredentialsException();
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

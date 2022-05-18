package com.niit.miniprojectsql.repository;

import com.niit.miniprojectsql.exception.InvalidCredentialsException;
import com.niit.miniprojectsql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    User findByEmailAndPassword(String email, String password) throws InvalidCredentialsException;
}

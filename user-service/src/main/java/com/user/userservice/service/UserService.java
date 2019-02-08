package com.user.userservice.service;
import java.util.List;

import com.user.userservice.model.User;

public interface UserService {

    User save(User user);
    List<User> findAll();
    void delete(long id);
    User findOne(String username);

    User findById(Long id);
}
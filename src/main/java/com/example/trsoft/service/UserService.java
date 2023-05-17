package com.example.trsoft.service;

import com.example.trsoft.model.User;

import java.util.List;

public interface UserService {
    User create(User user) ;

    User findById(long userId);

    List<User> findByMailOrAll(String email);

    List<User> getAll();

    User update(long userId, User user);

    void deleteById(long userId);

    void deleteAll();
}

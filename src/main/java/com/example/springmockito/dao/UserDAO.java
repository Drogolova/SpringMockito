package com.example.springmockito.dao;

import com.example.springmockito.model.User;

import java.util.List;

public interface UserDAO {
    User getUserByName(String name);

    List<User> findAllUsers();
}

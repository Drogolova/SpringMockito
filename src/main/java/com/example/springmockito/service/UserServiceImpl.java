package com.example.springmockito.service;

import com.example.springmockito.dao.UserDAO;
import com.example.springmockito.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    protected UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public boolean checkUserExist(User user) {
        return userDAO.getUserByName(user.getName()) != null;
    }
}

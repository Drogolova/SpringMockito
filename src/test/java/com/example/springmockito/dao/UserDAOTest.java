package com.example.springmockito.dao;

import com.example.springmockito.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Service;

import static org.junit.jupiter.api.Assertions.*;

class UserDAOTest {

    @Test
    public void shouldReturnUser() {
        UserDAOImpl userDAO = new UserDAOImpl();
        User user = userDAO.getUserByName("Vadim");
        assertNotNull(user);
    }

    @Test
    public void shouldReturnNull() {
        UserDAOImpl userDAO = new UserDAOImpl();
        User user = userDAO.getUserByName("Oleg");
        assertNull(user);
    }

}
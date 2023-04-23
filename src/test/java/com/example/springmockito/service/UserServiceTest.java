package com.example.springmockito.service;


import com.example.springmockito.dao.UserDAOImpl;
import com.example.springmockito.model.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    public UserDAOImpl userDAO;

    @InjectMocks
    public UserServiceImpl userService;

    @Test
    public void shouldReturnUserExists() {
        when(userDAO.getUserByName("Vadim")).thenReturn(new User("Vadim"));
        assertTrue(userService.checkUserExist(new User("Vadim")));
    }

    @Test
    public void shouldReturnUserNotExists() {
        when(userDAO.getUserByName("Vadim")).thenReturn(null);
        assertFalse(userService.checkUserExist(new User("Vadim")));
    }

}
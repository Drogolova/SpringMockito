package com.example.springmockito.dao;

import com.example.springmockito.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    protected List<User> users = new ArrayList<>();

    public UserDAOImpl() {
        User user1 = new User("Vadim");
        User user2 = new User("Ivan");
        users.add(user1);
        users.add(user2);
    }

    @Override
    public User getUserByName(String name) {
        return users.stream().filter(it -> it.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<User> findAllUsers() {
        return users;
    }
}

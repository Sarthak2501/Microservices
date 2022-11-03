package com.user.user_service.service;

import com.user.user_service.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //fake user list

    List<User> list = List.of(
            new User(1311L,"Sarthak Shashi","626767878045"),
            new User(1312L,"Shubham Shashi","7609081257"),
            new User(1313L,"harsit thakur ","7443090812")
    );


    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}

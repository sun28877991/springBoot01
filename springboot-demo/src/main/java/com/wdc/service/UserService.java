package com.wdc.service;

import com.wdc.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> queryUserList();

    void addUser(User user);

    void delUser(Integer id);

    User toUpdateUser(Integer id);

    void updateUser(User user);
}

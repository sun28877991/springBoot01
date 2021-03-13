package com.wdc.service;

import com.wdc.mapper.UserMapper;
import com.wdc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper UserMapper;
    @Override
    public List<User> queryUserList(){
        return UserMapper.queryUserList();
    }

    @Override
    public void addUser(User user) {
        UserMapper.addUser(user);
    }

    @Override
    public void delUser(Integer id) {
        UserMapper.delUser(id);
    }

    @Override
    public User toUpdateUser(Integer id) {
        return UserMapper.toUpdateUser(id);
    }

    @Override
//    @Transactional//添加事物标签了，不会新增，这里事物回滚异常，事物只能加在业务逻辑层，即Service层，增删改要加事物，不能加try-catch，加了
//    造成事物不回滚，只在controller加try-catch,其他层抛异常；@Transactional（readonly=true）设置事物为只读
    public void updateUser(User user) {
        UserMapper.updateUser(user);
//        int a=1/0;
    }

}

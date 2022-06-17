package com.example.springsecondehandbookstore.service;

import com.example.springsecondehandbookstore.entity.User;
import com.example.springsecondehandbookstore.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public int save(User user){
        if(user.getId() == null) { // user没有id,则表示是新增
            return userMapper.insert(user);
        }else { //否则更新
           return userMapper.update(user);
        }
    }
}

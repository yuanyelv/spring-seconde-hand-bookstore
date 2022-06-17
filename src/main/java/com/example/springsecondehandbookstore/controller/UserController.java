package com.example.springsecondehandbookstore.controller;

import com.example.springsecondehandbookstore.entity.User;
import com.example.springsecondehandbookstore.mapper.UserMapper;
import com.example.springsecondehandbookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @PostMapping
    public int save(@RequestBody User user) {
        // 新增或者更新
        return userService.save(user);
    }

    @GetMapping("/")
    public List<User> index() {
        List<User> all = userMapper.findAll();
        return all;
    }

    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable Integer id) {
        return userMapper.deleteById(id);
    }
}

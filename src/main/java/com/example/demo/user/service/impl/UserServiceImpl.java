package com.example.demo.user.service.impl;

import com.example.demo.base.service.impl.BaseServiceImpl;
import com.example.demo.user.mapper.UserMapper;
import com.example.demo.user.service.UserService;
import com.example.demo.user.vo.AddUserVo;
import com.example.demo.user.vo.EditUserVo;
import com.example.demo.user.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<User,AddUserVo,EditUserVo> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String insert(AddUserVo addVo,String acceptLanguage,String userName){
        User u = addVo.toEntity(userName);
        userMapper.insert(u);
        return "failed";
    }
}

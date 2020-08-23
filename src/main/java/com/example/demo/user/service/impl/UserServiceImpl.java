package com.example.demo.user.service.impl;

import com.example.demo.base.service.impl.BaseServiceImpl;
import com.example.demo.user.mapper.UserMapper;
import com.example.demo.user.service.UserService;
import com.example.demo.user.aop.UserProxy;
import com.example.demo.user.vo.AddUserVo;
import com.example.demo.user.vo.EditUserVo;
import com.example.demo.user.vo.User;
import com.example.demo.util.ResponseCode;
import com.example.demo.util.ResponseFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<User,AddUserVo,EditUserVo> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String insert(AddUserVo addVo,String acceptLanguage,String userName){
        try {
            User u = addVo.toEntity(userName);
            userMapper.insert(u);
            return ResponseFormat.success();
        }catch (Exception e){
           return ResponseFormat.error(ResponseCode.ERROR_SERVICE_VALIDATOR,e.getMessage());
        }
    }
}

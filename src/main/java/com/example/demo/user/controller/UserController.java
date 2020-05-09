package com.example.demo.user.controller;

import com.example.demo.base.controller.BaseController;
import com.example.demo.base.vo.QueryVo;
import com.example.demo.user.vo.AddUserVo;
import com.example.demo.user.vo.EditUserVo;
import com.example.demo.user.vo.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
@CrossOrigin
public class UserController extends BaseController<QueryVo, User,AddUserVo,EditUserVo> {
}

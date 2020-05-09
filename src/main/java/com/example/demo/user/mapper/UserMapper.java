package com.example.demo.user.mapper;

import com.example.demo.base.dao.BaseMapper;
import com.example.demo.user.vo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}

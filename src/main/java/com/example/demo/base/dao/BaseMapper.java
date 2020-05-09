package com.example.demo.base.dao;

import tk.mybatis.mapper.annotation.RegisterMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.additional.insert.InsertListMapper;

@RegisterMapper
public interface BaseMapper<T> extends Mapper<T>,InsertListMapper<T>{
}

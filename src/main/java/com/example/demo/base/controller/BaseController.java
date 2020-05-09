package com.example.demo.base.controller;

import com.example.demo.base.service.BaseService;
import com.example.demo.base.vo.AddEntityVo;
import com.example.demo.base.vo.BaseEntity;
import com.example.demo.base.vo.EditEntityVo;
import com.example.demo.base.vo.QueryVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j
public abstract class BaseController<Q extends QueryVo,T extends BaseEntity,U extends AddEntityVo,V extends EditEntityVo> {

    @Autowired
    BaseService<T,U,V> baseService;

    @RequestMapping(value="add",method={RequestMethod.POST},produces = {"application/json"})
    public String AddObject(@RequestHeader("Accept-Language")String acceptLanguage,
                            @RequestHeader("userName")String userName,
                            @RequestBody U addEntityVo){
        return baseService.insert(addEntityVo,acceptLanguage,userName);
    }

}

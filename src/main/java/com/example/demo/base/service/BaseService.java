package com.example.demo.base.service;

import com.example.demo.base.vo.AddEntityVo;
import com.example.demo.base.vo.BaseEntity;
import com.example.demo.base.vo.EditEntityVo;
import org.springframework.stereotype.Service;

@Service
public interface BaseService <T extends BaseEntity,U extends AddEntityVo,V extends EditEntityVo>{

    String queryListByPage();

    String insert(U addEntityVo,String acceptLanguage,String userName);

    String delete(Long id,String acceptLanguage,String userName);

    String update(V editEntity,String acceptLanguage,String userName);
}

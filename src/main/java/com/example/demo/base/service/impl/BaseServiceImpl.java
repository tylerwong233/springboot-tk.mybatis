package com.example.demo.base.service.impl;

import com.example.demo.base.dao.BaseMapper;
import com.example.demo.base.service.BaseService;
import com.example.demo.base.vo.AddEntityVo;
import com.example.demo.base.vo.BaseEntity;
import com.example.demo.base.vo.EditEntityVo;
import com.example.demo.util.ResponseCode;
import com.example.demo.util.ResponseFormat;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public abstract class BaseServiceImpl<T extends BaseEntity,U extends AddEntityVo,V extends EditEntityVo> implements BaseService<T,U,V>{

    @Autowired
    private BaseMapper mapper;


    public String queryListByPage() {
        return null;
    }

    @Override
    @Transactional
    public String insert(U addEntityVo,String acceptLanguage,String userName){
        log.info("Add one object start");
        try {
            log.info("Add one object end");
            return "success";
        }catch (Exception e){
            log.error("add object error",e);
            return ResponseFormat.error(ResponseCode.ERROR_SERVICE_VALIDATOR,e.getMessage().toString());
        }
    }

    @Override
    @Transactional
    public String delete(Long id,String acceptLanguage,String userName){
        log.info("delete one object start");
        T result = (T)mapper.selectByPrimaryKey(id);
        try{
            result.setDelFlag(true);
            mapper.updateByPrimaryKeySelective(result);
            log.info("delete one object end");
            return "success";
        }catch (Exception e){
            log.error("delete one object error",e);
            return "failed";
        }
    }

    @Override
    @Transactional
    public String update(V entity,String acceptLanguage,String userName){
        log.info("edit one object start");
        try {
            mapper.updateByPrimaryKeySelective(entity);
            log.info("edit one object end");
            return "success";
        }catch (Exception e){
            log.error("edit one object error",e);
            return "failed";
        }
    }
}

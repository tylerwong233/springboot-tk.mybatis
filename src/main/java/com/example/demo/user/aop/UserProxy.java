package com.example.demo.user.aop;

import com.example.demo.user.vo.AddUserVo;
import com.example.demo.user.vo.User;
import lombok.val;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class UserProxy {

    @Before(value = "execution(* com.example.demo.user.service.impl.UserServiceImpl.insert(..))")
    public AddUserVo proxyUser(JoinPoint joinPoint){
        System.out.println(Arrays.toString(joinPoint.getArgs()));
        AddUserVo arg = (AddUserVo)joinPoint.getArgs()[0];
        arg.setRealName("lllll");
        return arg;
    }
}

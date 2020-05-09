package com.example.demo.user.vo;

import com.example.demo.base.vo.AddEntityVo;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AddUserVo extends AddEntityVo {

    @NotNull
    private String userName;

    @NotNull
    private String realName;

    public User toEntity(String userName){
        User u = new User();
        u.setRealName(realName);
        u.setUserName(userName);
        u.setDelFlag(false);
        return u;
    }

}

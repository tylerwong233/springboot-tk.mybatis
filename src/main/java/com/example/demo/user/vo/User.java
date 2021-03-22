package com.example.demo.user.vo;

import com.example.demo.base.vo.BaseEntity;
import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "t_think_user")
public class User extends BaseEntity {

    private String userName;

    private String realName;

}

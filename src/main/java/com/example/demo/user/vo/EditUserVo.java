package com.example.demo.user.vo;

import com.example.demo.base.vo.EditEntityVo;
import lombok.Data;

@Data
public class EditUserVo extends EditEntityVo {

    private Long id;

    private String userName;

    private String realName;
}

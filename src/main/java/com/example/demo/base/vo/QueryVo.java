package com.example.demo.base.vo;

import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.Min;

@Data
public class QueryVo<T> {

    @Min(value = 1)
    @NonNull
    private Integer pageNum;

    @Min(value = 1)
    @NonNull
    private Integer pageSize;

    private T searchCondition;

    private String sortCondition;

}

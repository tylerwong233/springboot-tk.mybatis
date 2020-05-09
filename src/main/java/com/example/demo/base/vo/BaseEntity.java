package com.example.demo.base.vo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Data
public abstract class BaseEntity<T> implements Serializable {
    private static final long serialVersionUID = -6836455881608817604L;
    @Id
    @Column(insertable = false)
    @GeneratedValue(generator = "JDBC")
    private Long id;

    private Boolean delFlag;
}

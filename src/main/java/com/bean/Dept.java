package com.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Dept implements Serializable{

    private Integer deptno;
    private String dname;
    private String loc;


}

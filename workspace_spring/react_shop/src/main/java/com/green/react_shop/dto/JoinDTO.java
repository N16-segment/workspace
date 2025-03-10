package com.green.react_shop.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class JoinDTO {
  private int empno;
  private String ename;
  private int sal;
  private String job;
  private int deptno;
  private String dname;
  private String loc;
}

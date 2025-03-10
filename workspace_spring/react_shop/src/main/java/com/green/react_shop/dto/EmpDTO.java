package com.green.react_shop.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class EmpDTO {
  private int empno;
  private String ename;
  private String job;
  private int mgr;
  private LocalDateTime hiredate;
  private int sal;
  private int comm;
  private int deptno;
  //사원 한명은 부서정보 DTO를 갖는다.
  private DeptDTO deptDTO;

}

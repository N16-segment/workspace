package com.green.member_manager.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
@Getter
@Setter
@ToString
//DTO 클래스는 생성자 만들면 안된다.
public class MemberDTO {
  private  String memId;
  private String memName;
  private String memPw;
  private String memTel;
  private String memIntro;
  private Timestamp joinDate;

}

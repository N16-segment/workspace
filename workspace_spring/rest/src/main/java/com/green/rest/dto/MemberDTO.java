package com.green.rest.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//DTO(Data Transger Obdect : 데이터 전송 객체)
//데이터를 전송하려고 만든 클래스는 클래스명 뒤에 DTO라고 쓴다.
@Getter
@Setter
@ToString
public class MemberDTO {
  private String memId;
  private String memName;
  private int memAge;
  private String memTel;

}

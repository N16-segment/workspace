package com.green.shop.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
//DTO클래스는 하나의 테이블과 데이터를 주고 받기 위한 자료형(통로)
//테이블 컬럼과 맞춰주는 변수를 만들어 준다.
public class ShopDTO {
  private int itemCode;
  private String itemName;
  private int itemPrice;
  private String itemIntro;
  private Timestamp regDate;

}

//DTO 클래스에서 만든 변수를 업데이트(수정) 시 포스트맨에서 변수명을 똑같이 적용해야 한다.
//POSTMAN에서 확인 시 필요한 내용 수정과 등록 시
//{
//    "itemName" : "핸드크림",
//    "itemPrice" : 10000,
//    "itemIntro" : "머스크향",
//    "itemCode" : 3
//}

package com.green.Second;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component //객체생성하는 어노테이션
@Getter //게터생성
@Setter //세터생성
@ToString //투스프링생성
public class Phone {
  private String modelName;
  private int price;

}

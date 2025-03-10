package com.green.Second;

import org.springframework.stereotype.Component;
//BoardService boardService = new BoardService();
@Component("service")//어노테이션에 소괄호 안에 넣어주는 이름으로 객체 생성
//BoardService service = ner BoardService();
public class BoardService {
  public void bbb(){
    System.out.println("bbb 메서드 실행~");
  }
}

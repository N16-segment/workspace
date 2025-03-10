package com.green.Second;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhoneController {
  private Phone phone;
  private BoardService boardService;
// -> private BoardService boardService = new BoardService(); 이렇게 쓸 필요가 없다.

  @Autowired//폰 클래스에서 자동으로 만들어진 폰 객체를 가져와서 의존성주입으로 사용하겠다.
  public PhoneController(Phone phone, BoardService boardService){
    this.phone = phone;
    this.boardService = boardService;


  }


}

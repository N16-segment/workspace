package com.green.Second;

import org.springframework.stereotype.Component;

//MemberService memberService = new MemberService();
//객체 생성 어노테이션은 자동생성하면 위와 같이 객체를 생성해준다.
@Component
public class MemberService {
  public void aaa(){
    System.out.println("aaa 메서드 실행~");
  }
}

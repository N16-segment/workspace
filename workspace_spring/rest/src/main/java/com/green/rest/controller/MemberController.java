package com.green.rest.controller;

import com.green.rest.dto.MemberDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

//객체 생성 + 관제탑 역할(스프링에서는 컨트롤러) 부여
//이 클래스는 모든 요청(url)을 받는 클래스가 된다.
@RestController//현재의 클래스를 앞으로 관제탑 역할을 하도록 부여하는 어노테이션
@RequestMapping("/members")
@Slf4j
public class MemberController {

  @GetMapping("")//url은 복수형, 소문자, 복합어는 '-'하이픈사용, '/'미포함, 제어상태 미포함
  public void getMemberList(){
    System.out.println("getMemberList() 메서드 실행");
  }

  //회원 등록 -> localhost:8080/members(제어할 자원은 명사로 표현 but 제어할 상태는 포함하지 않는다.)
  @PostMapping("")
  public void insertMember(@RequestBody MemberDTO boardDTO){//Requestbody = urlbody라는 말이다.
    //자바스크립트의 객체 형식으로 포스트맨에서 데이터 입력하고 보내준다.
    System.out.println("insertMember() 메서드 실행");
    System.out.println(boardDTO.toString());
    //BoardDTO에서 @ToString 실행해줬으므로 불러오기 가능
  }

  //회원 한 명을 조회하는 기능
  //rest -> localhost:8080/members/aaa
  //url에 {}로 표현되는 내용은 값을 받아올 때 사용
  @GetMapping("/{memId}") //memId = "aaa" {memId}(변수명이라고 생각해)라는 변수에 aaa(url에 적혀있는)가 들어온다.
  public void getMember(@PathVariable("memId") String id){
    System.out.println("getMember() 메서드 실행");
    System.out.println("id = " + id);
  }
  //rest -> localhost:8080/members/aaa/20
  @GetMapping("/{memId}/{memAge}")
  public void getMember2(@PathVariable("memId") String memId, @PathVariable("memAge") int memAge){
    System.out.println("getMember2() 메서드 실행");
    System.out.println("memId = " + memId);
    System.out.println("memAge = " + memAge);
  }
  //회원 한 명을 삭제하는 기능을 제공하는 REST API를 만들어보시오.
  //(DELETE) localhost:8080/members/aaa
  @DeleteMapping("/{memId}")
  public void deleteMember(@PathVariable("memId") String memId){
    log.info("회원 한 명 삭제");
    log.info("memId = " + memId);
  }
  //회원 한 명의 이름과 나이를 변경하는 기능을 제공하는 REST API
  //(PUT) localhost:8080/members/aaa
  @PutMapping("/{memId}")
  public void updateMember(@PathVariable("memId") String memId, @RequestBody MemberDTO memberDTO){
    log.info("회원 한 명의 정보 업그레이드");
    log.info("memId = " + memId);
    log.info("memberDTO = " + memberDTO);
// 자료형이 String이므로 디폴트 값이 null이 된다.
// postman에서 넘겨준 자료가 두가지뿐이므로
  }
//회원의 CRUD를 만드세요.
  //Create-삽입(Insert) - Post
  //Read-조회(Select) - Get
  //Update-수정(Update) - Put
  //Delete-삭제(Delete) - Delete
//사원 정보 조회
// -> 사원 목록 조회 -> select * from emp;
// -> 사원 한 명 상세 조회 -> select * from emp where empno = 2;
  //사원 삭제 쿼리
  // ->Delete from emp where empno = 5; -> @PathVariable
  //업데이트 쿼리
  // -> Update emp set ename = 'java', sal = 300 where empno = 1; -> @ RequestBody(데이터가 많음)

  //'조회'는 @GetMapping을 쓰고 한, 두개의 간단한 데이터를 불러오려면 @PathVariable를 사용
  //객체처럼 많은 정보를 불러올때는 @PostMapping을 하고
  // 데이터를 많이 받기 위해서 @RequestBody로 클래스 변수를 불러온다.

  //Restful API(APPLICATION PROGRAMMING INTERFACE)
  //Rest로만 이루어진 API
  //요청(URL)를 작성하는 문법에 맞춘 통신할 수 있는 코딩

}

package com.green.member_manager.controller;

import com.green.member_manager.dto.MemberDTO;
import com.green.member_manager.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/members")
public class MemberController {
  ////ServiceImpl 클래스에서 만들어 준 메서드를 사용할 객체 선언
  private MemberService memberService;

  public MemberController(MemberService memberService){
    this.memberService = memberService;
  }
  /*회원 목록 조회 - REST API(메서드 만드는 것)*/
  @GetMapping("")
  public List<MemberDTO> getMemberList(){
    log.info("회원 목록 조회 시작~");
    return memberService.selectMemberList();
  }

  /*멤버 한명 상세 조회 SELECT - GET*/
  //(GET) localhost:8080/members/java
  //RESTFUL API
  //{memId}->쿼리의 빈값을 채우기 위한 용도로 레스트 api 에 이런 url 로 정보를 받아온다.
  //mapper 쿼리에 받을게 있고 없고로 판단해서
  //select 쿼리와 delete 쿼리는 @PathVariable 로 받는다.
  //@RequestBody 는 PostMapping, PutMapping - INSERT, POST(UPDATE)로 받는다.
  @GetMapping("/{memId}")
  public MemberDTO getMember(@PathVariable("memId") String memId){
    //객체명.메서드명
    //조회한 상세 데이터를 REACT 로 가져가기 위해 return
    return memberService.selectMember(memId);
  }

  /*한명의 회원 정보 등록 INSERT - POST*/
  //{memId}->쿼리의 빈값을 채우기 위한 용도로 레스트 api 에 이런 url 로 정보를 받아온다.
  //@RequestBody 는 PostMapping, PutMapping - INSERT, POST(UPDATE)로 받는다.
  //(POST) localhost:8080/members
  @PostMapping("")
  public int insertMember(@RequestBody MemberDTO memberDTO){
    return memberService.insertMember(memberDTO);
  }

  /*특정 멤버 한명 삭제 DELETE - DELETE*/
  //(DELETE) localhost:8080/members/java
  //{memId}->쿼리의 빈값을 채우기 위한 용도로 레스트 api 에 이런 url 로 정보를 받아온다.
  @DeleteMapping("/{memId}")
  public void deleteMember(@PathVariable("memId") String memId){
    memberService.deleteMember(memId);
  }

  /*회원 한명의 정보 수정 UPDATE - PUT*/
  //(PUT) localhost:8080/members/java
  //{memId}->쿼리의 빈값을 채우기 위한 용도로 레스트 api 에 이런 url 로 정보를 받아온다.
  //받아올 정보가 하나가 아닐 경우, 받아야 할 정보가 많을 경우 @REQUESTBODY 를 사용한다.
  @PutMapping("/{memId}")
  public void updateMember(@PathVariable("memId") String memId, @RequestBody MemberDTO memberDTO){
    //쿼리문에서 필요한 기능을 만든 내용만 가져오므로, 변경사항이 없는 기존의 내용도 불러와야 하므로
    memberDTO.setMemId((memId));
    //매개변수 memberDTO 는 mapper.xml 에서 만든 쿼리문(원하는 명령)의 빈값을 채워주기 위해서 사용한다.
    memberService.updateMember(memberDTO);
  }


}

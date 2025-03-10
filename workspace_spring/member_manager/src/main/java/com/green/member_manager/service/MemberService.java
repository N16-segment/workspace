package com.green.member_manager.service;

import com.green.member_manager.dto.MemberDTO;

import java.util.List;

public interface MemberService {

  /*회원 목록 조회 기능*/
  public List<MemberDTO> selectMemberList();

  /*한명 상세 조회 기능*/
  public MemberDTO selectMember(String memId);

  /*회원 등록을 하는 기능*/
  public int insertMember(MemberDTO memberDTO);

  /*회원 한명 삭제 기능*/
  public int deleteMember(String memId);

  /*회원 정보 수정 기능*/
  public void updateMember(MemberDTO memberDTO);

}


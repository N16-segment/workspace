package com.green.member_manager.service;

import com.green.member_manager.dto.MemberDTO;
import com.green.member_manager.mapper.MemberMapper;
import org.springframework.stereotype.Service;

import java.util.List;

//MemberServiceImpl memberServiceImpl = new MemberServiceImpl();
@Service
//->service 어노테이션 때문에 Override 하므로 프로젝트 런하자마자 객체를 자동 생성해준다.
public class MemberServiceImpl implements MemberService {
  //Mapper 인터페이스에서 만들어 준 메서드를 사용할 객체 선언
  private MemberMapper memberMapper;

  public MemberServiceImpl(MemberMapper memberMapper){
    this.memberMapper = memberMapper;
  }
  /*회원 목록 조회 기능 실제 실행*/
  @Override
  public List<MemberDTO> selectMemberList() {
    //객체명.메소드명();
    //회원 목록 조회 쿼리 실행 -> 조회되는 데이터를 리턴 받아온다.
    return memberMapper.selectMemberList();
  }

  /*한명 상세조회 기능 구현*/
  @Override
  public MemberDTO selectMember(String memId) {
    return memberMapper.selectMember(memId);
  }

  /*회원 등록 기능*/
  @Override
    public int insertMember(MemberDTO memberDTO) {
     return memberMapper.insertMember(memberDTO);
  }

  /*회원 삭제 기능*/
  @Override
//  리턴타입을 보이드로 하면 return 쓰지 않고, int 는 return! 실수 주의!!
  public int deleteMember(String memId) {
    return memberMapper.deleteMember(memId);
  }

  /*회원 정보 수정 기능*/
  @Override
  //  리턴타입을 보이드로 하면 return 쓰지 않고, int 는 return! 실수 주의!!
  public void updateMember(MemberDTO memberDTO) {
    memberMapper.updateMember(memberDTO);
  }


}

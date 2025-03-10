package com.green.member_manager.mapper;

import com.green.member_manager.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//xml 피일에 작성한 쿼리문을 실행시키는 메서드의 정의
//인터페이스는 생성자가 없으므로 객체를 만들 수 없다.
@Mapper//-> 객체 생성, 쿼리를 실행시켜줄 메서드를 정의
public interface MemberMapper {
  /*회원 목록 조회 쿼리 메서드*//*쿼리의 실행 결과를 담을 자료형이 리턴타입이 된다. */
  /*xml 에서 작성한 쿼리에 적어준 id와 동일한 매개변수를 불러온다.*/
  public List<MemberDTO> selectMemberList();

//  select를 제외한 모든 쿼리는 리턴타입 int(원칙) or void(가능)
  /*회원 한명 상세조회 쿼리 메서드*/
  public MemberDTO selectMember(String memId);

  /*회원 등록 쿼리를 실행하는 메서드*/
  public int insertMember(MemberDTO memberDTO);

  /*회원 삭제 쿼리 메서드*/
  public int deleteMember(String memId);

  /*회원 수정 쿼리 메서드*/
  public void updateMember(MemberDTO memberDTO);



}

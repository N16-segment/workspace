package com.green.basic_board.service;

import com.green.basic_board.dto.BoardDTO;
import com.green.basic_board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//핵심기능이 있는 클래스에 service라는 이름을 준다.
//implements(구현) BoardService 클래스를 구현한 BoardServiceImpl 클래스
@Service
public class BoardServiceImpl implements BoardService{
  //스프링에서는 객체생성할 수 없으므로 IOC 제어의 역전 선언만 해준다.
  private BoardMapper boardMapper;

  //생성자 주입
  @Autowired
  public BoardServiceImpl(BoardMapper boardMapper){
    this.boardMapper = boardMapper;
  }

  //게시글 목록 조회 '기능'을 실행하는 메서드! 필요하면 쿼리이외 다른 기능들도 실행하는 메서드
  @Override
  public List<BoardDTO> selectBoardList() {
    System.out.println("게시글 조회를 시작합니다.");
    //게시글 목록 조회 쿼리를 실행
    List<BoardDTO> boardlist = boardMapper.selectBoardList();
    System.out.println("게시글 조회를 완료했습니다.");
    return boardlist;
  }

  //하나의 게시글 정볼르 조회하는 기능
  @Override
  public BoardDTO getBoard(int boardNum) {
//    BoardDTO board = boardMapper.getBoard(boardNum);
//    return board; 두 줄 아래 한 줄로
      return boardMapper.getBoard(boardNum);
  }

  //게시글 등록 기능
  @Override
  public int insertBoard(BoardDTO boardDTO) {
    return boardMapper.insertBoard(boardDTO);
  }
}

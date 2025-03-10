package com.green.basic_board.service;

import com.green.basic_board.dto.BoardDTO;

import java.util.List;

//service : 프로젝트의 핵심 기능이 정의된 클래스
//BoardService 에서는 핵심 기능(메서드)을 정의만 한다.
public interface BoardService {
  //게시글 목록 조회 '기능' - 조회(쿼리)와 연관된 다른 기능들까지 포함
  //mapper에 있는 메서드와 똑같이 사용하면 된다.
  public List<BoardDTO> selectBoardList();

  //게시글 하나의 상세 정보 조회 기능
  public BoardDTO getBoard(int boardNum);

  //게시글 등록 기능 메서드
  public int insertBoard(BoardDTO boardDTO);
}


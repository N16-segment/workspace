package com.green.board.service;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.SearchDTO;

import java.util.List;

public interface BoardService {

  // 게시판 목록 조회 기능
  public List<BoardDTO> selectBoardList(SearchDTO searchDTO);

  // 게시글 작성 등록하는 기능
  public void insertBoard(BoardDTO boardDTO);

  // 게시글 상세 조회 기능
  public BoardDTO selectBoard(int boardNum);

  // 게시글 삭제하는 기능
  public void deleteBoard(int boardNum);

  // 게시글 내용을 수정하는 기능
  public void updateBoard(BoardDTO boardDTO);

  // 게시글 조회수 증가하는 기능
  public void updateReadCnt(int boardNum);




}

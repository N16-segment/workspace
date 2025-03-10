package com.green.board.mapper;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.SearchDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
  //  게시판 목록 조회 쿼리 메서드 - 목록[] -필요시마다 DTO클래스는 만들면 된다.
  public List<BoardDTO> selectBoardList(SearchDTO searchDTO);

  //  게시글 작성 등록하는 쿼리 메서드
  public void insertBoard(BoardDTO boardDTO);

  // 게시글 상세 조회 쿼리 메서드 - 한줄{}
  public BoardDTO selectBoard(int boardNum);

  // 게시글 삭제하는 쿼리 메서드
  public void deleteBoard(int boardNum);

  //  게시글 내용을 수정하는 쿼리 메서드
  public void updateBoard(BoardDTO boardDTO);

  // 게시글 조회수 증가하는 쿼리 메서드
  public void updateReadCnt(int boardNum);






}

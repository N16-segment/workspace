package com.green.board.service;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.SearchDTO;
import com.green.board.mapper.BoardMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {
  private BoardMapper boardMapper;

  public BoardServiceImpl(BoardMapper boardMapper) {
    this.boardMapper = boardMapper;
  }

  // 게시판 목록 조회 기능 구현
  @Override
  public List<BoardDTO> selectBoardList(SearchDTO searchDTO) {
    return boardMapper.selectBoardList(searchDTO);
  }

  // 게시글 작성 등록하는 기능 구현
  @Override
  public void insertBoard(BoardDTO boardDTO) {
    boardMapper.insertBoard(boardDTO);
  }

  // 게시글 상세 조회 기능 구현
  @Override
  public BoardDTO selectBoard(int boardNum) {
    return boardMapper.selectBoard(boardNum);
  }

  // 게시글 삭제하는 기능 구현
  @Override
  public void deleteBoard(int boardNum) {
    boardMapper.deleteBoard(boardNum);
  }


  // 게시글 내용을 수정하는 기능 구현
  @Override
  public void updateBoard(BoardDTO boardDTO) {
    boardMapper.updateBoard(boardDTO);
  }

  // 게시글 조회수 증가하는 기능 구현
  @Override
  public void updateReadCnt(int boardNum) {
    boardMapper.updateReadCnt(boardNum);
  }


}

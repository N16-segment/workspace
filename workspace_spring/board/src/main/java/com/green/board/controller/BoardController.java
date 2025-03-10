package com.green.board.controller;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.SearchDTO;
import com.green.board.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/boards")
public class BoardController {
  private BoardService boardService;

  public BoardController(BoardService boardService) {
    this.boardService = boardService;
  }

  //localhost:8080 -> ~
  // 게시글 목록 조회 api- select(get)~/boards
  @GetMapping("")
  public List<BoardDTO> getBoardList(SearchDTO searchDTO){
    log.info("게시글 목록을 보여주세요");
    System.out.println(searchDTO);
    return boardService.selectBoardList(searchDTO);
  }

  // 게시글 작성 등록 api- insert(post)~boards
  @PostMapping("")
  public void insertBoard(@RequestBody BoardDTO boardDTO){
    boardService.insertBoard(boardDTO);
  }

  //  게시글 상세 조회 api- select(get)~boards/1
  @GetMapping("/{boardNum}")
  public BoardDTO getBoard(@PathVariable("boardNum") int boardNum){
    /*상세조회 안에 조회수 올라가는 내용을 같이 출력해준다.*/
    boardService.updateReadCnt(boardNum);
    return boardService.selectBoard(boardNum);
  }

  // 게시글 삭제 api- delete(delete)~boards/1
  @DeleteMapping("/{boardNum}")
  public void deleteBoard(@PathVariable("boardNum") int boardNum){
    boardService.deleteBoard(boardNum);
  }

  // 게시글 내용을 수정 api- update(put)~boards/1
  @PutMapping("/{boardNum}")
  public void updateBoard(@PathVariable("boardNum") int boardNum, @RequestBody BoardDTO boardDTO){
    boardDTO.setBoardNum(boardNum);
    boardService.updateBoard(boardDTO);
  }
//get, delete 는 @PathVariable 로 받고,
//put, post 는 @RequestBody 로 받는다. -> 기본적으로 이렇게 적용

  // 게시글 조회수 증가하는 내용 수정 api - update(put)~boards/1
//  @PutMapping("/{boardNum}")
//  public void updateReadCnt(@PathVariable("boardNum") int boardNum){
//    boardService.updateReadCnt(boardNum);
//  }


}

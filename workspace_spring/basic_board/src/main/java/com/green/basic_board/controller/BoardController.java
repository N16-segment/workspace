package com.green.basic_board.controller;

import com.green.basic_board.dto.BoardDTO;
import com.green.basic_board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//관제탑 기능부여
@RequestMapping("/boards")
public class BoardController {
  //인터페이스에서 만들어준 객체 선언
  private BoardService boardService;

  //객체 생성
  //만약 클래스 안에 생성자가 1개만 있으면 @Autowired를 생략해도
  //자동으로 @Autowired를 붙여준다.
  //@Autowired -> 생략 가능
  public BoardController(BoardService boardService){
    this.boardService = boardService;
  }
  //게시글 목록 조회 기능을 제공하는 REST API를 해당 컨트롤러에 만들어본다.
  //데이터를 조회하는 기능이므로 get 메서드 사용
  //(GET) ㅣlocalhost:8080/boards
  @GetMapping("")
  public List<BoardDTO> getBoardList(){
    List<BoardDTO> boardList = boardService.selectBoardList();
    return boardList;
  }

  //게시글 하나의 정보를 조회하는 기능을 제공하는 REST API
  //(GET) localhost:8080/boards/3
  @GetMapping("/{boardNum}")
  public BoardDTO getBoard(@PathVariable("boardNum") int boardNum){
   return boardService.getBoard(boardNum);
  }

  //게시글 등록 REAT API
  //RequestBody 는 POST랑 PUT
  //(POST) localhost:8080/boards
  @PostMapping("")
  public int insertBoard(@RequestBody BoardDTO boardDTO){
    System.out.println(boardDTO);
    return boardService.insertBoard(boardDTO);

  }

}

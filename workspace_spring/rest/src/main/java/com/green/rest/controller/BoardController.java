package com.green.rest.controller;

import com.green.rest.dto.BoardDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j//log.info출력
@RequestMapping("boards")
public class BoardController {
  //1. 모든 게시글을 조회하는 기능을 제공하는 REST API
  //(GET) localhost;8080/boards
  @GetMapping("")
  public void getBoardList(){
    //log 출력한 것만 이력이 남는다. 어떻게 출력이 되는지 이력을 남기기 위해 log를 사용한다.
    log.info("게시글 목록 조회");
  }
  //2. 하나의 게시글의 정보를 조회하는 기능을 제공하는 REST API
  //어떤 글번호 데이터를 조회할건지 프라이머리 키로 구분 가능한 데이터를 조회한다.
  //(GET) localhost:8080/boards/3 ->url에서 변하는 값을 PathVariable로 준다.
  @GetMapping("/{boardNum}")
  public void getBoard(@PathVariable("boardNum") int boardNum){
    log.info("게시글 하나의 상세 정보 조회");
    log.info("boardNum = " + boardNum);
  }
  //3. 하나의 게시글을 등록하는 기능을 제공하는 REST API
  //(POST) localhost:8080/boards
  @PostMapping("")
  public void insertBoard(@RequestBody BoardDTO boardDTO){
    log.info("게시글 상세 등록");
    log.info("boardDTO = " + boardDTO);
    log.info(boardDTO.toString());
    System.out.println("boardDTO = " + boardDTO);
    System.out.println(boardDTO);
  }


}

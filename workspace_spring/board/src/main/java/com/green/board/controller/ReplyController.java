package com.green.board.controller;

import com.green.board.dto.QueryStringTestDTO;
import com.green.board.dto.ReplyDTO;
import com.green.board.service.ReplyService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.springframework.boot.ansi.AnsiOutput;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.List;

@Slf4j
@RestController
//Controller는 여러개 만들어도 되지만 RequestMapping의 주소는 무조건 달라야 한다.
@RequestMapping("/replies")
public class ReplyController {
  private ReplyService replyService;

  public ReplyController(ReplyService replyService) {
    this.replyService = replyService;
  }

  //댓글 목록 조회 api
  //(get) localhost:8080/replies/3
  @GetMapping("/{boardNum}")
  public List<ReplyDTO> getReplyList(@PathVariable("boardNum") int boardNum){
    return replyService.getReplyList(boardNum);
  }

  //댓글 등록 api
  //(post) localhost:8080/replies
  @PostMapping("")
  public void insetReply(@RequestBody ReplyDTO replyDTO){//여기에도 boardDTO가 들어와도 된다.
    replyService.insertReply(replyDTO);
  }

  //Query String 실습에서 실행 버튼 데이터 전송한 내용 받아오기
//  @GetMapping("/test")
//  public void test(@RequestParam("age") int age, @RequestParam("name") String name){
//    System.out.println("age=" + age);
//    System.out.println("name=" + age);
//    log.info("age=" + age);
//    log.info("name=" + name);
//  }

  //댓글 삭제 api
  //localhost:8080/replies/2
  @DeleteMapping("/{replyNum}")
  public void deleteReply(@PathVariable("replyNum") int replyNum){
    replyService.deleteReply(replyNum);
  }


  @GetMapping("/test")
  public void test(QueryStringTestDTO queryStringTestDTO){
    System.out.println(queryStringTestDTO);
  }
}

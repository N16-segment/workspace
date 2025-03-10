package com.green.board.service;

import com.green.board.dto.ReplyDTO;
import com.green.board.mapper.ReplyMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyServiceImpl implements ReplyService{
  private ReplyMapper replyMapper;

  public ReplyServiceImpl(ReplyMapper replyMapper) {
    this.replyMapper = replyMapper;
  }

  //댓글 목록 조회 기능 구현
  @Override
  public List<ReplyDTO> getReplyList(int boardNum) {
    return replyMapper.getReplyList(boardNum);
  }

  //댓글 등록 쿼리 기능 구현
  @Override
  public void insertReply(ReplyDTO replyDTO) {
    replyMapper.insertReply(replyDTO);
  }

  @Override
  public void deleteReply(int replyNum) {
    replyMapper.deleteReply(replyNum);
  }
}

package com.green.react_shop.service;

import com.green.react_shop.dto.OrderDTO;
import com.green.react_shop.mapper.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{
  private final OrderMapper orderMapper;

  //주문 목록 조회 기능 구현
  @Override
  public List<OrderDTO> getOrderList() {
    return orderMapper.getOrderList();
  }


  //주문 등록 기능 구현
  @Override
  public void insertOrderItem(OrderDTO orderDTO) {
    orderMapper.insertOrderItem(orderDTO);
  }

  //주문 상세정보 조회 기능 구현
  @Override
  public OrderDTO selectOrderItem(int orderNum) {
    return selectOrderItem(orderNum);
  }

  //주문 정보 수정 기능 구현
  @Override
  public void updateOrderItem(OrderDTO orderDTO) {
    orderMapper.updateOrderItem(orderDTO);
  }



}

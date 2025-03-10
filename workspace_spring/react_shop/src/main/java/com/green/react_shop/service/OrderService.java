package com.green.react_shop.service;

import com.green.react_shop.dto.OrderDTO;

import java.util.List;

public interface OrderService {
  //주문 목록 조회 기능
  public List<OrderDTO> getOrderList();

  //주문 등록 기능
  public void insertOrderItem(OrderDTO orderDTO);

  //주문 상세정보 조회 기능
  public OrderDTO selectOrderItem(int orderNum);

  //주문 정보 수정 기능
  public void updateOrderItem(OrderDTO orderDTO);



}

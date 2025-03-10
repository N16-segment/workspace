package com.green.react_shop.mapper;

import com.green.react_shop.dto.ItemDTO;
import com.green.react_shop.dto.OrderDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
  //주문 목록 조회 쿼리 메서드
  public List<OrderDTO> getOrderList();

  //주문 등록 쿼리 메서드
  public void insertOrderItem(OrderDTO orderDTO);

  //주문 상세정보 조회 쿼리 메서드
  public OrderDTO selectOrderItem(int orderNum);

  //주문 정보 수정 쿼리 메서드
  public void updateOrderItem(OrderDTO orderDTO);


}

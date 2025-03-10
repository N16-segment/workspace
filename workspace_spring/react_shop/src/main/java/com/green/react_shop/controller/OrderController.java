package com.green.react_shop.controller;

import com.green.react_shop.dto.OrderDTO;
import com.green.react_shop.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderController {
  private final OrderService orderService;

  //주문 목록 조회 api
  //localhost:8080/orders
  @GetMapping("")
  public List<OrderDTO> selectOrderList(){
    log.info("주문 목록을 보여주세요");
    return orderService.getOrderList();
  }

  //주문 등록 기능 api
  //localhost:8080/orders
  @PostMapping("")
  public void insertOrderItem(@RequestBody OrderDTO orderDTO){
    orderService.insertOrderItem(orderDTO);
  }

  //주문 상세정보 조회 기능 api
  //localhost:8080/orders/2
  @GetMapping("/{orderNum}")
  public void selectOrderItem(@PathVariable("orderNum") int orderNum){
    orderService.selectOrderItem(orderNum);
  }

  //주문 정보 수정 기능 api
  //localhost:8080/orders/2
  @PutMapping("")
  public void updateOrderItem(@RequestBody OrderDTO orderDTO){
    orderService.updateOrderItem(orderDTO);
  }



}

package com.green.rest_test.controller;

import com.green.rest_test.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.juli.logging.Log;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/orders")
public class OrderController {
  //1. 모든 주문정보를 조회하는 기능을 제공하는 REST API
  //(GET) localhost8080:orders
  @GetMapping("")
  public void getOrderList(){
    log.info("주문 내역 조회");
  }

  //2. 하나의 주문정보를 조회하는 기능을 제공하는 REST API
  //(GET) localhost8080:orders/1
  @GetMapping("/{productNum}")
  public void getOrder(@PathVariable("productNum") int productNum){
    log.info("주문 내역 하나의 정보 조회");
  }

  //3. 하나의 주문정보를 등록하는 기능을 제공하는 REST API
  //(POST) localhost:8080/orders
  @PostMapping("")
  public void insertOrder(@RequestBody OrderDTO orderDTO){
    log.info("하나의 주문정보 등록");
  }

  //4. 하나의 주문정보를 삭제하는 기능을 제공하는 REST API
  //(DELETE) localhost:8080/orders/1
  @DeleteMapping("/{productNum}")
  public void deleteOrder(@PathVariable("productNum") int productNum){
    log.info("하나의 주문정보 삭제");
  }

  //5. 하나의 주문정보에서 상품명과 상품가격을 수정하는 기능을 제공하는 REST API
  //(PUT) localhost:8080/orders
  @PutMapping("/{productNum}")
  public void updateOrder(@RequestBody OrderDTO orderDTO, @PathVariable("productNum") int productNum){
    log.info("하나의 주문정보 수정");
  }

}

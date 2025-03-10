package com.green.rest.controller;

import com.green.rest.dto.ItemDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("items")
public class ItemController {
  //모든 상품을 조회하는 기능을 제공하는 REST API
  //(GET) localhost:8080/items
  @GetMapping("")
  public void getItemList(){
    log.info("상품 목록 조회");
  }
  //상품 하나를 조회하는 기능을 제공하는 REST API
  //(GET) localhost:8080/items/12
  @GetMapping("/{itemCode}")
  public void getItem(@PathVariable("itemCode") int itemCode){
    log.info("상품 하나의 정보 조회");
    log.info("itemCode = " + itemCode);
  }

  //상품 하나를 등록하는 기능을 제공하는 REST API
  //(POST) localhost:8080/items
  @PostMapping("")
  public void insertItem(@RequestBody ItemDTO itemDTO){
    log.info("상품 상세 등록");
    log.info("itemDTO = " + itemDTO);
    log.info(itemDTO.toString());
  }

  //상품 하나를 삭제하는 기능을 제공하는 REST API
  //(DELETE) localhost:8080/items/12
  @DeleteMapping("/{itemCode}")
  public void deleteItem(@PathVariable("itemCode") int itemCode){
    log.info("상품 한 개 삭제");
    log.info("itemCode = " + itemCode);
  }

  //상품 하나의 상품명과 가격, 색상을 변경하는 기능 제공 REST API->UPGRADE
  //(PUT) localhost:8080/items/12
  @PutMapping("/{itemCode}")
  public void upgradeItem(@PathVariable("itemCode") int itemCode, @RequestBody ItemDTO itemDTO){
    log.info("상품 한 개의 정보 업그레이드");
    log.info("itemCode = " + itemCode);
    log.info("itemDTO = " + itemDTO);
  }

}

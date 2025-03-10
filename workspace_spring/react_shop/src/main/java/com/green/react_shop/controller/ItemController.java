package com.green.react_shop.controller;

import com.green.react_shop.dto.ItemDTO;
import com.green.react_shop.service.ItemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/items")
public class ItemController {
  private final ItemService itemService;


  //상품 목록 조회 api
  //localhost:8080/items
  @GetMapping("")
  public List<ItemDTO> getItemList(){
    log.info("상품 목록을 보여주세요");
    return itemService.selectItemList();
  }

  //상품 등록 기능 api
  //localhost:8080/items
  @PostMapping("")
  public void insertItem(@RequestBody ItemDTO itemDTO){
    itemService.insertItem(itemDTO);
  }

  //상품 상세정보 조회 기능 api
  //localhost:8080/items/2
  @GetMapping("/{itemNum}")
  public ItemDTO selectItem(@PathVariable("itemNum") int itemNum){
    return itemService.selectItem(itemNum);
  }

  //상품 정보 수정 기능 api
  //localhost:8080/items
  @PutMapping("")
  public void updateItem(@RequestBody ItemDTO itemDTO){
    itemService.updateItem(itemDTO);
  }


}


package com.green.react_shop.service;

import com.green.react_shop.dto.ItemDTO;

import java.util.List;

public interface ItemService {
  //상품 목록 조회 기능
  public List<ItemDTO> selectItemList();

  //상품 등록 쿼리 기능
  public void insertItem(ItemDTO itemDTO);

  //상품 상세정보 조회 쿼리 기능
  public ItemDTO selectItem(int itemNum);

  //상품 정보 수정 쿼리 기능
  public void updateItem(ItemDTO itemDTO);


}

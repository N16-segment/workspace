package com.green.react_shop.service;

import com.green.react_shop.dto.ItemDTO;
import com.green.react_shop.mapper.ItemMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService{
  private final ItemMapper itemMapper;


  //상품 목록 조회 기능 구현
  @Override
  public List<ItemDTO> selectItemList() {
    return itemMapper.selectItemList();
  }
  //상품 등록 기능 구현
  @Override
  public void insertItem(ItemDTO itemDTO) {
    itemMapper.insertItem(itemDTO);
  }

  //상품 상세정보 조회 기능 구현
  public ItemDTO selectItem(int itemNum){
    return itemMapper.selectItem(itemNum);
  }

  //상품 정보 수정 기능 구현
  public void updateItem(ItemDTO itemDTO){
    itemMapper.updateItem(itemDTO);
  }


}

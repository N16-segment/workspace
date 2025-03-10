package com.green.shop.service;

import com.green.shop.dto.ShopDTO;

import java.util.List;

//핵심기능을 정의(추상메서드-통상적으로 쿼리작업-로 선언)한 인터페이스
//여기서 핵심기능을 정의만 한다. -> impl에서 구현
//인터페이스에서는 어짜피 정의밖에 못한다.
//mapper에서 만든 추상매서드를 그대로 가져오면 된다 -> 메서드 정의
public interface ShopService {
  //상품 등록 기능 메서드
  public int insertShop(ShopDTO shopDTO);

  //상품 목록 조회 기능 실행 메서드
  public List<ShopDTO> selectShopList();

  //상품 하나 조회 실행 메서드
  public ShopDTO selectItem(int itemCode);

  //상품 하나 삭제 실행 메서드
  public void deleteItem(int itemCode);

  //상품 수정 -업데이트 기능 실행 메서드
  public void updateShop(ShopDTO shopDTO);

}

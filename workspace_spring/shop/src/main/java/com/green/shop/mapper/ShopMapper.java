package com.green.shop.mapper;

import com.green.shop.dto.ShopDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
//객체 생성 + 해당 파일에 쿼리를 실행시킬 메서드가 정의되어 있다는 것을 인지시켜줌
//여기에 쿼리 실행할 메서드 있다고 알려줌

//메서드의 리턴타입 : 쿼리 실행 '결과'를 가져올 자료형
//select를 제외한 나머지의 리턴타입은 int
//변수명()->안의 (매개변수)는 빈값을 채워줄 데이터 내용을 전달
@Mapper
public interface ShopMapper {
  //서비스 인터페이스에 그대로 갖다 복사하면 된다.
  //상품 등록 쿼리 실행 메서드 -> 쿼리 실행 메서드는 기능 메서드의 한 부분
  public int insertShop(ShopDTO shopDTO);

  //상품 목록 조회 쿼리 실행 메서드
  public List<ShopDTO> selectShopList();

  //상품 하나 조회 쿼리 메서드
  public ShopDTO selectItem(int itemCode);

  //리턴타입 인서트 딜리트 업데이트 할때는 int대신 void써도 무방
  //특정 상품 번호에 해당하는 상품을 삭제하는 쿼리 메서드 - 삭제
  public void deleteItem(int itemCode);

  //특정 상품번호에 해당하는 상품의 상품명, 가격, 상품설명을 수정하는 쿼리 - 업데이트
  //셀렉트 말고는 리턴타입 int 대신 void 쓰면 된다.
  public void updateShop(ShopDTO shopDTO);

}

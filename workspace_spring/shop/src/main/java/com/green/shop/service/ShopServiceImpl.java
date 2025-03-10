package com.green.shop.service;

import com.green.shop.dto.ShopDTO;
import com.green.shop.mapper.ShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//shopservice에서 정의한 기능을 사용하겠다.
//핵심 기능을 구현
//핵심 기능은 쿼리 실행이라고 생각하면 되고,
// -> 쿼리 실행을 위해서는 ShopMapper 인터페이스의 객체가 있어야 한다.
//shop-mapper에서 메서드를 만든 것을 여기로 가져와서 실행하려고 하므로
//shop-mapper에서(IOC-제어의 역전) 객체를 만들어 놓고 그걸 가져와야한다.(DI-생성자 주입)
@Service
public class ShopServiceImpl implements ShopService{
  private ShopMapper shopMapper;//(DI)-의존성 주입 받아 두었다.

  //생성자가 하나면 @autowired는 생략 가능
  @Autowired
  public ShopServiceImpl(ShopMapper shopMapper){
    this.shopMapper = shopMapper;
  }

  //ShopService에서 만들어진 상품 등록 기능 메서드(DI)를 불러온 것이므로 실제로
  //상품 등록 기능 메서드 기능을 한다.
  @Override
  public int insertShop(ShopDTO shopDTO) {
    System.out.println("상품의 재고를 확인한다");
    System.out.println("상품에 이상이 없는지 확인한다.");
    //이미 만들어진 매개변수만 ()에 넣어주면 된다.
    //모두 확인 후 상품을 등록한다. -> 쿼리 실행
   int result = shopMapper.insertShop(shopDTO);

    System.out.println("잘 등록됐는지 확인한다.");
    return result;
  }

  //상품 목록 조회 기능 실행 메서드
  @Override
  public List<ShopDTO> selectShopList(){
     return shopMapper.selectShopList();

  }
  //상품 하나 조회 기능 실행 메서드
  @Override
  public ShopDTO selectItem(int itemCode){
    return shopMapper.selectItem(itemCode);
  }

  //특정 상품 번호에 해당하는 상품을 삭제하는 기능 실행 메서드
  @Override
  public void deleteItem(int itemCode) {
    shopMapper.deleteItem(itemCode);//리턴타입이 void이므로 return은 없다.

  }

  //특정 상품 번호에 해당하는 내용을 수정하는 기능 실행 메서드
  @Override
  public void updateShop(ShopDTO shopDTO) {
    shopMapper.updateShop(shopDTO);
  }


}

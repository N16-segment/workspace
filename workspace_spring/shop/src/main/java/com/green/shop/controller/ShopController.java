package com.green.shop.controller;

import com.green.shop.dto.ShopDTO;
import com.green.shop.service.ShopService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shops")
public class ShopController {
  private ShopService shopService;//의존성 주입으로 이쪽으로 데이터가 들어온다.

  @Autowired
  public ShopController(ShopService shopService){
    this.shopService = shopService;
  }

  //상품 하나를 등록하는 기능 API
  @PostMapping("")//포스트랑 풋도 동일하게 보면 되므로 리퀘스트바디로 받는다.
  //변수명 지정해서 (@RequestBody로 받아줄 shopDTO 객체를 매개변수로)
  public void regItem(@RequestBody ShopDTO shopDTO){
    System.out.println(shopDTO);
    //매개변수에는 ShopDTO 자료형이 들어와야 함
    //매개변수로 쿼리의 빈 값을 채워 줄 거임
    //-> 상품명, 상품가격, 상품설명 3개 데이터가 들어있는
    //ShopDTO 객체를 매개변수로 전달해야 함
    //Postman에서 전달받은 데이터를 DB쿼리로 등록
    shopService.insertShop(shopDTO);

  }
  //상품조회
  @GetMapping("")
  public List<ShopDTO> getShopList(){
    return shopService.selectShopList();

  }

  //상품하나 조회
  //localhost:8080/shops/2
  @GetMapping("/{itemCode}")//겟이랑 딜리트는 패스배리어블로 받는다.
  public ShopDTO getItem(@PathVariable("itemCode") int itemCode){
    return shopService.selectItem(itemCode);
  }

  //특정 상품 번호에 해당하는 상품 삭제
  //localhost:8080/shops/3
  @DeleteMapping("/{itemCode}")
  //빈값 채울게 있으면 매개변수 넣어줘야함
  public void deleteItem(@PathVariable("itemCode") int itemCode){
    //아이템 코드라는 변수를 받아서 ()에 넣어주겠다.
    //쿼리에 빈값이 있으면 받아온다.
    shopService.deleteItem(itemCode);
  }

  //url로 넣는 거는 패스배리어블
  //객체로 넣는 거는 리퀘스트바디

  //특정 상품 번호 해당하는 상품 수정 - 업데이트 - 옛날방식
  //url사용하는 rest가 없었을때 putmapping을 안쓰고 아래처럼 postmapping을 썼다.
  //(Post)localhost:8080/shops/update
  @PostMapping("/update")
  //post는 requestbody로 받는다.
  public void updateItem(@RequestBody ShopDTO shopDTO){
    shopService.updateShop(shopDTO);
  }

  //풋이랑 포스트는 리퀘스트바디로 받아왔는데,
  //레스트 문법에서 url을 받아오므로 풋에서 패스배리어블도 받아줘야한다.
  //(Put)localhost:8080/shops/2
  // -> Rest 하게 맞춘다면 위에서 업데이트처럼 상태를 나타낼 필요 없다. - 요즘 방식
  //몇 번째(어떤 데이터)를 바꿀건지 표시하면 됨
  //Rest 문법의 기본 -> url에 들어오는 값이 달라진다. itemCode
  @PutMapping("/{itemCode}")
  public void updateItem2(@PathVariable("itemCode") int itemCode, @RequestBody ShopDTO shopDTO){
    shopDTO.setItemCode(itemCode);
    shopService.updateShop(shopDTO);
  }


}

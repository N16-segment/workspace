import { Image, Pressable, SafeAreaView, StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useState } from 'react'
import icon_edit from '@/assets/icons/edit.png'
import icon_delete from '@/assets/icons/delete.png'
import { icon } from '../constants/icons'
import { data } from '../data/data'
import Task from './Task'
//@/로 주소를 넣으면 import할때 최상위에서 주소를 찾는 것이라서 폴더만 간편히 찾아서 넣는다.
//변하지 않는 값이 상수만 모아두는 constants에 컬러처럼 이미지를 넣어두고 꺼내쓰면 간편하다. 
const CartList = () => {
  console.log(Math.max(1, 5, 3));
  //장바구니 목록데이터를 가져오는 useState 변수 
  // -> 스테이트 변수 값이 바뀌면 화면을 다시 그려주므로 useState변수를 사용해서 값을 받는다.
  const [cartList, setCartList] = useState(data);
  //키보드로 입력한 데이터를 저장
  const [newItem, setNewItem] =useState('');

  // for(let i = 0 ; i < cartList.length; i++){} ->자바스크립트
  // const aaa = cartList.forEach((e, i)=>{
  //   console.log(e);
  // });
  // console.log(aaa);
  //반복문에서 map을 사용하는 이유는 리턴해주기 위해서 -> map만 리턴된다. 
  // const bbb = cartList.map((e, i)=>{
  //   return e.id;
  // });
  // console.log(bbb);
  // cartList.map((e, i)=>{});

 
  return (
    <View>
      <Text>CartList</Text>
      {/* <Image source={icon_edit}
      tintColor={'pink'}
      />
      <Image source={icon_delete}
      tintColor={'red'}
      />
      <Image source={icon.ICON_EDIT}
      tintColor={'grey'}
      /> */}
      <SafeAreaView style={styles.backboard}>
      {
        cartList.map((e, i)=>{
          return(
              <Task 
                key={i} 
                e={e} 
                cartList={cartList} 
                setCartList={setCartList}
              />
              //e는 props로 전달한 데이터이고, i는 반복구분일뿐 props랑 무관
              //전체 데에터를 props해준다.
          )
        })
      }
     </SafeAreaView>
      <View>
        <TextInput
        style={styles.input}
        value={newItem}
        onChangeText={text => setNewItem(text)}
        //키보드의 완료, enter 키를 눌렀을 때 실행하는 이벤트
        // onSubmitEditing={()=>{alert(`${newItem}`)}}        
        onSubmitEditing={()=>{
        //max id + 1 구하기
        let max = cartList[0].id
        for (const e of cartList){
          if(max < e.id){
            max = e.id;
          }
        }
        // map으로 반복되는 cartList의 데이터에서 
        // 각각의 객체 e에 있는 데이터 중 id만 꺼내서 배열형태로 만들어 준 뒤, 
        // spread연산으로 껍질까서 하나씩 따로 데이터를 사용할 수 있도록 한 다음 최대값을 꺼내준다.
        const max1 = Math.max(...cartList.map((e,i)=>{return e.id}));
        //저장할 객체를 생성
        const newData = {
          id : max + 1,
          item : newItem
        };
        
        setCartList([...cartList, newData]);
        setNewItem('');

        }}
        //cartList에 저장        
        />
      </View>
    </View>
  )
}

export default CartList

const styles = StyleSheet.create({
 
  backboard : {
    backgroundColor : '#C9E9D2',
    paddingHorizontal : 20,
    // borderWidth : 1
  },
  input : {
    borderWidth : 1
  }
})
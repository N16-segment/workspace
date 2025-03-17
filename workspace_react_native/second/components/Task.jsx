import { Image, Pressable, StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useEffect, useState } from 'react'
import { icon } from '../constants/icons'


const Task = ({e, cartList, setCartList}) => {
  //각 상품이 수정 상태인지, 수정 상태가 아닌지 판단하는 변수 - 리액트-네이티브 5장에 있는 내용 참고
  //수정 상태 여부
  const [isEditing, setIsEditing] = useState(false);

  //수정을 위해서는 input태그에 입력한 글자, id도 필요
  //전체 데이터도 필요

  //input태그에 입력한 데이터 
  //주의!!!! props로 전달된 데이터를 state 변수의 초기값으로 주면 안됨
  const [newText, setNewText] = useState('');

  /*
  Task에서 newText 값을 'java로 변경'
  이 상태에서 부모 컴포넌트인 CartList가 재렌더링이 발생, 예시로,
  cartList data의 id가 3인 데이터의 제목이 '안녕하세요'로 변경되었다.
  부모의 데이터가 변경되어 재렌더링이 되면서 Task컴포넌트도 재렌더링이 되지만 
  state에 props로 넘어오는 데이터는 재렌더링되면서 state변수에 바로 적용되는 것이 아니어서 문제가 된다.
  -최근에 저장된 (마지막)데이터의 값이 남아있다.-
  리렌더링 되었을때 변경된 값으로 바꿔주기 위해선 부모가 재렌더링 되는 시점에 
  같이 재렌더링 될 수 있게 useEffect를 사용해서 props로 가져온 변경된 데이터의 시점에도 재렌더링해줘서 
  초기값을 변경해준다.
  */
  //props로 넘어온 데이터는 useEffect로 받아서 쓴다.
  useEffect(()=>{
    setNewText(e.item);
  }, [e]);

  //장바구니 목록 데이터 수정
  const handleCartList = () =>{
    //상품목록에서 현재 수정 중인 상품의 id를 찾아서
    //찾은 상품의 item 속성 값을 input태그에 입력한 글자로 변경한다.
    // cartList;
    // e.id;
    // newText; 
    // setCartList();

    //---1번 풀이---//
    // const copyCartList = [...cartList];
    // for(const cart of copyCartList){
    //   if(cart.id === e.id){
    //     cart.item = newText;
    //   }
    // }
    // setCartList(cartList); 이렇게는 변경된 값을 불러올 수 없다.
    //setCartList([...cartList]); 값을 바꾸고 넣어 준다.
    //setCartList(copyCartList); //기존의 값(cartList)은 두고 변경된 값을 넣어준다.-1번풀이 적용
    //---1번 풀이 끝---//

    //---2번 풀이---//
    //find : 조건과 일치하는 데이터만 리턴한다.
    //filter : 조건과 일치하는 데이터만 제외한다.
    const copyCartList = [...cartList];
    const editCart = cartList.find((cart)=>{return cart.id === e.id});
    editCart.item = newText;
    setCartList(copyCartList);
    //---2번 풀이 끝---//
  
  }

  return (
    <View style={styles.container}>
      {
        isEditing
        ?
        <>
        <TextInput 
          style={styles.input}
          autoFocus={true}  
          //포커스 아웃 이벤트 -> 깜빡이는 커서가 안보이는 곳을 클릭할 때 적용
          //포커스를 잃었을 때 진행되는 내용
          onBlur={()=>{
            setIsEditing(false);//수정상태 사라짐
            setNewText(e.item);//원래의 데이터를 가져온다.
          }}
          onChangeText={text=>setNewText(text)}
          value={newText}
          onSubmitEditing={()=>{handleCartList()}}
        />
        </>
        :
        <>
          <Text style={styles.title}>{e.item}</Text>
          <Pressable onPress={()=>{setIsEditing(true)}}>
           <Image source={icon.ICON_EDIT}
                 tintColor={'pink'}
                 style={styles.img}
           />
          </Pressable>
      
          <Pressable onPress={()=>{}}>
           <Image source={icon.ICON_DELETE}
                  tintColor={'red'}
                  style={styles.img}
           />
          </Pressable>
        </>

      }
                  
    </View>
  )
}

export default Task

const styles = StyleSheet.create({
  container : {
    borderWidth : 1,
    margin : 12,
    backgroundColor : '#002233',
    borderRadius : 6,
    flexDirection : 'row',
    alignItems : 'center',
    justifyContent : 'center',
    padding : 10,
    gap : 8
  },
  title : {
    flex : 1,
    color : 'white',
    fontSize : 16
  },
  img : {
    width : 25,
    height : 25
  },
  input : {
    borderWidth : 1,
    width : '100%',
    color : 'white'
  }
})
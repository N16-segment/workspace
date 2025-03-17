import { Pressable, StyleSheet, Text, View } from 'react-native'
import React, { useState } from 'react'
import { COLOR } from '../constants/colors'

const MyButton = ({size='normal', onPress, title='press me'}) => {
  return (
    //<Pressable style={[styles.btnContainer, styles[size]]}>
    //스타일을 여러개 줄 때는 배열로 주면 된다. ,로 연결
    <Pressable 
    style={(e)=>{
      console.log(e)
      return [styles.btnContainer, styles[size], 
              e.pressed && styles.pressed]
    }}
    //프롭스로 함수를 보낸다.
    onPress={()=>{onPress()}}
    >
      <Text style={styles.btn}>{title}</Text>
    </Pressable>
  )
}

export default MyButton

const styles = StyleSheet.create({
  btnContainer : {
  borderWidth : 1 ,
  // width : '30%',
  height : 36,
  borderRadius : 6,
  alignItems : 'center',
  backgroundColor : COLOR.BTN_BACKGROUND_COLOR,
  justifyContent : 'center',
  paddingVertical : 1, //상하
  paddingHorizontal : 6 //좌우
  },
  btn : {
    color : 'white'
  },
  normal : {
    width : '30%' 
  },
  large : {
    width : '100%'
  },
  pressed : {
    opacity : 0.8
  }
})
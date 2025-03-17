import { Keyboard, StatusBar, StyleSheet, Text, TouchableWithoutFeedback, View } from 'react-native'
import React from 'react'
import { SafeAreaView } from 'react-native'
import Login from '../components/Login'
import CartList from '../components/CartList'

const MainScreen = () => {
  
  return (
    //TouchableWithoutFeedback는 터치는 감지하되,
    //화면에 아무런 반응도 일어나지 않는 컴포넌트
    //주로 키보드를 감출 때 사용. -> 모든 컴포넌트의 가장 바깥쪽에 두면 된다.
    <TouchableWithoutFeedback onPress={Keyboard.dismiss}>
      <SafeAreaView style={styles.mainContainer}>
        <StatusBar barStyle={'default'}
        backgroundColor={'#C9E9D2'}
        />
        {/* <Login/> */}
        <CartList/>
      </SafeAreaView>
    </TouchableWithoutFeedback>
  )
}

export default MainScreen

const styles = StyleSheet.create({
  mainContainer : {
    flex : 1
  }
})
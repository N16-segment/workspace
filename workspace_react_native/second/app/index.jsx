import { StatusBar, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { SafeAreaView } from 'react-native'
import Login from '../components/Login'
import CartList from '../components/CartList'

const MainScreen = () => {
  
  return (
    <SafeAreaView>
      <StatusBar barStyle={'default'}
      backgroundColor={'#C9E9D2'}
      />

      {/* <Login/> */}
      <CartList/>
    </SafeAreaView>
  )
}

export default MainScreen

const styles = StyleSheet.create({})
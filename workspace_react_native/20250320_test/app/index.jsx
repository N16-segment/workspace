import { SafeAreaView, StatusBar, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import Test from '../components/Test'
import color from '../constants/colors.js'

const index = () => {
  return (
    <SafeAreaView style={styles.main}>
     <StatusBar barStyle={'default'}
     />
        <Text style={styles.title}>To Do List</Text>
      
      <Test/>
    </SafeAreaView>
  )
}

export default index

const styles = StyleSheet.create({
  main : {
    justifyContent : 'center',
    margin : 20
  },
  title : {
    fontSize : 40,
    fontWeight : 'bold',
  }
})
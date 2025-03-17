import { SafeAreaView, StatusBar, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import color from '../constants/colors.js'
import TodoList from '../components/TodoList.jsx'
import NewTodo from '../components/NewTodo.jsx'

const MainScreen = () => {
  return (
    <SafeAreaView style={styles.main}>
     <StatusBar 
     barStyle={'light-content'}
     backgroundColor={'#555555'}
     />
      <Text style={styles.title}>To Do List</Text>
      
      {/* <TodoList/> */}
      <NewTodo/>
    </SafeAreaView>
  )
}

export default MainScreen

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
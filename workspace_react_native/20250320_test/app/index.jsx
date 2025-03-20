import { Keyboard, SafeAreaView, StatusBar, StyleSheet, Text, TouchableWithoutFeedback, View } from 'react-native'
import React from 'react'
import TodoList from '../components/TodoList.jsx'

const Index = () => {
  return (
    <TouchableWithoutFeedback onPress={Keyboard.dismiss}>
      <SafeAreaView style={styles.main}>
        <StatusBar barStyle={'dark-content'}
          backgroundColor={'#C9E9D2'} />
        <Text style={styles.title}>To Do List</Text>
        <TodoList />
      </SafeAreaView>
    </TouchableWithoutFeedback>
  )
}

export default Index

const styles = StyleSheet.create({
  main: {
    justifyContent: 'center',
    margin: 20,
    flex: 1
  },
  title: {
    fontSize: 36,
    fontWeight: 'bold',
    marginBottom: 10,
  }
})
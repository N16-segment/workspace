import { Image, SafeAreaView, StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useState } from 'react'

const Test = () => {
  //toDo 리스트를 가져오는 useState 변수
  const [todoList, setToDoList] = useState(data);
  //키보드로 입력한 정보를 저장하는 useState 변수
  const [todo, setTodo] =useState('');
  return (
    <SafeAreaView style={styles.backboard}>
      <TextInput
      style={styles.input}
      placeholder='+ Add a Task'
      value={todo} 
      onChangeText={text=>{setTodo(text)}}  
      onSubmitEditing={()=>{
        let max = todoList[0].id 
        for(const e of todoList){
          if(max<e.id){
            max = e.id;
          }
        } 
        const newMax = Math.max(...todoList.map((e,i)=>e.id)); 
        const nextTodo = {
          id : max + 1,
          todo : todo
        }
        setToDoList([...todoList, todo]);
        setTodo('');
      }}   
      />
     {
      todoList.map((e, i)=>{
        return (

     <View key={i} style={styles.todo}>
        <Text style={styles.todo}>{e.todo}</Text>
        <Image 
        style={styles.img}
        source={icon.ICON_EDIT}
        />
        <Image 
        style={styles.img}
        source={icon.ICON_DELETE}
        />
     </View>
        )
      })
     } 
    

    </SafeAreaView>
  )
}

export default Test

const styles = StyleSheet.create({
  input : {
    borderWidth : 1,
    margin : 6
  }
})
import { Image, SafeAreaView, StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useState } from 'react'
import {icons} from '@/constants/icons'
import {data} from '@/data/data'

const TodoList = () => {
  //todo 리스트(data)를 가져오는 useState 변수
  const [todoList, setTodoList] = useState(data);
  //키보드로 입력한 정보를 저장하는 useState 변수
  const [newTodo, setNewTodo] =useState('');
  return (
    <SafeAreaView style={styles.backboard}>
      <View>
        <TextInput
        style={styles.input}
        placeholder='+ Add a Task'
        value={newTodo} 
        onChangeText={text => setNewTodo(text)}  
        //키보드의 완료, enter 키를 눌렀을 때 실행하는 이벤트트
        onSubmitEditing={()=>{
          //todoList에 저장
          //max id +1 구하기
          // let max = todoList[0].id; 
          // for(const e of todoList){
          //   if(max < e.id){
          //     max = e.id;
          //   }
          // } 

          const max = Math.max(...todoList.map((e, i) => e.id)); 
          //저장할 객체를 생성
          const newData = {
            id : max + 1,
            todo : newTodo
          }
          setTodoList([...todoList, newTodo]);
          setNewTodo('');
        }}   
        />
      </View>
     {
      todoList.map((e, i)=>{
        return (

     <View key={i} style={styles.container}>

        <Text style={styles.title}>{e.todo}</Text>

        <Image 
        style={styles.img}
        source={icons.ICON_EDIT}
        />
        <Image 
        style={styles.img}
        source={icons.ICON_DELETE}
        />

     </View>
        )
      })
     } 
    

    </SafeAreaView>
  )
}

export default TodoList

const styles = StyleSheet.create({
  input : {
    borderWidth : 1,
    margin : 6
  },
  container : {
    borderWidth : 1,
    margin : 10,
    flexDirection : 'row',
    justifyContent : 'center',
    padding : 10,
    gap : 6
  },
  title : {
    flex : 1,
    borderWidth : 1,
    fontSize : 16
  },
  img : {
    width : 20,
    height : 20
  }
})
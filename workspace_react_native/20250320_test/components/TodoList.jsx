import { SafeAreaView, StyleSheet, View } from 'react-native'
import React, { useState } from 'react'
import { data } from '../data/data';
import Task from './Task';
import MyTextInput from './MyTextInput';

const TodoList = () => {
  //todo 리스트를 가져오는 useState 변수
  const [todoList, setTodoList] = useState(data);
  //키보드로 입력한 데이터 정보를 저장하는 useState 변수
  const [newTodo, setnewTodo] = useState('');

  //새 할 일 추가 함수
  const submitEditing = () => {
    const max = Math.max(...todoList.map(todo => todo.id));
    const newData = {
      id: max + 1, //새로운 id
      todo: newTodo //새 할 일
    };
    setTodoList([...todoList, newData]); //기존 리스트에 새 항목 추가
    setnewTodo(''); //새 할 일 추가 후 input 초기화
  }

  return (
    <View style={styles.backboard}>
      <MyTextInput
        placeholder='+ Add a Task'
        value={newTodo}
        onChangeText={text => {
          setnewTodo(text);
        }}
        onSubmitEditing={() => submitEditing()}
      />
      <SafeAreaView style={styles.backboard}>
        {/* 할 일 목록을 렌더링 */}
        {
          todoList.map((e, i) => {
            return (
              <Task
                key={i} //i는 props와 무관
                e={e} //todo -> e로 전달
                todoList={todoList}
                setTodoList={setTodoList}
              />
            )
          })
        }
      </SafeAreaView>
    </View>
  )
}



export default TodoList

const styles = StyleSheet.create({
  backboard: {
    flex: 1,
  }
})
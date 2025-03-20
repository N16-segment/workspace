import { Image, Pressable, StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useEffect, useState } from 'react'
import { icon } from '../constants/icons';

const Task = ({ e, todoList, setTodoList }) => {
  //할 일을 수정한 상태인지 판단하는 변수 - 수정상태여부
  const [isEditing, setIsEditing] = useState(false);

  //수정을 하기 위해 input태그에 입력한 글자, id도 필요하다. - 전체 데이터 필요 
  //*notice!! props로 전달된 데이터를 state변수의 초기값으로 주면 안됨!
  const [newText, setNewText] = useState('');

  //props로 넘어온 데이터는 useEffect로 e.text를 초기값으로 설정
  useEffect(() => {
    setNewText(e.todo);
  }, [e]);

  //할 일 수정 함수
  const handleTodoList = () => {
    const copyTodoList = [...todoList]; //todoList를 복사한 다음 수정
    const editTodo = copyTodoList.find(myTodo => myTodo.id === e.id);
    // if (editTodo) {
      editTodo.todo = newText; //할 일 수정
      setIsEditing(false); //수정 완료 후 수정상태 종료
      setTodoList(copyTodoList); //수정된 todoList로 변경
      alert('수정');
    // }
  };
  console.log(todoList)

  //할 일 삭제 함수
  const deleteTodoList = () => {
    const updatedTodoList = todoList.filter(myTodo => myTodo.id !== e.id);
    setTodoList(updatedTodoList); //삭제된 todoList로 변경
    alert('삭제');
  };

  return (
    <>
      {
        isEditing
          ?
          (<View style={styles.todoList}>
            <TextInput
              style={styles.input}
              onChangeText={text => setNewText(text)} //텍스트 입력 하면 상태 변경
              value={newText}
              onSubmitEditing={() => handleTodoList()} //수정 완료되면 수정된 리스트 호출
              onBlur={()=>{
                setIsEditing(false);
                setNewText(e.todo);

              }}
            />
          </View>)
          :
          <View style={styles.todoList}>
            <Text style={styles.todo}>{e.todo}</Text>
            <Pressable onPress={() => setIsEditing(true)}>
              <Image source={icon.ICON_EDIT} style={styles.img} tintColor={'#204969'}/>
            </Pressable>
            <Pressable onPress={() => deleteTodoList()}>
              <Image source={icon.ICON_DELETE} style={styles.img} tintColor={'red'}/>
            </Pressable>
          </View>
      }
    </>
  )
}

export default Task

const styles = StyleSheet.create({
  todoList: {
    flexDirection: 'row',
    alignItems: 'center',
    marginBottom: 10,
    borderWidth : 1,
    borderRadius : 8,
    paddingLeft : 10
  },
  input: {
    padding: 8,
    flex: 1,
    fontSize :18,
  },
  todo: {
    flex: 1,
    fontSize :18,
    padding : 10,
    color : '#204969'
  },
  img: {
    width: 25,
    height: 25,
    margin: 5,
    paddingRight : 10
  }
})
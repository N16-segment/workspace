import React, { useState } from 'react';
import { View, Text, TextInput, Button, FlatList, TouchableOpacity, StyleSheet } from 'react-native';

const App = () => {
  const data = [
    { id: 1, todo: '일어나기' },
    { id: 2, todo: '커피 한 잔' },
    { id: 3, todo: '학원가기' },
  ];

  const [todos, setTodos] = useState(data);
  const [newTodo, setNewTodo] = useState('');
  const [editingId, setEditingId] = useState(null);
  const [editingText, setEditingText] = useState('');

  // 할 일 추가
  const addTodo = () => {
    if (newTodo.trim()) {
      const newTodoItem = {
        id: todos.length + 1, // 새로운 할 일의 id는 기존 id + 1
        todo: newTodo,
      };
      setTodos([...todos, newTodoItem]);
      setNewTodo(''); // 입력창 초기화
    }
  };

  // 할 일 삭제
  const deleteTodo = (id) => {
    setTodos(todos.filter(todo => todo.id !== id));
  };

  // 할 일 수정 시작
  const startEditTodo = (id, text) => {
    setEditingId(id);
    setEditingText(text);
  };

  // 할 일 수정 완료
  const saveEditTodo = () => {
    setTodos(todos.map(todo => 
      todo.id === editingId ? { ...todo, todo: editingText } : todo
    ));
    setEditingId(null);
    setEditingText('');
  };

  return (
    <View style={styles.container}>
      <Text style={styles.header}>할 일 목록</Text>

      {/* 입력창 */}
      <TextInput
        style={styles.input}
        placeholder="새로운 할 일 입력"
        value={newTodo}
        onChangeText={setNewTodo}
      />
      <Button title="할 일 추가" onPress={addTodo} />

      {/* 수정 입력창 (편집 중일 때만 표시) */}
      {editingId !== null && (
        <View style={styles.editContainer}>
          <TextInput
            style={styles.input}
            value={editingText}
            onChangeText={setEditingText}
          />
          <Button title="수정 저장" onPress={saveEditTodo} />
        </View>
      )}

      {/* 할 일 목록 */}
      <FlatList
        data={todos}
        keyExtractor={item => item.id.toString()}
        renderItem={({ item }) => (
          <View style={styles.todoItem}>
            <Text style={styles.todoText}>{item.todo}</Text>

            {/* 수정 버튼 */}
            <TouchableOpacity onPress={() => startEditTodo(item.id, item.todo)}>
              <Text style={styles.editButton}>수정</Text>
            </TouchableOpacity>

            {/* 삭제 버튼 */}
            <TouchableOpacity onPress={() => deleteTodo(item.id)}>
              <Text style={styles.deleteButton}>삭제</Text>
            </TouchableOpacity>
          </View>
        )}
      />
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    padding: 20,
    backgroundColor: '#f0f0f0',
  },
  header: {
    fontSize: 24,
    fontWeight: 'bold',
    marginBottom: 20,
  },
  input: {
    height: 40,
    borderColor: 'gray',
    borderWidth: 1,
    marginBottom: 10,
    paddingLeft: 10,
    borderRadius: 5,
  },
  editContainer: {
    marginBottom: 20,
  },
  todoItem: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    backgroundColor: '#fff',
    padding: 10,
    marginBottom: 10,
    borderRadius: 5,
    borderWidth: 1,
    borderColor: '#ddd',
  },
  todoText: {
    flex: 1,
    fontSize: 18,
  },
  editButton: {
    color: 'blue',
    marginRight: 10,
  },
  deleteButton: {
    color: 'red',
  },
});

export default App;

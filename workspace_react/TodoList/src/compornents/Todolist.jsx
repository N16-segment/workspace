import React, { useState } from 'react';
import styles from './Todolist.module.css';

const Todolist = () => {
  const data = [
    { id: 1, todo: '일어나기' },
    { id: 2, todo: '커피 한 잔' },
    { id: 3, todo: '학원가기' },
  ];
  //할 일 목록을 저장하고 초기값은 data로 설정
  const [todos, setTodos] = useState(data);
  //새로운 할 일을 입력
  const [newTodo, setNewTodo] = useState('');
  //수정하는 할 일의 id를 저장
  const [editId, setEditId] = useState(null);
  //수정하는 할 일의 내용을 저장
  const [editText, setEditText] = useState('');

  // 할 일 추가
  const addTodo = () => {
    if (newTodo === "") {  
      alert("할 일을 입력해주세요!");  // 빈 값일 경우 알림
      return;  
    }
  
    const newTodoItem = {  // 새로운 할 일 객체를 생성
      id: todos.length + 1,  // 할 일 목록의 길이를 기반으로 id 설정
      todo: newTodo  // 입력한 내용
    };
  
    // 기존 목록에 새 할 일을 추가
    setTodos(todos.concat(newTodoItem));  // 기존 배열에 새로운 할 일을 추가하는 방법
    setNewTodo('');  // 입력창을 비움
  };
  

  // 할 일 삭제
  const deleteTodo = (id) => {
    alert("정말로 삭제하시겠습니까?");
    setTodos(todos.filter(todo => todo.id !== id));
  };

  // 할 일 수정 시작
  const startEditTodo = (id, text) => {
    setEditId(id);
    setEditText(text);
  };

  // 할 일 수정 완료
  const saveEditTodo = () => {
    setTodos(todos.map(todo => 
      todo.id === editId ? { ...todo, todo: editText } : todo
    ));
    setEditId(null);
    setEditText('');
  };

  // 수정 취소
  const cancelEdit = () => {
    setEditId(null);
    setEditText('');
  };

  return (
    <div className={styles.container}>
      <h1 className={styles.header}>To Do List</h1>


      {/* 입력창 */}
     <div className={styles.newtodo}>
        <input
          className={styles.input}
          placeholder="새로운 할 일 입력"
          value={newTodo}
          onChange={(e) => setNewTodo(e.target.value)}
        />
        <button className={styles.button} onClick={addTodo}>할 일 등록</button>
     </div>


      {/* 할 일 목록 */}
     <div>
      {todos.map(item => (
      <span key={item.id} className={styles.todoItem}>
      <span className={styles.todoText}>{item.todo}</span>

      {/* 수정 버튼 - 아이콘으로 바꾸기*/}
      {editId !== item.id && (
        <button className={styles.editButton} onClick={() => startEditTodo(item.id, item.todo)}>
          수정아이콘
        </button>
      )}

      {/* 삭제 버튼 -아이콘으로 바꾸기*/}
      <button className={styles.deleteButton} onClick={() => deleteTodo(item.id)}>삭제아이콘</button>
    </span>
  ))}
</div>
<div className={styles.editContainer}>
          <input 
            className={styles.todoInput}
            type="text" 
            value={editText} 
            onChange={(e) => setEditText(e.target.value)} 
          />
          <button className={styles.saveButton} onClick={saveEditTodo}>확인</button>
          <button className={styles.cancelButton} onClick={cancelEdit}>취소</button>

        </div>
     
    </div>
  );
};


 

export default Todolist;

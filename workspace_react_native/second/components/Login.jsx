import { StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useState } from 'react'
import MyTextInput from './MyTextInput'
import MyButton from './MyButton'

const Login = () => {
  // const [id, setId] = useState('');
  // const [pw, setPw] = useState('');
  const [data, setData] = useState({
    id : '',
    pw : ''
  });

  const changeData = (text, name)=>{
    setData({
      ...data,
      [name] : text //키값은 변수 사용하려면 []사용
    })
  }
  const printHello = ()=>{
    console.log('안녕하세요')
  }
  return (
    <View>
      <Text>Login</Text>
      
      <TextInput 
      onChangeText={text=>changeData(text, 'id')} 
      value={data.id}
      />
      <TextInput 
      onChangeText={text=>changeData(text, 'pw')} 
      value={data.pw}      
      />

      <MyTextInput 
      placeholder={'Enter'}
      onChangeText={text=>changeData(text, 'id')} 
      value={data.id}
      />
      <MyTextInput 
      placeholder={'Exit'}
      onChangeText={text=>changeData(text, 'pw')} 
      value={data.pw}  
      />
      
      <MyTextInput />

      {/* 아래 버튼을 누르면 alert로 안녕하세요 */}
      <MyButton size='large' onPress={()=>{alert('안녕하세요')}} />

      {/* 아래 버튼을 누르면 console에 안녕하세요 */}
      <MyButton onPress={printHello}/>
      <MyButton onPress={()=>{printHello()}}/>

      <MyButton 
        title='데이터 확인' 
        onPress={()=>{
          alert(`id = ${data.id}, pw=${data.pw}`)
        }}/>

    </View>
  )
}

export default Login

const styles = StyleSheet.create({})
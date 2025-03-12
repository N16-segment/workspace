import { Pressable, SafeAreaView, StyleSheet, Text} from 'react-native'
import React, { useState } from 'react'
import { TextInput } from 'react-native'
import { View } from 'react-native';

const Style2 = () => {
  const [id, setId] = useState('아이디 입력');
  const [number, onChangeNumber] = React.useState('');

  return (
      <SafeAreaView style={styles.container}>

        <View style={styles.content}>

        <View>
          <Text>아이디</Text>
          <TextInput
            style={styles.input}
            onChangeText={(text)=>setId(text)}
          />
        </View>

        <View>
          <Text>비밀번호</Text>
          <TextInput
            style={styles.input}
            onChangeText={onChangeNumber}
            value={number}
            placeholder="비밀번호 입력"
            keyboardType="numeric"
          />
        </View>

        <View style={styles.btnView}>
          <Pressable 
            style={styles.btnContainer}
            onPress={()=>{}}>
            <Text style={styles.btn}>로그인</Text>
            </Pressable>
        </View>

        </View>
      </SafeAreaView>
  );
};


export default Style2

const styles = StyleSheet.create({
  //가장 밖에 있는 친구에게 flex 1을 주면 꽉찬다.
container : {
  flex : 1,
  borderBlockColor : 'darkgreen',
  justifyContent : 'center',
  padding : 10
},
input : {
  borderWidth :3,
  borderColor : 'gray',
  borderRadius : 10,
  //height :60,
  width : 250,
  //margin : 20,
  paddingHorizontal : 6
},
content : {
 alignItems : 'center',
 gap : 20
},
btnContainer : {
  borderWidth :3,
  borderColor : 'gray',
  borderRadius : 6,
  //height :40,
  width : '50%',
  //margin : 20,
  paddingHorizontal : 6,
  backgroundColor : 'beige',
  justifyContent : 'center',
  alignItems : 'center'
},
btn : {
  color : 'black'
},
btnView : {
  alignItems : 'center'
}

})
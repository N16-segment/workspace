import { SafeAreaView, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { TextInput } from 'react-native-web'

//SafeAreaView : ios의 노치영역을 제외한 부분에 생성(아이폰 땜시)
const Style1 = () => {
  return (
    <SafeAreaView style={styles.conttainer}>
      <View style={styles.v1}>
        <Text>text1</Text>
        </View>
      <View style={styles.v2}>
        <Text>text2</Text>
        </View>
      <View style={styles.v3}>
        <Text>text3</Text>
        </View>

    </SafeAreaView>
  )
}

export default Style1

//react native의 컴포넌트들은 모두 flex가 기본값이다.
//flexDirection은 기본값이 'column'이기 때문에 세로로 배치된다.
//가로배치를 원하면 flexDirection을 'row'로 변경한다.

const styles = StyleSheet.create({
  conttainer : {
    //flexDirection : 'row'
  },
  v1 : {
    backgroundColor : '#cccccc',
    flex : 1,
    //height : 100,
    //width : 100,
    alignItems : 'center'
  },
  v2 : {
    backgroundColor : '#ddddaa',
    flex : 2,
    //height : 200,
    //width : 200,
    alignItems : 'center'
  },
  v3 : {
    backgroundColor : '#aabbaa',
    flex : 1,
    //height : 100,
    //width : 100,
    alignItems : 'center'
  }
})

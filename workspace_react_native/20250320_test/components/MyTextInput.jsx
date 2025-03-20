import { StyleSheet, Text, TextInput, View } from 'react-native'
import React from 'react'
import { color } from '../constants/colors'

const MyTextInput = ({ placeholder, ...props }) => {
  return (
    <View style={styles.container}>
      <TextInput
        style={styles.input}
        placeholder={placeholder}
        {...props}
      />
    </View>
  )
}

export default MyTextInput

const styles = StyleSheet.create({
  container: {
    alignItems: 'center',
  },
  input: {
    borderWidth: 1,
    borderRadius : 8,
    margin: 5,
    borderWidth: 1,
    marginBottom: 10,
    padding: 12,
    backgroundColor: color.INPUT_BACKGROUND_COLOR,
    width: '100%',
    fontSize : 16
  }
})
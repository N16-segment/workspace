package study;

import java.util.Objects;

public class Student {
  int stuNum;//학번
  String name;//학생의 이름

  public Student(int stuNum, String name) {
    this.stuNum = stuNum;
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
   Student student = (Student)obj;
   if(stuNum ==student.stuNum){
     return true;
   }
   else{
     return false;
   }

  }
}

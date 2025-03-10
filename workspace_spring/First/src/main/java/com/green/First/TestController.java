package com.green.First;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//@ : anotation 어노테이션
@RestController
public class TestController {

  //localhost:8080/t1
  @GetMapping("/t1")
  public String test1(){
    return "java";
  }

  @GetMapping("/t2")
  public int test2(){
    return 10;
  }

  @GetMapping("/t3")
  public int[] test3(){
    int[] arr = {1, 2, 3};
    return arr;
  }

  @GetMapping("/t4")
  public Person test4(){
    //Person 클래스에 대한 객체를 하나 생성!
    //클래스명 객체명 = new 생성자 호출;
    Person p = new Person("kim", 20, "울산");
    return p;
  }

  @GetMapping("/t5")
  public java.util.List<Person> test5(){
    //Person 클래스에 대한 객체를 다수 저장할 수 있는 리스트 생성
    //자료형 변수명; List<Person> list 따라서 리턴시키려면 자료형이 일치해야 오류가 나지 않으므로,
    //퍼블릭 옆에 리턴자료형은 List<Person>이 된다.
    java.util.List<Person> list = new ArrayList<>();

    Person p1 = new Person("kim", 30, "울산시");
    Person p2 = new Person("lee", 40, "부산시");
    Person p3 = new Person("son", 50, "서울시");

    list.add(p1);
    list.add(p2);
    list.add(p3);

    return list;

  }
  @GetMapping("/t6")
  public java.util.List<Student> test6(){
    java.util.List<Student> studentList = new ArrayList<>();

    studentList.add(new Student("kim", 80, 90, 100));
    studentList.add(new Student("son", 70, 80, 90));
    studentList.add(new Student("lee", 60, 80, 100));
    studentList.add(new Student("park", 50, 50, 50));
    studentList.add(new Student("choi", 30, 20, 100));

    return studentList;

  }
  //react 에서 전달하는 데이터를 자바에서 받는 문법은 2가지 존재
  //1. 클래스를 활용하는 방법
  //react에서 전달한 객체의 key와
  //java에서 데이터를 받기위해 매개변수에 선언한 클래스의 변수명이
  //동일하면 데이터를 자동으로 받아옴
  //2. Collection Framework의 Map을 활용하는 방법
  @PostMapping("/t7")
  //데이터 받을때 무조건 @Requestbody 를 적어준다.
  public void tst7(@RequestBody Student student){
    System.out.println(student.toString());

  }
  @PostMapping("/t8")
  public void test8(@RequestBody PhoneDTO phoneDTO){
    System.out.println(phoneDTO.toString());

  }

  @PostMapping("/t9")
  public int test9(@RequestBody Student student){
    System.out.println(student.toString());
    int sum = student.getKorScore() + student.getEngScore() + student.getMathScore();
    return sum;

  }

  //가져올 데이타가 없을 경우 리턴하지 않아도 된다.
  @PostMapping("/t10")
  public void test10(@RequestBody TableDto tableDto){
    System.out.println(tableDto.toString());
  }

  @GetMapping("/getLottoNum")
  public int getLottoNum(){
    int num = (int)(Math.random() * 45 +1);
    return num;

  }
//어노테이션 겟맵핑
  @GetMapping("/getBoardList")
  public List<Board> sendBoardList(){
    List<Board> boardList = new ArrayList<>();
    boardList.add(new Board(5,"제목입니다1", "김자바",0, "제목내용입니다."));
    boardList.add(new Board(4, "제목입니다2","박자바",5, "제목내용입니다."));
    boardList.add(new Board(3, "제목입니다3","이자바",1, "제목내용입니다."));
    boardList.add(new Board(2, "제목입니다4","김자바",3, "제목내용입니다."));
    boardList.add(new Board(1, "제목입니다5","이자바",2, "제목내용입니다."));

     return boardList;
  }

  @GetMapping("/getOrderList")
  public List<Order> sendOrderList(){
    List<Order> orderList = new ArrayList<>();
    orderList.add(new Order(1, "데님 청바지", 15000, 2, "고객 1"));
    orderList.add(new Order(2, "맨투맨 반팔 티셔츠", 10000, 3, "고객 2"));
    orderList.add(new Order(3, "오버핏 니트", 25000, 2, "고객 3"));
    orderList.add(new Order(4, "롱패딩", 55000, 1, "고객 4"));
    orderList.add(new Order(5, "맨투맨 긴팔 티셔츠", 12000, 3, "고객 5"));

    return orderList;

  }



}

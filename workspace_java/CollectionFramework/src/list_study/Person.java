package list_study;

public class Person {
  private String name;
  private int age;
  private String addr;

  public Person(String name, int age, String addr) {
    this.name = name;
    this.age = age;
    this.addr = addr;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

  //우클릭 제너레이션 toString -> 현재 갖고 있는 정보를 문자열로 리턴
  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", addr='" + addr + '\'' +
            '}';
  }
}

package practice;

import java.util.Arrays;

//문제 13.
//아래의 조건을 보고 노래를 나타내는 Song 클래스를 만들어 보세요.
//Song 클래스는 다음과 같은 필드를 갖는다.
// - 노래 제목을 나타내는 title
// - 가수를 나타내는 artist
// - 노래가 속한 앨범 제목을 나타내는 album
// - 노래가 발표된 연도를 나타내는 year
// - 노래의 작곡가를 나타내는 composer, 단 작곡가는 3명이라고 간주한다

//기본자료형을 제외한 모든 자료형은 기본 초기값 : null
public class Compose {
  String title, artist, album;
  int year;
  String[] composer;//작곡가는 3명

  //모든 필드를 초기화 하는 메서드
  public void setAllInfo(String title, String artist, String album, int year, String[] composer){
    this.title = title;
    this.artist = artist;
    this.album = album;
    this.year = year;
    this.composer = composer;
  }
  //노래 정보를 출력하는 메서드
  public void printInfo(){
    System.out.println("title : " + title);
    //System.out.println("title : " + this.title); this를
    System.out.println("artist : " + artist);
    System.out.println("album : " + album);
    System.out.println("year : " + year);
    System.out.println("composer : " + Arrays.toString(composer));
  }

}

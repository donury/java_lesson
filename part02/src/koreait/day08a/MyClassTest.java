package koreait.day08a;

import koreait.day08.MyClass1;
import koreait.day08.Score;

public class MyClassTest {
	public static void main(String[] args) {
		 
//		MyClass1 객체생성
		MyClass1 my = new MyClass1();	//public 클래스이지만 import 필요
		
		//패키지가 다른 myClass1 클래스의 필드중 사용할 수 있는 것은? point
		//				default(package) 한정자 필드 name, 메소드 getAge.setAge 사용못함.
//		my="momo"; //패키지 한정 접근자
		my.point=1.234;	//퍼블릭
//		my.setAge(23);	//private 필드값 대입(변경)하는 메소드 : setter //같은 클래스 네에서 사용
//		System.out.println("age ="+my.getAge());
//		//접근 한정자 테스트는 자바에서 제공되는 클래스들을 이해하고 우리가 만들 클래스에도 사용. //getter
//		my.setAge(-100);
//		System.out.println("age ="+my.getAge());	//private 필드값 읽어오는 메소드 : getter
//		System.out.println("point ="+my.point);	//public 한정자 필드
//		System.out.println("name ="+my.name);	//package 기본한정자 필드

			//Score 클래스 필드,메소드의 한정자가 모두 default 입니다.
			//	ㄴnew 객체 생성은 될까요? 됩니다 public 클래스라서 가능합니다.
		Score score=new Score();
			
	
	
	
	
	}
	


}


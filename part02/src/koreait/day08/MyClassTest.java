package koreait.day08;

import koreait.day08.MyClass1;

public class MyClassTest {
	public static void main(String[] args) {
		 
//		MyClass1 객체생성
		MyClass1 my = new MyClass1();
		
		my.name="momo"; //패키지 한정 접근자
		my.point=1.234;	//퍼블릭
		my.setAge(23);	//private 필드값 대입(변경)하는 메소드 : setter //같은 클래스 네에서 사용
		System.out.println("age ="+my.getAge());
		//접근 한정자 테스트는 자바에서 제공되는 클래스들을 이해하고 우리가 만들 클래스에도 사용. //getter
		my.setAge(-100);
		System.out.println("age ="+my.getAge());	//private 필드값 읽어오는 메소드 : getter
		System.out.println("point ="+my.point);	//public 한정자 필드
		System.out.println("name ="+my.name);	//package 기본한정자 필드
		
	}
	


}


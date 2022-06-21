package koreait.day07;

import koreait.day08.MyClass1;

public class C36_C35Test {
//C35클래스를 객체로 만들어서 테스트 1)객체로 만들어서 2)stati 인 것들 테스트합니다.
	//(참고:main 메소드를 갖고 있는 클래스를 객체로 만들지 않는 것이 일반적입니다.)
	public static void main(String[] args) {
		//test1,2 는 참조형 변수
		C35_GlobalVar test1=new C35_GlobalVar();	//C35 클래스 타입의 객체를 생성
		C35_GlobalVar test2=new C35_GlobalVar();	//C35 클래스 타입의 객체를 생성
		//c35클래스에서 static이 아닌 인스턴스 변수에는 객체마다 다른 값을 저장합니다. -객체 각각 다른 특성을 나타냅니다
		
		test1.count=10;
		test2.count=20;
		
		test1.message="hi test1";
		test2.message="hellos test2";
		
		test1.methodA();	//인스턴스 메소드
		test2.methodA();
		test1.methodC(123);
		test2.methodC(999);
		
		System.out.println("test1.count ="+test1.count);
		System.out.println("test2.count ="+test2.count);
		
		//static 요소 테스트 :static 변수 또는 메소드는 클래스 이름으로 사용
		
		C35_GlobalVar.num=101;
		System.out.println("num = "+C35_GlobalVar.num);
		System.out.println("num = "+test1.num);	//경고 : static 방법으로 사용해라.
		System.out.println("num = "+test2.num);
		
		//static이 저장되는 메모리 영역(메소드 영역)과 객체가 저장되는 메모리 영역(힙 영역)은 다릅니다.
		
		System.out.println("Test : "+C35_GlobalVar.Test);
		//전역변수의 초기값
		//참고 : 지역변수의 기본 초기값?- 배열일때만 0,0,0 그리고 기본형타입은 오류
		C35_GlobalVar test3=new C35_GlobalVar();
		System.out.println("test3.count= "+test3.count);
		System.out.println("test3.message= "+test3.message);
		System.out.println("c35_GlobalVar.num= "+C35_GlobalVar.point);
		
	}

}

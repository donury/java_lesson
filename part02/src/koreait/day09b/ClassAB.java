package koreait.day09b;

import koreait.day09a.ClassA;

public class ClassAB extends ClassA {
	
	//과연 해당 클래스가 필드,메소드 상속받았나 확인
	//ClassA의 private,default 접근한정자 요소는 상속 못받음.
	public void test() {
//		System.out.println("name = "+ name);  //name필드 접근한정자가 default  다른 패키지에서 사용불가
		title="momo";	//상속받은 title 핃드: 다른 패키지이지만 protected 접근한정자 자식클래스 허용
		
		System.out.println("title = " +title);
		setName("신비");
		System.out.println("name ="+getName());
	}
	
}


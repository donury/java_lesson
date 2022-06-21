package koreait.day11;

import koreait.day10.Person;

public class ClassAbsTest  {

	public static void main(String[] args) {
		Person momo = new Person(); 	//일반클래스
//		ClassAbs abs=new ClassAbs();	//오류 : CLassAbs는 추상클래스 . new 못합니다.
		ClassAbs abs= new ClassX();		//부모 타입 참조
		ClassX cls =new ClassX();		//구현(하위)자식 클래스 타입
		abs.test();
		cls.test();
		abs.name="손흥민";	//name 부모클래스
		cls.name="모모";
		abs.print();		//print()	부모클래스 메소드
		cls.print();
		cls.setNum(20);
		cls.test();
		ClassX x=(ClassX)abs;
		x.setNum(50);
		abs.test();
		
	}

}

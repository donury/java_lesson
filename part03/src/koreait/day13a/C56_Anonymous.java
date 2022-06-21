package koreait.day13a;

import koreait.day13.InterfaceA;
import koreait.day13.InterfaceB;

public class C56_Anonymous {
//인터페이스 구현체를 익명 내부 클래스로 생성하기
	public static void main(String[] args) {
		InterfaceA ia =new InterfaceA() {

			@Override
			public void methodA() {
					System.out.println("익명 클래스 methodA");
			}

			@Override
			public int methodB(int num) {
				System.out.println("i am annoymous.!!");
				return 1234;
			}
		};
		InterfaceB ib=new InterfaceB() {

			@Override
			public String name(String name) {
				return "익명 내부 클래스:	" + name;
			}

			
};
ia.methodA();
System.out.println(ia.methodB(10));
ia.methodD("하이~ 인터페이스");
InterfaceA.methodC();
System.out.println(ib.name("테스트"));
}
}
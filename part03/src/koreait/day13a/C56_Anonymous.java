package koreait.day13a;

import koreait.day13.InterfaceA;
import koreait.day13.InterfaceB;

public class C56_Anonymous {
//�������̽� ����ü�� �͸� ���� Ŭ������ �����ϱ�
	public static void main(String[] args) {
		InterfaceA ia =new InterfaceA() {

			@Override
			public void methodA() {
					System.out.println("�͸� Ŭ���� methodA");
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
				return "�͸� ���� Ŭ����:	" + name;
			}

			
};
ia.methodA();
System.out.println(ia.methodB(10));
ia.methodD("����~ �������̽�");
InterfaceA.methodC();
System.out.println(ib.name("�׽�Ʈ"));
}
}
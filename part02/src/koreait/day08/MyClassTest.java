package koreait.day08;

import koreait.day08.MyClass1;

public class MyClassTest {
	public static void main(String[] args) {
		 
//		MyClass1 ��ü����
		MyClass1 my = new MyClass1();
		
		my.name="momo"; //��Ű�� ���� ������
		my.point=1.234;	//�ۺ�
		my.setAge(23);	//private �ʵ尪 ����(����)�ϴ� �޼ҵ� : setter //���� Ŭ���� �׿��� ���
		System.out.println("age ="+my.getAge());
		//���� ������ �׽�Ʈ�� �ڹٿ��� �����Ǵ� Ŭ�������� �����ϰ� �츮�� ���� Ŭ�������� ���. //getter
		my.setAge(-100);
		System.out.println("age ="+my.getAge());	//private �ʵ尪 �о���� �޼ҵ� : getter
		System.out.println("point ="+my.point);	//public ������ �ʵ�
		System.out.println("name ="+my.name);	//package �⺻������ �ʵ�
		
	}
	


}


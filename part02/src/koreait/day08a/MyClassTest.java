package koreait.day08a;

import koreait.day08.MyClass1;
import koreait.day08.Score;

public class MyClassTest {
	public static void main(String[] args) {
		 
//		MyClass1 ��ü����
		MyClass1 my = new MyClass1();	//public Ŭ���������� import �ʿ�
		
		//��Ű���� �ٸ� myClass1 Ŭ������ �ʵ��� ����� �� �ִ� ����? point
		//				default(package) ������ �ʵ� name, �޼ҵ� getAge.setAge ������.
//		my="momo"; //��Ű�� ���� ������
		my.point=1.234;	//�ۺ�
//		my.setAge(23);	//private �ʵ尪 ����(����)�ϴ� �޼ҵ� : setter //���� Ŭ���� �׿��� ���
//		System.out.println("age ="+my.getAge());
//		//���� ������ �׽�Ʈ�� �ڹٿ��� �����Ǵ� Ŭ�������� �����ϰ� �츮�� ���� Ŭ�������� ���. //getter
//		my.setAge(-100);
//		System.out.println("age ="+my.getAge());	//private �ʵ尪 �о���� �޼ҵ� : getter
//		System.out.println("point ="+my.point);	//public ������ �ʵ�
//		System.out.println("name ="+my.name);	//package �⺻������ �ʵ�

			//Score Ŭ���� �ʵ�,�޼ҵ��� �����ڰ� ��� default �Դϴ�.
			//	��new ��ü ������ �ɱ��? �˴ϴ� public Ŭ������ �����մϴ�.
		Score score=new Score();
			
	
	
	
	
	}
	


}


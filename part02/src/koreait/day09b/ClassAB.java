package koreait.day09b;

import koreait.day09a.ClassA;

public class ClassAB extends ClassA {
	
	//���� �ش� Ŭ������ �ʵ�,�޼ҵ� ��ӹ޾ҳ� Ȯ��
	//ClassA�� private,default ���������� ��Ҵ� ��� ������.
	public void test() {
//		System.out.println("name = "+ name);  //name�ʵ� ���������ڰ� default  �ٸ� ��Ű������ ���Ұ�
		title="momo";	//��ӹ��� title ����: �ٸ� ��Ű�������� protected ���������� �ڽ�Ŭ���� ���
		
		System.out.println("title = " +title);
		setName("�ź�");
		System.out.println("name ="+getName());
	}
	
}


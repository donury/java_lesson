package koreait.day11;

import koreait.day10.Person;

public class ClassAbsTest  {

	public static void main(String[] args) {
		Person momo = new Person(); 	//�Ϲ�Ŭ����
//		ClassAbs abs=new ClassAbs();	//���� : CLassAbs�� �߻�Ŭ���� . new ���մϴ�.
		ClassAbs abs= new ClassX();		//�θ� Ÿ�� ����
		ClassX cls =new ClassX();		//����(����)�ڽ� Ŭ���� Ÿ��
		abs.test();
		cls.test();
		abs.name="�����";	//name �θ�Ŭ����
		cls.name="���";
		abs.print();		//print()	�θ�Ŭ���� �޼ҵ�
		cls.print();
		cls.setNum(20);
		cls.test();
		ClassX x=(ClassX)abs;
		x.setNum(50);
		abs.test();
		
	}

}

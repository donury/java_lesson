package koreait.day07;

import koreait.day08.MyClass1;

public class C36_C35Test {
//C35Ŭ������ ��ü�� ���� �׽�Ʈ 1)��ü�� ���� 2)stati �� �͵� �׽�Ʈ�մϴ�.
	//(����:main �޼ҵ带 ���� �ִ� Ŭ������ ��ü�� ������ �ʴ� ���� �Ϲ����Դϴ�.)
	public static void main(String[] args) {
		//test1,2 �� ������ ����
		C35_GlobalVar test1=new C35_GlobalVar();	//C35 Ŭ���� Ÿ���� ��ü�� ����
		C35_GlobalVar test2=new C35_GlobalVar();	//C35 Ŭ���� Ÿ���� ��ü�� ����
		//c35Ŭ�������� static�� �ƴ� �ν��Ͻ� �������� ��ü���� �ٸ� ���� �����մϴ�. -��ü ���� �ٸ� Ư���� ��Ÿ���ϴ�
		
		test1.count=10;
		test2.count=20;
		
		test1.message="hi test1";
		test2.message="hellos test2";
		
		test1.methodA();	//�ν��Ͻ� �޼ҵ�
		test2.methodA();
		test1.methodC(123);
		test2.methodC(999);
		
		System.out.println("test1.count ="+test1.count);
		System.out.println("test2.count ="+test2.count);
		
		//static ��� �׽�Ʈ :static ���� �Ǵ� �޼ҵ�� Ŭ���� �̸����� ���
		
		C35_GlobalVar.num=101;
		System.out.println("num = "+C35_GlobalVar.num);
		System.out.println("num = "+test1.num);	//��� : static ������� ����ض�.
		System.out.println("num = "+test2.num);
		
		//static�� ����Ǵ� �޸� ����(�޼ҵ� ����)�� ��ü�� ����Ǵ� �޸� ����(�� ����)�� �ٸ��ϴ�.
		
		System.out.println("Test : "+C35_GlobalVar.Test);
		//���������� �ʱⰪ
		//���� : ���������� �⺻ �ʱⰪ?- �迭�϶��� 0,0,0 �׸��� �⺻��Ÿ���� ����
		C35_GlobalVar test3=new C35_GlobalVar();
		System.out.println("test3.count= "+test3.count);
		System.out.println("test3.message= "+test3.message);
		System.out.println("c35_GlobalVar.num= "+C35_GlobalVar.point);
		
	}

}

package koreait.day09a;

public class Dog extends Animal {
	protected int legs; //default ������ +�ٸ� ��Ű���ڽ�Ŭ����
	public Dog() {
		System.out.println("���ο� ���� ������ dog");
	}
	public void run() {
		setName("������");
		setColor("����");
		System.out.println("Ư¡ : �޸��� ");
	}
	
}

package koreait.day11.test;

public class Crow extends Animal {	//���
	
	protected int winds; //default ������ +�ٸ� ��Ű���ڽ�Ŭ����
	
	public Crow() {
		System.out.println("���ο� ���� ������ crow ");
	}
	public void fly() {
		setName("���");
		setColor("������");
		System.out.println("Ư¡ : ����");
	
	}
	//�߻�޼ҵ� �����ǰ� ��� ���� 
	@Override
	public void act() {
System.out.println("Animal �ൿ : �Ϸ����� ����ٴϱ�");
		
	}
	@Override
	public String eat(Object object) {
		// TODO Auto-generated method stub
		return "���̴� ���� "	+ object + "�����Դϴ�";
	}
}

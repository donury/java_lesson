package koreait.day11.test;

public class Dog extends Animal {
	protected int legs; //default ������ +�ٸ� ��Ű���ڽ�Ŭ����
	public Dog() {
		System.out.println("���ο� ���� ������ dog");
		type=Animal.DOG;
	}
	public void run() {
		setName("������");
		setColor("����");
		System.out.println("Ư¡ : �޸��� ");
	}
	@Override
	public String eat(Object object) {
		return "���̴� " + object +"�Դϴ�";
	}
	@Override
	public void act() {
		System.out.println("Animal �ൿ : �Ϸ�2�� ��å�ϱ�");
	}
}

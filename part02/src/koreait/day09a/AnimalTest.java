package koreait.day09a;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal =new Animal();
		animal.act();
		animal.print();
		System.out.println("-------------------------------");
		
		Dog dog = new Dog();
		dog.run();
		dog.act();
		dog.print();
		System.out.println("-------------------------------");
		
		Crow crow=new Crow();
		crow.fly();
		crow.print();
		System.out.println("===============================");
		Animal temp =dog;	//�ڽİ�ü�� �θ�Ŭ���� Ÿ������ ������ �� �ֽ��ϴ�
		temp.print();
//		temp.run();		//���� : �θ�Ÿ�� �����δ� �ڽ� �޼ҵ� ���� ���մϴ�.
		temp=crow;		//�ڽİ�ü�� �θ�Ŭ���� Ÿ������ ������ �� �ֽ��ϴ�.
		temp.print();
//		temp.fly();
		Animal puppy = new Dog();
		puppy.print();
//		puppy.run()	//����: �θ�Ÿ�� �����δ� �ڽ� �޼ҵ� ���� �Ұ�
		
		Dog puddle =(Dog)puppy;	//Animal Ÿ���� Dog Ÿ������ casting(�ڽ� Ŭ���� Dog ��ü�̹Ƿ� ����.)
		puddle.run();		// puppy ������ �����ϴ� ��ü�� Dog Ÿ���ϋ��� ����
		puddle.print();
	}

}

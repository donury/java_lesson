package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest2 {

	public static void main(String[] args) {
		Animal ani1 =new Frog(); //�� ĳ����: �ڵ���ȯ 
		Animal ani2 =new Cat();
		
		Dog puddle =new Dog();
		Crow crow = new Crow();
		//�ڽİ�ü�� �����ɶ� ���� �θ�Ŭ���� ��ü�� �����ϸ鼭 �θ�Ŭ���� ������ ����.
	System.out.println("::::::::::::::::::::::::");
	animal(ani1);
	ani1.act();
	ani2.
	 animal(ani2);
animal(puddle);
	animal(crow);
	puddle.run();
	//animal(new Frog());
	}
	//������
	//�޼ҵ� ����(�Ǵ� ����) Ÿ���� Animal : Animal, Dog,Crow ,Frog,Cat ��ü ��� �����մϴ�.
	
	public static void animal(Animal animal) {
		animal.act();
		animal.print();
		
		//���ڷ� ���޹��� animal ��ü�� �����ϴ� ���� ��¥ Ÿ��(�ν��Ͻ� Ÿ��) �˻� : instanceof
		System.out.println("dog?"+ (animal instanceof Dog));	//��ü�������� instanceof Ŭ������
		System.out.println("crow?"+ (animal instanceof Crow));
		System.out.println("frog?"+ (animal instanceof Frog));
		System.out.println("cat?"+ (animal instanceof Cat));
		/*Animal �θ�Ÿ�� ������ �ڽ�Ŭ���� �ʵ�� �޼ҵ� ���� ����.
		 * animal.jump()	; //Frog
		 * 
		 * 
		 */
		Cat cat; Dog dog; Frog frog; Crow crow;
		if(animal instanceof Cat) {
			cat =(Cat)animal;//�ٿ�ĳ����  :animal ��¥ ��ü�� ���� ���� �Ǵ� �����ƴ�
			cat.sound();
		}
		if(animal instanceof Dog) {
			dog=(Dog)animal;
			dog.run();
		}
		if(animal instanceof Frog) {
			frog=(Frog)animal;
			frog.jumping();
		}
			if(animal instanceof Crow) {
			crow=(Crow)animal; crow.fly();
	}
			
			animal.print();
	}	//animal �޼ҵ� end
	}



class Frog extends Animal {	//������
	
	protected String mouth; //default ������ +�ٸ� ��Ű���ڽ�Ŭ����
	public Frog() {
		System.out.println("���ο� ���� ������ Frog ");
	}
	public void jumping() {
		setName("������");
		setColor("�ʷ�");
		System.out.println("Ư¡ : ����");
	
	}
	//������ ���� : �޼ҵ� �������̵� *���� : �����ε�	-ã�ƺ��� 
	//				���θ�Ŭ������ �޼ҵ带 ������. �̶� ���ڿ� ����Ÿ���� �����ϰ� �մϴ�.
	
	@Override
		public void act() {
		System.out.println("Animal �ൿ : ���÷� �����ϱ�");
	}
}
class Cat extends Animal {
	protected int eyes; //default ������ +�ٸ� ��Ű���ڽ�Ŭ����
	public Cat() {
		System.out.println("���ο� ���� ������ Cat");
	}
	public void sound() {
		setName("�����");
		setColor("ȭ��Ʈ");
		System.out.println("Ư¡ : �߿˾߿�");
	}
	@Override
	public void act() {
		System.out.println("Animal �ൿ : ���÷� �߿˾߿˿��");
	}
}

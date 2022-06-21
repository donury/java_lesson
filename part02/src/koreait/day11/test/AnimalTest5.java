package koreait.day11.test;
public class AnimalTest5 {

	public static void main(String[] args) {
		Animal[] animals = new Animal[10];
		animals[0] = new Dog();
		animals[3] = new Frog();
		animals[3].setName("����A");
		animals[4] = new Frog();
		animals[4].setName("����B");
		animals[6]=new Crow();
		
		for(Animal temp : animals)
			if(temp != null) 
				temp.act(); 
				//�������� �������....instanceof
		int cnt=0;
		for(Animal temp: animals) {
			if(temp!=null && temp instanceof Frog) {
				cnt++;
				System.out.println(temp.eat(100));
				
			}
		}
			System.out.println("�������� "+ cnt +"���� ��� �ֽ��ϴ�.");
		//�������� ��� ����....?
			System.out.println("������ �����ֱ�..............");
			cnt=0;
			for(Animal temp : animals) {
				if(temp != null &&temp.type ==Animal.DOG) {
					cnt++;
					System.out.println(temp.eat("���ִ� ����"));
				}
			}
				System.out.println("������ "+ cnt +"���� ��� �ֽ��ϴ�.");
				
				System.out.println("��� �����ֱ�................");
				System.out.println(animals[6].eat(animals[3]));
				
	}
}





class Frog extends Animal {	//������
	
	protected String mouth; //default ������ +�ٸ� ��Ű���ڽ�Ŭ����
	public Frog() {
		System.out.println("���ο� ���� ������ Frog ");
		type=Animal.FROG;
	}
	@Override
	public String eat(Object object) {
		// TODO Auto-generated method stub
		return null;
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
		type=Animal.CAT;
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
	@Override
	public String eat(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
}

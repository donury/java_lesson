package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest3 {
	//������ ���� ����3
	public static void main(String[] args) {

		Animal[] animals =new Animal[10];
		
		animals[0] =new Frog();
		animals[1] =new Cat();
		animals[3] =new Dog();
		animals[7] =new Crow();
	
	
		for(Animal temp : animals) {	//�迭���� ������� �ϳ��� �������� //for each�� ���
			System.out.println(":::::::::::::::::::::");
			if(temp!=null) {
				Cat cat; Dog dog; Frog frog; Crow crow;
				if(temp instanceof Cat) {
					cat =(Cat)temp;//�ٿ�ĳ����  :animal ��¥ ��ü�� ���� ���� �Ǵ� �����ƴ�
					cat.sound();
				}
				if(temp instanceof Dog) {
					dog=(Dog)temp;
					dog.run();
				}
				if(temp instanceof Frog) {
					frog=(Frog)temp;
					frog.jumping();
				}
					if(temp instanceof Crow) {
					crow=(Crow)temp; crow.fly();
					
					}	//if end
			temp.act();
			temp.print();
			System.out.println("::::::::::::::::::::::::");
	}
}

		
		
		
}
}
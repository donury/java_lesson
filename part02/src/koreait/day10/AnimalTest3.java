package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest3 {
	//다형성 구현 예시3
	public static void main(String[] args) {

		Animal[] animals =new Animal[10];
		
		animals[0] =new Frog();
		animals[1] =new Cat();
		animals[3] =new Dog();
		animals[7] =new Crow();
	
	
		for(Animal temp : animals) {	//배열에서 순서대로 하나씩 꺼내오기 //for each문 사용
			System.out.println(":::::::::::::::::::::");
			if(temp!=null) {
				Cat cat; Dog dog; Frog frog; Crow crow;
				if(temp instanceof Cat) {
					cat =(Cat)temp;//다운캐스팅  :animal 진짜 객체에 따라 오류 또는 오류아님
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
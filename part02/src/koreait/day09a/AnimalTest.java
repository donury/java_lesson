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
		Animal temp =dog;	//자식객체는 부모클래스 타입으로 참조할 수 있습니다
		temp.print();
//		temp.run();		//오류 : 부모타입 변수로는 자식 메소드 실행 못합니다.
		temp=crow;		//자식객체는 부모클래스 타입으로 참조할 수 있습니다.
		temp.print();
//		temp.fly();
		Animal puppy = new Dog();
		puppy.print();
//		puppy.run()	//오류: 부모타입 변수로는 자식 메소드 실행 불가
		
		Dog puddle =(Dog)puppy;	//Animal 타입을 Dog 타입으로 casting(자식 클래스 Dog 객체이므로 가능.)
		puddle.run();		// puppy 변수가 참조하는 객체가 Dog 타입일떄만 가능
		puddle.print();
	}

}

package koreait.day11.test;
public class AnimalTest5 {

	public static void main(String[] args) {
		Animal[] animals = new Animal[10];
		animals[0] = new Dog();
		animals[3] = new Frog();
		animals[3].setName("개굴A");
		animals[4] = new Frog();
		animals[4].setName("개굴B");
		animals[6]=new Crow();
		
		for(Animal temp : animals)
			if(temp != null) 
				temp.act(); 
				//개구리가 몇마리인지....instanceof
		int cnt=0;
		for(Animal temp: animals) {
			if(temp!=null && temp instanceof Frog) {
				cnt++;
				System.out.println(temp.eat(100));
				
			}
		}
			System.out.println("개구리는 "+ cnt +"마리 살고 있습니다.");
		//강아지가 몇마리 인지....?
			System.out.println("강아지 먹이주기..............");
			cnt=0;
			for(Animal temp : animals) {
				if(temp != null &&temp.type ==Animal.DOG) {
					cnt++;
					System.out.println(temp.eat("맛있는 간식"));
				}
			}
				System.out.println("강아지 "+ cnt +"마리 살고 있습니다.");
				
				System.out.println("까마귀 먹이주기................");
				System.out.println(animals[6].eat(animals[3]));
				
	}
}





class Frog extends Animal {	//개구리
	
	protected String mouth; //default 한정자 +다른 패키지자식클래스
	public Frog() {
		System.out.println("새로운 동물 가족은 Frog ");
		type=Animal.FROG;
	}
	@Override
	public String eat(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	public void jumping() {
		setName("개구리");
		setColor("초록");
		System.out.println("특징 : 점핑");
	
	}
	//다형성 구현 : 메소드 오버라이드 *참고 : 오버로딩	-찾아보기 
	//				ㄴ부모클래스의 메소드를 재정의. 이때 인자와 리턴타입은 동일하게 합니다.
	
	@Override
		public void act() {
		System.out.println("Animal 행동 : 수시로 점프하기");
	}
}
class Cat extends Animal {
	protected int eyes; //default 한정자 +다른 패키지자식클래스
	public Cat() {
		System.out.println("새로운 동물 가족은 Cat");
		type=Animal.CAT;
	}
	public void sound() {
		setName("고양이");
		setColor("화이트");
		System.out.println("특징 : 야옹야옹");
	}
	@Override
	public void act() {
		System.out.println("Animal 행동 : 수시로 야옹야옹울기");
	}
	@Override
	public String eat(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
}

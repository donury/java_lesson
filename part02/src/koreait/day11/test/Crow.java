package koreait.day11.test;

public class Crow extends Animal {	//까마귀
	
	protected int winds; //default 한정자 +다른 패키지자식클래스
	
	public Crow() {
		System.out.println("새로운 동물 가족은 crow ");
	}
	public void fly() {
		setName("까마귀");
		setColor("검정색");
		System.out.println("특징 : 날기");
	
	}
	//추상메소드 재정의가 없어서 오류 
	@Override
	public void act() {
System.out.println("Animal 행동 : 하루종일 날라다니기");
		
	}
	@Override
	public String eat(Object object) {
		// TODO Auto-generated method stub
		return "먹이는 벌레 "	+ object + "마리입니다";
	}
}

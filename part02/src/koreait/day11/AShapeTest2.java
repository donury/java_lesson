package koreait.day11;

import koreait.day09a.Animal;

public class AShapeTest2 {
//익명 클래스 : anonymous. 이름이 없는 클래스
	public static void main(String[] args) {

		
		//마름모꼴
		//익명 내부(inner) 클래스 정의
		AShape sha = new AShape() {
			
			@Override
			public double getArea() {
				// TODO Auto-generated method stub
				return width+height;
			}
		};
		
		AShape sha2 =new AShape(20,13) {
			
			@Override
			public double getArea() {
				// TODO Auto-generated method stub
				return width+height;
			}
		};
		System.out.println("sha 넓이 = "+ sha.getArea());
		System.out.println("sha2 넓이 ="+ sha2.getArea());
		
		Animal snake =new Animal() {
			int length;
			
			@Override
			public void act() {
			setName("이구아나");
			setColor("얼룩이");
			this.length =3;
			System.out.println("특징 : 기어다니기");	
			}
			@Override
			public String toString() {
				return "length =" +length;
			}
			
		};
		snake.act();
		
		System.out.println(snake);
	}
}

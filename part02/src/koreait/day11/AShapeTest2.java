package koreait.day11;

import koreait.day09a.Animal;

public class AShapeTest2 {
//�͸� Ŭ���� : anonymous. �̸��� ���� Ŭ����
	public static void main(String[] args) {

		
		//�������
		//�͸� ����(inner) Ŭ���� ����
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
		System.out.println("sha ���� = "+ sha.getArea());
		System.out.println("sha2 ���� ="+ sha2.getArea());
		
		Animal snake =new Animal() {
			int length;
			
			@Override
			public void act() {
			setName("�̱��Ƴ�");
			setColor("�����");
			this.length =3;
			System.out.println("Ư¡ : ���ٴϱ�");	
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

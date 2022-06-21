package koreait.day10;

public class ConstructorTest2 {

	public static void main(String[] args) {

	}

}
class Product2 {
		int price;
		
		//디폴트 생성자는 동작을 안합니다.
		
		//부모클래스의 디폴스 생성자 정의해서 자식클래스가 
		//사용가능하도록합니다.
		public Product2() {
		
		}
		public Product2(int price) {
			this.price=price;
		}
}
class Food2 extends Product2{	//Product() 디폴트 생성자 실행 ->Food() 디폴트 생성자 실행
//Food2 디폴트 생성자는 자동으로 동작합니다.
//부모클래스 Product2 디폴트 생성자 super() 호출
}
class Electronics2 extends Product2{

}
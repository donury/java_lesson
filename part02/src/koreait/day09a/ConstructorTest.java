package koreait.day09a;

public class ConstructorTest {

	public static void main(String[] args) {

	}

}
class Product {
		int price;
		
		//디폴트 생성자는 동작을 안합니다.
		
		
		//커스텀생성자 사용시
		//자식클래스에도 커스텀 생성자 만들고
		//super메소드 소환
		public Product(int price) {
			this.price=price;
		}
}
class Food extends Product{	//Product() 디폴트 생성자 실행 ->Food() 디폴트 생성자 실행
	public Food(int price) {
		super(price);
		
	}
}
class Electronics extends Product{
	public Electronics(int price) {
	super(price);
	}
}
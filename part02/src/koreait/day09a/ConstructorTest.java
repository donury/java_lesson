package koreait.day09a;

public class ConstructorTest {

	public static void main(String[] args) {

	}

}
class Product {
		int price;
		
		//����Ʈ �����ڴ� ������ ���մϴ�.
		
		
		//Ŀ���һ����� ����
		//�ڽ�Ŭ�������� Ŀ���� ������ �����
		//super�޼ҵ� ��ȯ
		public Product(int price) {
			this.price=price;
		}
}
class Food extends Product{	//Product() ����Ʈ ������ ���� ->Food() ����Ʈ ������ ����
	public Food(int price) {
		super(price);
		
	}
}
class Electronics extends Product{
	public Electronics(int price) {
	super(price);
	}
}
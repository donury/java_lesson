package koreait.day10;

public class ConstructorTest2 {

	public static void main(String[] args) {

	}

}
class Product2 {
		int price;
		
		//����Ʈ �����ڴ� ������ ���մϴ�.
		
		//�θ�Ŭ������ ������ ������ �����ؼ� �ڽ�Ŭ������ 
		//��밡���ϵ����մϴ�.
		public Product2() {
		
		}
		public Product2(int price) {
			this.price=price;
		}
}
class Food2 extends Product2{	//Product() ����Ʈ ������ ���� ->Food() ����Ʈ ������ ����
//Food2 ����Ʈ �����ڴ� �ڵ����� �����մϴ�.
//�θ�Ŭ���� Product2 ����Ʈ ������ super() ȣ��
}
class Electronics2 extends Product2{

}
package koreait.test;
//���ؿ�
public class Bike extends Product{
	private int speed;
	
	public Bike() {
		
	}
	public Bike(int price,String prdName,int speed) {
		this.price=price;
		this.prdName=prdName;
		this.speed=speed; //7
	}
	public int getSpeed() {	
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;	//6
	}

	
	public String ride() {
		
		return "����� �̰��� �ü�+speed"+"km�� Ż�� �ֽ��ϴ�.";//10��
				
	}
	@Override
	public String toString() {
		return "Bike [speed=" + speed + ", price=" + price + ", prdName=" + prdName + "]";
	}
	@Override
	public String sell(Object obj) {
		return String.format("�߰� ���� ��� - %d %% ����",obj); //4
	}

	
}

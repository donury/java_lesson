package koreait.test1;

public class Bike extends Product{
	//e	
	private int speed;
	
	//f
	public Bike(int price,String prdName ,int speed) {
		this.price=price;
		this.prdName=prdName;
		this.speed=speed;
	}
	
	@Override
	public String sell(Object obj) {
		return String.format("추가 할인 -%d %%", obj); //4
	}
	
	//e
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	//g
	@Override
	public String toString() {
		return "Bike [speed=" + speed + ", price=" + price + ", prdName=" + prdName + "]";
	}
	
	
}

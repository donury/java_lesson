package koreait.test;
//이준엽
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
		
		return "당신은 이것을 시속+speed"+"km로 탈수 있습니다.";//10번
				
	}
	@Override
	public String toString() {
		return "Bike [speed=" + speed + ", price=" + price + ", prdName=" + prdName + "]";
	}
	@Override
	public String sell(Object obj) {
		return String.format("추가 할인 행사 - %d %% 인하",obj); //4
	}

	
}

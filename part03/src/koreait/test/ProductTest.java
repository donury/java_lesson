package koreait.test;


//���ؿ�
public class ProductTest {

	public static void main(String[] args) {
		//13
		Product [] cart =new Product[10];
		cart[0] =new Bike(123000,"MTB",25);
		cart[1]	=new Electronics(35000,"USB");
		cart[3] =new Bike(99000,"��õ��",15);
		cart[5]	=new Electronics(117000,"ipad");
		cart[7]	=new Electronics(2250000,"lg �����");
		
		//14
		Electronics electronics=(Electronics) cart[7];
		electronics.setKwh(0.9);
		System.out.println(electronics.Power());
		System.out.println(cart[7]);
		
		//15
		for(Product temp: cart) {
			if(temp!= null && temp.price >=100000) {
				System.out.println(temp);
			}
		}
		//16��
		for(Product temp :cart) {
			if(temp instanceof Bike) {
				Bike bik =(Bike)temp;
				System.out.println(bik.ride());
	       }
		}
}
}

class Electronics extends Product{
	private double kwh;
	
	Electronics(){
		
	}
	Electronics(int price,String prdName){
		this.price=price;
		this.prdName=prdName;
	}
	public double getKwh() {
		return kwh;
	}

	public void setKwh(double kwh) {
		this.kwh = kwh;
	}	//8

	public double Power() {
		
		return this.kwh*24; //11
	}
	@Override
	public String toString() {
		return "Electronics [kwh=" + kwh + ", price=" + price + ", prdName=" + prdName + "]";
	}//12
	@Override
	public String sell(Object obj) {
	return String.format("������ǰ -%s(1set)",obj );	//5
	}

	
}

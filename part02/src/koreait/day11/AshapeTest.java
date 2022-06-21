package koreait.day11;

public class AshapeTest {

	public static void main(String[] args) {
	
	Triangle tri=new Triangle(100,84);
	tri.shapeName="직각삼각형";
	System.out.println(tri);
	System.out.println("넓이 =" +tri.getArea());
	
	}

	
	
	
	
	
	
}

abstract class AShape{	//도형
	protected String shapeName; 
	protected int width;
	protected int height;
	
	public AShape() {    //객체는 직접 못만들고 자식이 객체를 만들때 실행
		System.out.println("AShape 디폴트 생성자 동작합니다.");
	}
	//추상클래스는 커스텀 생성자 만드나요?
	public AShape(int width,int height) {
		System.out.println("AShape 커스텀 생성자 동작합니다.");
		this.width=width;
		this.height=height;
	}
	public abstract double getArea();	
}

class Triangle extends AShape{

	public Triangle(int width,int height) {
		super(width,height);
	}
	@Override
	public double getArea() {
		return width*height/2;
	}
	@Override
	public String toString() {
		return "Triangle [shapeName=" + shapeName + ", width=" + width + ", height=" + height + "]";
	}

	
}
class Circle extends AShape{	//반지름  반지름*반지름* 3.14
	private int radius;

	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return radius*radius*3.14;
	}


	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", shapeName=" + shapeName + ", width=" + width + ", height=" + height
				+ "]";
	}

}
//class Rectangle extends AShape{
//
//	@Override
//	public double getArea() {
//		return wedth*heigth;
//	}
//

	
	
	
	
	
	
	

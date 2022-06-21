package koreait.day11;

public class AshapeTest {

	public static void main(String[] args) {
	
	Triangle tri=new Triangle(100,84);
	tri.shapeName="�����ﰢ��";
	System.out.println(tri);
	System.out.println("���� =" +tri.getArea());
	
	}

	
	
	
	
	
	
}

abstract class AShape{	//����
	protected String shapeName; 
	protected int width;
	protected int height;
	
	public AShape() {    //��ü�� ���� ������� �ڽ��� ��ü�� ���鶧 ����
		System.out.println("AShape ����Ʈ ������ �����մϴ�.");
	}
	//�߻�Ŭ������ Ŀ���� ������ ���峪��?
	public AShape(int width,int height) {
		System.out.println("AShape Ŀ���� ������ �����մϴ�.");
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
class Circle extends AShape{	//������  ������*������* 3.14
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

	
	
	
	
	
	
	

package ClassExam;

public class ClassExam1 extends ClassExam{

	public ClassExam1(String name, String sub, int age, int score) {
		super(name, sub, age, score);	//Ŀ���� ������
		// TODO Auto-generated constructor stub
	}
	
	public void print() {
		System.out.println("�л��̸� :"+ name);
		System.out.println("�а���:"+ sub);
		System.out.println("���� :"+age);
		System.out.println("���� : "+score);
	}

}

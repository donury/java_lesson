package ClassExam;

public class ClassExam1 extends ClassExam{

	public ClassExam1(String name, String sub, int age, int score) {
		super(name, sub, age, score);	//커스텀 생성자
		// TODO Auto-generated constructor stub
	}
	
	public void print() {
		System.out.println("학생이름 :"+ name);
		System.out.println("학과명:"+ sub);
		System.out.println("나이 :"+age);
		System.out.println("점수 : "+score);
	}

}

package koreait.day07;
//39번
public class Student {

	int no;
	String name;
	int grade;
	Score score; 	//다른 클래스 객체를 필드로 갖게 됩니다.
	void setDate(String name, int grade) {
		this.name=name;
		this.grade=grade;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", grade=" + grade +
				", score=" + score + "]";
	}
	//인자로 전달받은 값을 전역변수(필드-객체의 특성을 나타내는 구성요소)에 대입
		
	
	
	
	}

	
	
	



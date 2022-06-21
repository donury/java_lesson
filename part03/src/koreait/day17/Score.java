package koreait.day17;

public class Score {
	public static Object Integer;
	private String name;
	private int korean;
	private int english;
	private int science;
	private String grade;
	//메소드 인자로 전달받은 값을 클래스 전역변수 korean에 저장(대입)
	//this는 setkorean 메소드 실행 객체
	//set은 void. public void 필수 , 인자값 대입 
	//get은 return값 입력       *private은 클래스내 에서만 사용가능
	
	//기본생성자 숨어 있습니다. 접근한정자는 public
	
		
	public Score(String name,int korean, int english,int science) {
		this.name=name;
		this.korean=korean;
		this.english=english;
		this.science=science;
	}
	
	
	
	
	public Score(String string) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return " [name=" + name + ", korean=" + korean + ", english=" + english + ", science=" + science
				+ ", grade=" + getgrade() + "]";
	}
	public int sum() {
		int result= this.korean+this.english+this.science;
		return result;
	}
	
	public double average() {
		return (double)sum()/3;
	
	}
	//setter : 실행내용. 필요에 따라서는 접근한정자를 private으로도 바꿀수 있다.
	private void setGrade() {
		if(average() >=90 )this.grade="A";
		else if(average() >=80 ) this.grade ="B";
		else if(average() >=70 ) this.grade ="C";
		else if(average() >=60 ) this.grade ="D";
		else this.grade="F";
	}
	String getgrade() {
		setGrade();
		return grade;
	}
	void setKorean(int korean) {
		this.korean=korean;
		}
		int gerKorean() {
			return korean; 
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		void setEnglish(int english) {
			this.english=english;
		}
		int getEnglish(){
			return english;
		}
		 
	
	
		
		public void setScience(int science) {
			this.science = science;
		}
		public int getScience() {
			return science;
		}
}


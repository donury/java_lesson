package koreait.day08;

public class Score {
	private int korean;
	private int english;
	private int science;
	private String grade;
	//메소드 인자로 전달받은 값을 클래스 전역변수 korean에 저장(대입)
	//this는 setkorean 메소드 실행 객체
	//set은 void. public void 필수 , 인자값 대입 
	//get은 return값 입력       *private은 클래스내 에서만 사용가능
	
	//기본생성자 숨어 있습니다. 접근한정자는 public
	void setKorean(int korean) {
		this.korean=korean;
		}
		int gerKorean() {
			return korean; 
		}
		void setEnglish(int english) {
			this.english=english;
		}
		int getEnglish(){
			return english;
		}
		 
		void setGrade(String grade) {
			this.grade=grade;
		}
		String getgrade() {
			return grade;
		}
		
		public void setScience(int science) {
			this.science = science;
		}
		public int getScience() {
			return science;
		}
}


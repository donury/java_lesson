package koreait.day17;

public class Score {
	public static Object Integer;
	private String name;
	private int korean;
	private int english;
	private int science;
	private String grade;
	//�޼ҵ� ���ڷ� ���޹��� ���� Ŭ���� �������� korean�� ����(����)
	//this�� setkorean �޼ҵ� ���� ��ü
	//set�� void. public void �ʼ� , ���ڰ� ���� 
	//get�� return�� �Է�       *private�� Ŭ������ ������ ��밡��
	
	//�⺻������ ���� �ֽ��ϴ�. ���������ڴ� public
	
		
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
	//setter : ���೻��. �ʿ信 ���󼭴� ���������ڸ� private���ε� �ٲܼ� �ִ�.
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


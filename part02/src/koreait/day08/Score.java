package koreait.day08;

public class Score {
	private int korean;
	private int english;
	private int science;
	private String grade;
	//�޼ҵ� ���ڷ� ���޹��� ���� Ŭ���� �������� korean�� ����(����)
	//this�� setkorean �޼ҵ� ���� ��ü
	//set�� void. public void �ʼ� , ���ڰ� ���� 
	//get�� return�� �Է�       *private�� Ŭ������ ������ ��밡��
	
	//�⺻������ ���� �ֽ��ϴ�. ���������ڴ� public
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


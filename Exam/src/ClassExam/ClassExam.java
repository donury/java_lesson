package ClassExam;

 public class  ClassExam {
	 String name;	//������ ����
	 String sub;	//����
	 
	 int age;	//�л�����
	 int score; // ����
	 
	 public ClassExam(String name,String sub, int age, int score){
		 this.name=name;
		 this.sub=sub;
		 this.score=score;
		 this.age=age;
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	 
	 
}

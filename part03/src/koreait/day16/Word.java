package koreait.day16;

public class Word {
	private String english;
	private String korean;
	private int level;
	
	public Word() {	
	}
	
	
	@Override
	public String toString() {
		return english + " " +korean+" "  + level ;
	}



	
	public Word(String english, String korean) {
		this.english=english;
		this.korean=korean;

	}
	public Word(String english) {
		this.english=english;
	
	}
		public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	public String getKorean() {
		return korean;
	}
	public void setKorean(String korean) {
		this.korean = korean;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
}

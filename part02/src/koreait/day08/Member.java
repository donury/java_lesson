package koreait.day08;
//이준엽
public class Member {
private String name;
private String email;
private int age;
private int level;

public Member(String name,String email){	
this.name=name;
this.email=email;
//this 는 메소드를 실행하는 객체
}
//기본생성자 (default) 생성자:
public Member() {
	System.out.println("name,email,age,level 필드는 기본값입니다.");
}

 void setName(String name) {
	this.name = name;
}

 public String getName() {
	return name;
}
 public void setEmail(String email) {
	this.email = email;
}
 public String getEmail() {
	return email;
}
 public  int getAge() {
	return age;
}
 public void setAge(int age) {
	this.age = age;
}
 public int getLevel() {
	return level;
}
 public void setLevel(int level) {
	this.level = level;
}


}



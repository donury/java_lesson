package koreait.day08;
//���ؿ�
public class Member {
private String name;
private String email;
private int age;
private int level;

public Member(String name,String email){	
this.name=name;
this.email=email;
//this �� �޼ҵ带 �����ϴ� ��ü
}
//�⺻������ (default) ������:
public Member() {
	System.out.println("name,email,age,level �ʵ�� �⺻���Դϴ�.");
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



package koreait.day08;

public class MemberTest {

	public static void main(String[] args) {
		Member momo =new Member();
		Member nana= new Member("�ֳ���","����@gamil.com");
		System.out.println(nana.getName());
		nana.setAge(26);
		System.out.println(nana.getAge());
	}

}

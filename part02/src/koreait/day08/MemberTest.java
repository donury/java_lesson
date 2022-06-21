package koreait.day08;

public class MemberTest {

	public static void main(String[] args) {
		Member momo =new Member();
		Member nana= new Member("최나나","나나@gamil.com");
		System.out.println(nana.getName());
		nana.setAge(26);
		System.out.println(nana.getAge());
	}

}

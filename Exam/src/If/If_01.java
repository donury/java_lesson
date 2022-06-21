package If;

import java.util.Scanner;

public class If_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String id,password;
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요: ");
		id=sc.nextLine();
			if(id.equals("mwy0043")) {			
				System.out.println("비밀번호를 입력하세요.");
			password=sc.nextLine();
			if(password.equals("Mom611012")) {
				System.out.println("정상적으로 로그인 되었습니다");
			}
				else {
					System.out.println("비밀번호를 다시 입력해주시기 바랍니다. ");
				}		
				
				}
			else {
				System.out.println("아이디를 다시 입력해주시기 바랍니다");
			}
	}
}
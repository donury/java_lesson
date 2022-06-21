package koreait.day04;

import java.util.Scanner;

public class C21_StringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//아이디가 6글자 이상 단($,% 제외)
		//도메인은 naver.com 

		System.out.println("아이디를 입력하세요 :");
		String email,domain,account,password;
		Scanner sc = new Scanner(System.in);
		email= sc.nextLine();
		int center =email.indexOf('@');
		if(center != -1 && center == email.lastIndexOf('@') ) {
			account=email.substring(0, center);
			domain=email.substring(center+1,email.length());
				if(domain.equals("naver.com")) {
					if(account.length()>=6) {
					
					if(!(account.indexOf('$')== -1 && account.indexOf('%') == -1)) {
						System.out.println("도메인 : "+domain);
						System.out.println("이메일 : "+ account);
//					System.out.println("비밀번호를 입력하세요 : ");
//					password=sc.nextLine();
//					if(password.length() > 8) {
//						System.out.println("");
//					}	else {
//						System.out.println("비밀번호를 잘못입력하셨습니다.");
//					}
				
			}else {
				System.out.println("올바른 이메일 형식이 아닙니다.");
			}
		}else {
			System.out.println("올바른 도메인 형식이 아닙니다.");
	}
	
}
				}
		else {
			System.out.println("다시 입력하시오");
		}
	}
	}

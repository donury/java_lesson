package koreait.day04;

import java.util.Scanner;

public class C21_StringEx {
//작성자 이준엽
	public static void main(String[] args) {
		/*구글 이메일 계정을 체크하는 기능 구현
		 * 1.@기호가 1개 포함되어야 합니다.(메시지: 이메일 형식이 아닙니다.)
		 * 		ㄴindexof가 -1이 아니고 indexof 와 lastindexof 가 값은 값인가?
		 * 2.1번이 참일때 @뒤에는 gmail.com이어야 합니다 (메시지 :도메인 이름이 틀립니다.)
		 * 		ㄴ'@'의 indexof 를 구해서 그 뒤부터 끝까지 substring 추출한 문자열을 equals 비교
		 * 3.2번이 참일 때 @ 앞까지의 문자열(계정이름)만 추출합니다.
		 * 		ㄴ'@'의 indexof를 구해서 처음 부터 '@' 이전 까지의 문자열 substring 저장
		 * 4.3번의 계정이름은 6글자 이상이어야 합니다.
		 * 			ㄴ3번의 문자열이 length() 값6인지 비교
		 * 5.3번의 계정이름에는 특수기호 $,%가 포함되면 안됩니다.
		 * 			ㄴindexof('$'), indexof('%')가 모두 -1 이 아니면 허용안하는 기호 포함
		 */
		Scanner sc = new Scanner(System.in);
		String email,account,domain,password;
		boolean isValid=true;
		System.out.println("사용할 이메일 입력하세요.>>> ");
		email= sc.nextLine();
		int idx= email.indexOf('@');
		if(idx !=-1 && idx ==email.lastIndexOf('@')) {
			account= email.substring(0,idx);
			domain=email.substring(idx+1, email.length());
			System.out.println("이메일 형식: "+ domain);
			System.out.println("도메인 형식 :"+account);
			if(domain.equals("gmail.com")) {
				if(account.length() >=6)
				{
					System.out.println("비밀번호를 입력하세요 : ");
					password = sc.next();
					if(!(password.length() <= 8)) {
						System.out.println("비밀번호가 정상적으로 입력되었습니다.");
					if(!(account.indexOf('$')== -1 && account.indexOf('%')== -1)) {
						System.out.println("오류 : $,%는 사용할 수 없는 기호입니다.");
						isValid=false;
						
						}
					}else {
						System.out.println("비밀번호를 다시 입력하세요");
					}
					
				}else {
					isValid=false;
					System.out.println("오류:도메인 이름이 틀립니다..6글자 이상입력하세요");
				}
				
			}else {
				System.out.println("오류 : 올바른 이메일 형식이 아닙니다.");
				isValid = false;
			}
		}
				System.out.println(isValid);	
				
	}
	}


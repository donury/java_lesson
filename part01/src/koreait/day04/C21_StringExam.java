package koreait.day04;

import java.util.Scanner;

public class C21_StringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���̵� 6���� �̻� ��($,% ����)
		//�������� naver.com 

		System.out.println("���̵� �Է��ϼ��� :");
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
						System.out.println("������ : "+domain);
						System.out.println("�̸��� : "+ account);
//					System.out.println("��й�ȣ�� �Է��ϼ��� : ");
//					password=sc.nextLine();
//					if(password.length() > 8) {
//						System.out.println("");
//					}	else {
//						System.out.println("��й�ȣ�� �߸��Է��ϼ̽��ϴ�.");
//					}
				
			}else {
				System.out.println("�ùٸ� �̸��� ������ �ƴմϴ�.");
			}
		}else {
			System.out.println("�ùٸ� ������ ������ �ƴմϴ�.");
	}
	
}
				}
		else {
			System.out.println("�ٽ� �Է��Ͻÿ�");
		}
	}
	}

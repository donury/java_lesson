package koreait.day04;

import java.util.Scanner;

public class C21_StringEx {
//�ۼ��� ���ؿ�
	public static void main(String[] args) {
		/*���� �̸��� ������ üũ�ϴ� ��� ����
		 * 1.@��ȣ�� 1�� ���ԵǾ�� �մϴ�.(�޽���: �̸��� ������ �ƴմϴ�.)
		 * 		��indexof�� -1�� �ƴϰ� indexof �� lastindexof �� ���� ���ΰ�?
		 * 2.1���� ���϶� @�ڿ��� gmail.com�̾�� �մϴ� (�޽��� :������ �̸��� Ʋ���ϴ�.)
		 * 		��'@'�� indexof �� ���ؼ� �� �ں��� ������ substring ������ ���ڿ��� equals ��
		 * 3.2���� ���� �� @ �ձ����� ���ڿ�(�����̸�)�� �����մϴ�.
		 * 		��'@'�� indexof�� ���ؼ� ó�� ���� '@' ���� ������ ���ڿ� substring ����
		 * 4.3���� �����̸��� 6���� �̻��̾�� �մϴ�.
		 * 			��3���� ���ڿ��� length() ��6���� ��
		 * 5.3���� �����̸����� Ư����ȣ $,%�� ���ԵǸ� �ȵ˴ϴ�.
		 * 			��indexof('$'), indexof('%')�� ��� -1 �� �ƴϸ� �����ϴ� ��ȣ ����
		 */
		Scanner sc = new Scanner(System.in);
		String email,account,domain,password;
		boolean isValid=true;
		System.out.println("����� �̸��� �Է��ϼ���.>>> ");
		email= sc.nextLine();
		int idx= email.indexOf('@');
		if(idx !=-1 && idx ==email.lastIndexOf('@')) {
			account= email.substring(0,idx);
			domain=email.substring(idx+1, email.length());
			System.out.println("�̸��� ����: "+ domain);
			System.out.println("������ ���� :"+account);
			if(domain.equals("gmail.com")) {
				if(account.length() >=6)
				{
					System.out.println("��й�ȣ�� �Է��ϼ��� : ");
					password = sc.next();
					if(!(password.length() <= 8)) {
						System.out.println("��й�ȣ�� ���������� �ԷµǾ����ϴ�.");
					if(!(account.indexOf('$')== -1 && account.indexOf('%')== -1)) {
						System.out.println("���� : $,%�� ����� �� ���� ��ȣ�Դϴ�.");
						isValid=false;
						
						}
					}else {
						System.out.println("��й�ȣ�� �ٽ� �Է��ϼ���");
					}
					
				}else {
					isValid=false;
					System.out.println("����:������ �̸��� Ʋ���ϴ�..6���� �̻��Է��ϼ���");
				}
				
			}else {
				System.out.println("���� : �ùٸ� �̸��� ������ �ƴմϴ�.");
				isValid = false;
			}
		}
				System.out.println(isValid);	
				
	}
	}


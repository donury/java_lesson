package If;

import java.util.Scanner;

public class If_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String id,password;
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� �Է����ּ���: ");
		id=sc.nextLine();
			if(id.equals("mwy0043")) {			
				System.out.println("��й�ȣ�� �Է��ϼ���.");
			password=sc.nextLine();
			if(password.equals("Mom611012")) {
				System.out.println("���������� �α��� �Ǿ����ϴ�");
			}
				else {
					System.out.println("��й�ȣ�� �ٽ� �Է����ֽñ� �ٶ��ϴ�. ");
				}		
				
				}
			else {
				System.out.println("���̵� �ٽ� �Է����ֽñ� �ٶ��ϴ�");
			}
	}
}
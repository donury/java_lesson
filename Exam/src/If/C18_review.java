package If;

import java.util.Scanner;

public class C18_review {

	public static void main(String[] args) {
		int kor,eng,math,si,hi;
		Scanner sc =new Scanner(System.in);
		System.out.println("[[���� ���� : ��հ� ���� ���ϱ�]]");
		System.out.printf("�������� :  ");
		kor=sc.nextInt();
	System.out.printf("\n���� ���� : ");
	eng=sc.nextInt();
	System.out.printf("\n���� ���� : ");
	math=sc.nextInt();
	System.out.printf("\n��ȸ���� : ");
	si=sc.nextInt();
	System.out.printf("\n�������� : ");
	hi=sc.nextInt();
	
	int total =kor+eng+math+si+hi;
	int aver=(kor+eng+math+si+hi)/5;
	
	System.out.printf("������ : %d%s%s%d%s",total,"��\n","�����: ",aver,"��\n");
	}

}

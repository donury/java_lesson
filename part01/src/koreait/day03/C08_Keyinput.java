package koreait.day03;

import java.util.Scanner;

public class C08_Keyinput {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);	
		int width;
		int height;
//		int box_area= width*height;
		double hlaf,round,circle_area;
		final double pi=3.14;
		System.out.print("�簢�� ������ ���� ���ϱ�\n");
		System.out.print("�簢�� ���� �Է� : " );
		width=sc.nextInt();
		System.out.print("�簢�� ���� �Է� : ");
		height=sc.nextInt();
		int area = width * height;
		System.out.print("�簢���� ���̴� : "+area+"��" );
//		int width = 23 , height = 19 , box_area = width * height;
//		System.out.printf("%s\n %s %d %s \n %s %d %s \n %s %d %s \n",
//							"[�簢�� ������ ���� ���ϱ�]",
//							"����: ",23,"cm",
//							"���� : ",19,"cm",
//							"���̸� ���߽��ϴ�. -> ", box_area,"��");	
			System.out.println();
		//�� ����, �ѷ�
		System.out.print("�� ������ ���̿� �ѷ� ���ϱ�\n");
		System.out.print("������ : ");
			double half =sc.nextDouble();
			round= 2*3.14*half;
			circle_area=3.14*half*half;
//			System.out.println("������ : "+half );
			System.out.println("�ѷ��� ���߽��ϴ�: "+round+"��");
			System.out.println("���̸� ���߽��ϴ� : "+circle_area+"��");
//			double half=23.230 , round= 2*3.14*half, circle_area=3.14*half*half;
//		System.out.printf("%s \n %s %.3f %s \n%s %.3f %s \n %s %.3f %s",
//							"[�� ������ ���̿� �ѷ� ���ϱ�]",
//							"������ : ", half,"cm",
//							"�ѷ��� ���߽��ϴ�.-> ",circle_area, "��",
//							"���̸� ���߽��ϴ�. -> ",round,"��");
//		System.out.println();
//		//final �׽�Ʈ :
//		//	�������� �տ� final(������) Ű���带 ���̸� ���� �������� ���Ѵ�.
//		
//		final int test =123;
//		System.out.println(test);
	}
	
	
}

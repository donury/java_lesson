package If;

import java.util.Scanner;

public class C13_MaxMinExam {

	public static void main(String[] args) {
		//�Է¹��� 5�� �߿� ���� ū��, ���� ������ ���ϱ�	
		Scanner sc= new Scanner(System.in);
		int n1,n2,n3,n4,n5,max,min;
		System.out.println("���ڸ� �Է��ϼ���: ");
		n1=sc.nextInt();
		System.out.println("ù���� ���� : "+n1);
		n2=sc.nextInt();
		System.out.println("�ι�° ���� : " +n2);
		n3 =sc.nextInt();
		System.out.println("����° ���� : " +n3);
		n4=sc.nextInt( );
		System.out.println("�׹�° ���� : "+n4);
		n5=sc.nextInt();
		System.out.println("�ټ����� ���� : "+n5);
		if(n1>=n2) {  
			max=n1;
			min=n2;
			}
		else { 
			max=n2;
			min=n1;
		}
		if(max<=n3)  
			max=n3;
		else 
			min=n3;
		if(max<=n4) 
			max=n4;
		else 
		min=n4;
		if(max<=n5)
		max=n5;
		else
			min=n5;
		
		System.out.println("���� ū ���ڴ� : "+max+"�Դϴ�");
		System.out.println("���� ���� ���ڴ� : "+min+"�Դϴ�");
			
		}
	}



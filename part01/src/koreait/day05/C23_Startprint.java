package koreait.day05;

import java.util.Scanner;

public class C23_Startprint {

	public static void main(String[] args) {
		System.out.println("[[��ȭ���� �ı�]]");
		System.out.print("������ �� �� �ֽðڽ��ϴ� ? (1~5) >>> ");
		Scanner sc =new Scanner(System.in);
		int count=sc.nextInt();
			System.out.println("���1)");
			for(int i=0; i<count; i++) 
				System.out.print("��");
			
				System.out.println("\n���2)");
				for(int i=0; i<count; i++) 
				System.out.print("��");
				for(int i=0; i<5-count; i++) 
					System.out.print("��");
				
				System.out.println("\n��� 2 _");
				
				for(int i=0; i<5;i++)
					if(i<count)
						System.out.print("��");
					else
						System.out.print("��");
		
				System.out.println("\n��� 2 _");
				int k=0;
				for(k=0;k<count;k++)
					System.out.print("��");
//				System.out.print("k="+k); k=3, ���� for���� ���ᰡ �Ǵ� k��
				for(;k<5;k++)
					System.out.print("��");
	
	}
				
	}



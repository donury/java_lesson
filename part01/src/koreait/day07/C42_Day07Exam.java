package koreait.day07;

import java.util.Random;
import java.util.Scanner;

public class C42_Day07Exam {
	//�ڹ� ���ؿ� ������
	public static void main(String[] args) {

			Scanner sc =new Scanner(System.in);
			Random r=new Random();
			int [] first=new int [10];
			int [] second=new int [10];
			int [] third=new int[10];
			int Okcount=0;
			System.out.println("-----------------------------");
			System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
			System.out.println("-----------------------------");
			System.out.println("�����մϴ�.");
			for(int i=0;i<first.length;i++) {
				first[i]=r.nextInt(90)+10;
				second[i]=r.nextInt(90)+10;
				System.out.printf("����  %d %s %d %s %d %s " ,i+1, ".",first[i], "+" ,second[i], "=  �� �Է� ->" ,third[i]);
				third[i]=sc.nextInt();
				if(first[i]+second[i]==third[i]) {
					Okcount++;
				}
			}
			System.out.println("------------------------------------------");
			System.out.println("ä�� �մϴ�. ���� ���� "+Okcount+"("+Okcount*10+")"+"��");
			System.out.println(":::::Ʋ�� ���� ���� ����:::::");
			for(int i=0;i<first.length;i++) {
				if(first[i]+second[i]!=third[i]) {
					System.out.printf("���� %d %s %d %s %d %s %d \n",i,".",first[i],"+",second[i],"=  �� �Է� ->",third[i] );
				
			
	}
}

}
}
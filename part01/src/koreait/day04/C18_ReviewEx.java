package koreait.day04;

import java.util.Scanner;

public class C18_ReviewEx {

	public static void main(String[] args) {
		//���ؿ�
		String best;	//Ư�����
		int korean,math,english;
		Scanner sc = new Scanner(System.in);
		System.out.println("[[���� ���� : ��հ� ���� ���ϱ�]]");
		System.out.println("���� �Է��ϼ���."); 
		System.out.print("���� -> " );
		korean=sc.nextInt();
		System.out.print("���� -> " );
		english =sc.nextInt();
		System.out.print("���� -> " );
		math = sc.nextInt();
		
		int total = korean + math + english;
		int average = total/3; 
		double average1 = (double)total/3;
		System.out.println("ó���Ǿ����ϴ�. ");
		System.out.printf("���� : %d \n",total);
		System.out.printf("��� : %d (%.2f)" ,average,average1 );
		System.out.println("����� : "+ 3);
		int max;
		if(korean>english) { 
			max =  korean;
			best ="����";
		}
		else {
			max =	english;
			best ="����";
		}
		if(max<math) {
			max = math;
			best ="����";
			
			}
		System.out.println("Ư�������  : "+best +"�Դϴ�");
}

}
package koreait.ext;

import java.util.Scanner;

public class BinaryTest2 {

	public static void main(String[] args) {

		
			int n10=123;
			int n16 =0xa41c;
			int n2=0b1010010000011100;		//2���� ǥ�� 
	
			System.out.println("1.������ �״�� ���");
			System.out.println("10���� ���ͷ� 123 :"+ n10);
			System.out.println("16���� ���ͷ� 0xa41c :"+n16);
			System.out.println("2���� ���ͷ� n2=0b1010010000011100"+n2);

			
			System.out.println("2.format �����Ͽ� 16�������");
			System.out.println(String.format("16���� ���ͷ� 0xa41c: %x", n16));
			System.out.println(String.format("2���� ���ͷ�  %x", n2));
			System.out.println(String.format("10���� ���ͷ� 42012 : %x", 42012));

			System.out.println("3. -1�� 2���� , 16���� ǥ�� Ȯ��");
			n16=0xfffffff;
			System.out.println("16���� oxffffff: "+ n16);
			System.out.printf("%x\n",-1);
			System.out.println("2����:"+ Integer.toBinaryString(5));
			
			
			System.out.println("3.�Է��� 2���� �Ǵ� 16�������� 10������ �ٲپ� �帳�ϴ�.");
			Scanner sc=new Scanner(System.in);
			System.out.println("2���� �� �Է� >>>>");
			String t2=sc.nextLine();
			System.out.println("16���� �� �Է�>>>>>");
			String t16 =sc.nextLine();
			
			System.out.println(String.format("2���� %s �� 10���� %d �Դϴ�", t2,Integer.parseInt(t2,2)));

			System.out.println(String.format("16���� %s �� 10���� %d �Դϴ�", t16,Integer.parseInt(t16,16)));
			
	}

}

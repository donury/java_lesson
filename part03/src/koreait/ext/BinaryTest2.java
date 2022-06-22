package koreait.ext;

import java.util.Scanner;

public class BinaryTest2 {

	public static void main(String[] args) {

		
			int n10=123;
			int n16 =0xa41c;
			int n2=0b1010010000011100;		//2진수 표기 
	
			System.out.println("1.변수를 그대로 출력");
			System.out.println("10진수 리터럴 123 :"+ n10);
			System.out.println("16진수 리터럴 0xa41c :"+n16);
			System.out.println("2진수 리터럴 n2=0b1010010000011100"+n2);

			
			System.out.println("2.format 지정하여 16진수출력");
			System.out.println(String.format("16진수 리터럴 0xa41c: %x", n16));
			System.out.println(String.format("2진수 리터럴  %x", n2));
			System.out.println(String.format("10진수 리터럴 42012 : %x", 42012));

			System.out.println("3. -1의 2진수 , 16진수 표현 확인");
			n16=0xfffffff;
			System.out.println("16진수 oxffffff: "+ n16);
			System.out.printf("%x\n",-1);
			System.out.println("2진수:"+ Integer.toBinaryString(5));
			
			
			System.out.println("3.입력한 2진수 또는 16진수값을 10진수로 바꾸어 드립니다.");
			Scanner sc=new Scanner(System.in);
			System.out.println("2진수 값 입력 >>>>");
			String t2=sc.nextLine();
			System.out.println("16진수 값 입력>>>>>");
			String t16 =sc.nextLine();
			
			System.out.println(String.format("2진수 %s 는 10진수 %d 입니다", t2,Integer.parseInt(t2,2)));

			System.out.println(String.format("16진수 %s 는 10진수 %d 입니다", t16,Integer.parseInt(t16,16)));
			
	}

}

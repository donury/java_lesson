package koreait.day04;

import java.util.Scanner;

public class C18_ReviewEx {

	public static void main(String[] args) {
		//이준엽
		String best;	//특기과목
		int korean,math,english;
		Scanner sc = new Scanner(System.in);
		System.out.println("[[성적 집계 : 평균과 총점 구하기]]");
		System.out.println("성적 입력하세요."); 
		System.out.print("국어 -> " );
		korean=sc.nextInt();
		System.out.print("영어 -> " );
		english =sc.nextInt();
		System.out.print("수학 -> " );
		math = sc.nextInt();
		
		int total = korean + math + english;
		int average = total/3; 
		double average1 = (double)total/3;
		System.out.println("처리되었습니다. ");
		System.out.printf("총점 : %d \n",total);
		System.out.printf("평균 : %d (%.2f)" ,average,average1 );
		System.out.println("과목수 : "+ 3);
		int max;
		if(korean>english) { 
			max =  korean;
			best ="국어";
		}
		else {
			max =	english;
			best ="영어";
		}
		if(max<math) {
			max = math;
			best ="수학";
			
			}
		System.out.println("특기과목은  : "+best +"입니다");
}

}
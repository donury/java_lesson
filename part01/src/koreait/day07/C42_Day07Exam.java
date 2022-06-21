package koreait.day07;

import java.util.Random;
import java.util.Scanner;

public class C42_Day07Exam {
	//자바 이준엽 수정본
	public static void main(String[] args) {

			Scanner sc =new Scanner(System.in);
			Random r=new Random();
			int [] first=new int [10];
			int [] second=new int [10];
			int [] third=new int[10];
			int Okcount=0;
			System.out.println("-----------------------------");
			System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
			System.out.println("-----------------------------");
			System.out.println("시작합니다.");
			for(int i=0;i<first.length;i++) {
				first[i]=r.nextInt(90)+10;
				second[i]=r.nextInt(90)+10;
				System.out.printf("문제  %d %s %d %s %d %s " ,i+1, ".",first[i], "+" ,second[i], "=  답 입력 ->" ,third[i]);
				third[i]=sc.nextInt();
				if(first[i]+second[i]==third[i]) {
					Okcount++;
				}
			}
			System.out.println("------------------------------------------");
			System.out.println("채점 합니다. 맞은 갯수 "+Okcount+"("+Okcount*10+")"+"점");
			System.out.println(":::::틀린 문제 정답 보기:::::");
			for(int i=0;i<first.length;i++) {
				if(first[i]+second[i]!=third[i]) {
					System.out.printf("문제 %d %s %d %s %d %s %d \n",i,".",first[i],"+",second[i],"=  답 입력 ->",third[i] );
				
			
	}
}

}
}
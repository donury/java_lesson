package koreait.day03;

import java.util.Scanner;

public class C13_MaxMinEx {
	//이준엽
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);	
		int n1,n2,n3;
		int max;
		int min;
		System.out.println("3개의 정수 입력값 중에서 가장 큰 값을 출력합니다. 비교와 결정");
		System.out.print("n1 :  " );
		n1=sc.nextInt();
		System.out.print("n2 :  " );
		n2=sc.nextInt();
		System.out.print("n3 :  " );
		n3=sc.nextInt();
		System.out.printf(" n1=%d\n n2=%d\n n3=%d\n",n1 ,n2 ,n3);
		if(n1>n2) { 
			max = 	n1;
			min = 	n2;
		}
		else {
			max =	n2;
			min	=	n1;
		}
		if(max<n3) max = n3;
		
			if(min>n3) min = n3;
						
			System.out.printf(" max :%d\n min :%d\n",max,min);
			}	
}

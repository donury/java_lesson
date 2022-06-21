package If;

import java.util.Scanner;

public class C13_MaxMinExam {

	public static void main(String[] args) {
		//입력받은 5수 중에 가장 큰값, 가장 작은값 구하기	
		Scanner sc= new Scanner(System.in);
		int n1,n2,n3,n4,n5,max,min;
		System.out.println("숫자를 입력하세요: ");
		n1=sc.nextInt();
		System.out.println("첫번재 숫자 : "+n1);
		n2=sc.nextInt();
		System.out.println("두번째 숫자 : " +n2);
		n3 =sc.nextInt();
		System.out.println("세번째 숫자 : " +n3);
		n4=sc.nextInt( );
		System.out.println("네번째 숫자 : "+n4);
		n5=sc.nextInt();
		System.out.println("다섯번쨰 숫자 : "+n5);
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
		
		System.out.println("가장 큰 숫자는 : "+max+"입니다");
		System.out.println("가장 작은 숫자는 : "+min+"입니다");
			
		}
	}



package koreait.day05;

import java.util.Scanner;

public class C23_Startprint {

	public static void main(String[] args) {
		System.out.println("[[영화감상 후기]]");
		System.out.print("평점을 몇 점 주시겠습니다 ? (1~5) >>> ");
		Scanner sc =new Scanner(System.in);
		int count=sc.nextInt();
			System.out.println("방법1)");
			for(int i=0; i<count; i++) 
				System.out.print("★");
			
				System.out.println("\n방법2)");
				for(int i=0; i<count; i++) 
				System.out.print("★");
				for(int i=0; i<5-count; i++) 
					System.out.print("☆");
				
				System.out.println("\n방법 2 _");
				
				for(int i=0; i<5;i++)
					if(i<count)
						System.out.print("★");
					else
						System.out.print("☆");
		
				System.out.println("\n방법 2 _");
				int k=0;
				for(k=0;k<count;k++)
					System.out.print("★");
//				System.out.print("k="+k); k=3, 위의 for문이 종료가 되는 k값
				for(;k<5;k++)
					System.out.print("☆");
	
	}
				
	}



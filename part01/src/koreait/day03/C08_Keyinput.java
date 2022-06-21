package koreait.day03;

import java.util.Scanner;

public class C08_Keyinput {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);	
		int width;
		int height;
//		int box_area= width*height;
		double hlaf,round,circle_area;
		final double pi=3.14;
		System.out.print("사각형 도형의 넓이 구하기\n");
		System.out.print("사각형 가로 입력 : " );
		width=sc.nextInt();
		System.out.print("사각형 세로 입력 : ");
		height=sc.nextInt();
		int area = width * height;
		System.out.print("사각형의 넓이는 : "+area+"㎤" );
//		int width = 23 , height = 19 , box_area = width * height;
//		System.out.printf("%s\n %s %d %s \n %s %d %s \n %s %d %s \n",
//							"[사각형 도형의 넓이 구하기]",
//							"가로: ",23,"cm",
//							"세로 : ",19,"cm",
//							"넓이를 구했습니다. -> ", box_area,"㎤");	
			System.out.println();
		//원 넓이, 둘레
		System.out.print("원 도형의 넓이와 둘레 구하기\n");
		System.out.print("반지름 : ");
			double half =sc.nextDouble();
			round= 2*3.14*half;
			circle_area=3.14*half*half;
//			System.out.println("반지름 : "+half );
			System.out.println("둘레를 구했습니다: "+round+"㎤");
			System.out.println("넓이를 구했습니다 : "+circle_area+"㎤");
//			double half=23.230 , round= 2*3.14*half, circle_area=3.14*half*half;
//		System.out.printf("%s \n %s %.3f %s \n%s %.3f %s \n %s %.3f %s",
//							"[원 도형의 넓이와 둘레 구하기]",
//							"반지름 : ", half,"cm",
//							"둘레를 구했습니다.-> ",circle_area, "㎤",
//							"넓이를 구했습니다. -> ",round,"㎤");
//		System.out.println();
//		//final 테스트 :
//		//	변수선언 앞에 final(최종의) 키워드를 붙이면 값을 변경하지 못한다.
//		
//		final int test =123;
//		System.out.println(test);
	}
	
	
}

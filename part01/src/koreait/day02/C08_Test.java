package koreait.day02;

public class C08_Test {

	public static void main(String[] args) {
		//이준엽
		//사각형 넓이구하기
		int width = 23 , height = 19 , box_area = width * height;
		System.out.printf("%s\n %s %d %s \n %s %d %s \n %s %d %s \n",
							"[사각형 도형의 넓이 구하기]",
							"가로: ",23,"cm",
							"세로 : ",19,"cm",
							"넓이를 구했습니다. -> ", box_area,"㎤");	

			System.out.println();
		//원 넓이, 둘레
		double half=23.230 , round= 2*3.14*half, circle_area=3.14*half*half;
		System.out.printf("%s \n %s %.3f %s \n%s %.3f %s \n %s %.3f %s",
							"[원 도형의 넓이와 둘레 구하기]",
							"반지름 : ", half,"cm",
							"둘레를 구했습니다.-> ",circle_area, "㎤",
							"넓이를 구했습니다. -> ",round,"㎤");
		System.out.println();
		//final 테스트 :
		//	변수선언 앞에 final(최종의) 키워드를 붙이면 값을 변경하지 못한다.
		
		final int test =123;
		System.out.println(test);
	}
	
	
}

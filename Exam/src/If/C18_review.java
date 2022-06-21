package If;

import java.util.Scanner;

public class C18_review {

	public static void main(String[] args) {
		int kor,eng,math,si,hi;
		Scanner sc =new Scanner(System.in);
		System.out.println("[[성적 집계 : 평균과 총점 구하기]]");
		System.out.printf("국어점수 :  ");
		kor=sc.nextInt();
	System.out.printf("\n영어 점수 : ");
	eng=sc.nextInt();
	System.out.printf("\n수학 점수 : ");
	math=sc.nextInt();
	System.out.printf("\n사회점수 : ");
	si=sc.nextInt();
	System.out.printf("\n과학점수 : ");
	hi=sc.nextInt();
	
	int total =kor+eng+math+si+hi;
	int aver=(kor+eng+math+si+hi)/5;
	
	System.out.printf("총점은 : %d%s%s%d%s",total,"점\n","평균은: ",aver,"점\n");
	}

}

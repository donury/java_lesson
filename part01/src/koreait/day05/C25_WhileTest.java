package koreait.day05;

import java.util.Scanner;

public class C25_WhileTest {

	public static void main(String[] args) {
		//비교
//		for(int i=0 ; i<5 ;i++) {
//			System.out.printf("hello!(%d)\n",i+1);
//		}//while문 형식
//			//loop counter 변수 선언&초기값
//			int j=0;
//			while(j<5) {
//				System.out.printf("hello!(%d)\n",j+1);
//				j++;
//			}
//			//예시 : for문은 1부터 100까지 더하는 연속적인 값을 대상으로 할때 적합
			//while문은 아직 정해지지 않은 값들을 대상으로 할때 적합
			//반복문과 함께 사용하는 명령문 - break,continue(뒤에 명령들 실행하지 않고 반복처음으로 돌아감
			int k=0,sum=0;
			Scanner sc =new Scanner(System.in);
//			
//			System.out.println("입력한 정수를 모두 더하는 계산기 입니다 . (종료: -1)");
//			while(k!=-1) {	//k가 -1이 아닌 동안 반복실행
//				System.out.print("정수입력 >>>");
//				k=sc.nextInt();
//				if(k!=-1)
//				sum+=k; //sum=sum+k;
//				
//			}
			System.out.println("sum = "+ sum);
			sum=0;
			k=0;
			System.out.println("\n\n입력한 정수를 모두 더하는 계산기 입니다. [ver2.1](종료 :-1)");
			do {
				sum+=k;
				System.out.print("정수입력 >>>");
				k=sc.nextInt();
			} while (k !=-1) ;
			System.out.println("sum= "+sum);
			
			
			sum=0;
			System.out.println("\n\n입력한 정수를 모두 더하는 계산기 입니다. [ver2.2](종료 :-1)");
			while(true) {
				System.out.print("정수입력 >>>");
				k=sc.nextInt();
				
				if(k==-1) break;	//항상 참일때 ,탈출(종료) 조건과 break문 사용합니다.
				sum+=k;
			}
			System.out.println("sum = "+sum);
			
			
			sum=0;
			System.out.println("\n\n입력한 정수를 모두 더하는 계산기 입니다. [ver2.3](종료 :-1)");
			boolean isState =true;
			while(isState) {
				System.out.print("정수입력 >>>");
				k=sc.nextInt();
				
				if(k==-1) isState=false;
				else sum+=k;
			}
			System.out.println("sum= "+sum);
			
			
			//continue 연습 : 입력된 값이 10의 배수이면 sum에 더하지 않는다.
			System.out.println("\n\n입력한 정수를 모두 더하는 계산기 입니다. [ver 연습](종료 :-1)");
			sum=0;
			while(true) {
				System.out.println("정수 입력 >>>");
				k=sc.nextInt();
				if(k==-1) break;
				if(k%10==0)continue; //아래명령어 실행하지 않고 다시 처음으로
				sum+=k;
			}
			System.out.println("sum ="+sum);
			
			
			sc.close();
			
	}
}
			
		
		
	

package koreait.day06;

import java.util.Arrays;
import java.util.Scanner;
//100 개의 정수를 저장할 수 있는 배열을 선언하고 정수를 차례로 입력받다가 0 이 입력되면 0 을 제외하고 
//그 때까지 입력된 정수를 가장 나중에 입력된 정수부터 차례대로 출력하는 프로그램을 작성하시오.
//10개의 문자를 입력받아서 첫 번째 네 번째 일곱 번째 입력받은 문자를 차례로 출력하는 프로그램을 작성하시오.
public class C33_Realtest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int [] a= new int[10];
		int b;
		for(int i=0;i<a.length;i++)
		a[i]=sc.nextInt();
		
		
			System.out.printf("%s %s %s ", a[0],a[3],a[6]);
			
			
		}
	}

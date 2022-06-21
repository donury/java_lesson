package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C33_RealLotto {
	//작성자 : 이준엽 
	public static void main(String[] args) {
		int []numbers =new int[45];	
		Random r =new Random();
		int [] lotto =new int[6];	//6개의 값
		
		for(int i=0;i<45;i++) {		//인덱스 범위 : 0~44
			numbers[i]=i+1;			//{1,2,3,4...45}
		}
		System.out.println("numbers 배열 초기값 ==================================");
		System.out.println(Arrays.toString(numbers)); //배열 안의 값 모든 정수 나열
		System.out.println("==================================================");
		
		int k;	//뽑힐 값의 인덱스 - 난수로 정합니다.
		for(int cnt=0;cnt<6;cnt++) {	//로또 번호 6개 구할 for문
			k=r.nextInt(45-cnt);   //cnt = 0,1,2,3,4,5에 대한 난수의 bound 값은 45,44,43,42,41,40 ->중복방지 (확률적인 범위를 줄이기)
					//k의 난수범위 , 0~44 , 0~43 ,0~42,0~41,0~40,0,39
			System.out.println("k="+k+",number = "+numbers[k]); //k = 0 <6 까지 랜덤한 숫자 6개 출력 /
			
			lotto[cnt]=numbers[k];		//numbers 배열에서 난수로 뽑힌 인덱스 k의 값			
			
			//k위치의 값을 제거(삭제) : 인덱스 k+1~부터 마지막 요소까지 왼쪽으로 이동
			for(int i=k; i<numbers.length-1;i++) { 	// 중복방지
				numbers[i]=numbers[i+1];		//
			}
			System.out.println(Arrays.toString(numbers)); //삭제된 데이터 제외 , 현재 있는 배열 안의 값
		}
		System.out.print("최종 선택 숫자 : ");
		System.out.println(Arrays.toString(lotto));	//추첨된 숫자 프린트
		
		Arrays.sort(lotto);	//lotto 배열값의 크기 순서대로 위치를 변경합니다
		System.out.println(Arrays.toString(lotto)); //lotto 값 배열 출력 
	}

}

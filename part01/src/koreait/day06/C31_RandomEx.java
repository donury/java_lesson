package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C31_RandomEx {

	public static void main(String[] args) {
/*학생 성적(국어) 분표 보고서를 만듭니다
 * 학생 인원수 100명 -점수는 랜덤값으로 테스트 ( 0<=난수 <=100)
 * 
 * 90~100 : o 명(소수점 1자리%)	카운트 변수 5개 필요합니다.
 * 80~89 : o 명(소수점 1자리%)		ㄴ counts[5] : count[0],count[2],count[3],count[4],count[5]
 * 70~79 : o 명(소수점 1자리%)
 * 60~69 : o 명(소수점 1자리%)
 * 60점 미만 : o 명(소수점 1자리%)
 */
		int [] koreans= new int[100];
		int []	counts =new int[5];
		Random r =new Random();
		
		for(int i=0;i<koreans.length;i++) {
			koreans[i]=r.nextInt(101);
			}//국어점수 저장
			
//		 System.out.println(Arrays.toString(koreans));
		 for(int i=0;i<koreans.length;i++) {
			 if(koreans[i]>=90) 
					counts[0]++;
				else if(koreans[i]>=80) 
					counts[1]++;
				else if(koreans[i]>=70) 
					counts[2]++;
				else if(koreans[i]>=60) 
					counts[3]++;
				else counts[4]++;	
					 
		 }	
		 System.out.println();
		 //점수 분포 결과 출력하기
	   System.out.println("  90~100\t 80~89\t 70~79\t 60~69\t 60미만");
	System.out.printf("%8s %8s %8s %8s %8s\n","90~100","80~89","70~79","60~69","60미만");
	System.out.println("====================================================");
	
	for(int i=0;i<counts.length;i++)
		System.out.printf("%8d",counts[i]);
	
	System.out.println();
	for(int i=0;i<counts.length;i++)
		System.out.printf("%8.1f%%",(double)counts[i]/koreans.length*100);
	}
	}			
//배열에서 기능이 향상 된것(데이터 삭제/삽인,크기도 동적으로 변경) ArrayList
//배열에서는 직접 데이터추가/삭제를 구현합니다 ->메소드 정의
		
		
		

	



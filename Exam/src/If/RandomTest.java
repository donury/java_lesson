package If;

import java.util.Arrays;
import java.util.Random;

public class RandomTest {

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
		
		Random random=new Random();
		int [] sum =new int [100];
		int []	counts=new int[5];
		for(int i=0;i<sum.length;i++) { 
			sum[i]=random.nextInt(101);		
			if(90<=sum[i]) 
				counts[0]++;
			else if
				(sum[i]>=80)
				counts[1]++;
			else if
				(sum[i]>=70)
				counts[2]++;
			else if
				(sum[i]>=60)
				counts[3]++;
				else
					counts[4]++;
		}
		
			
				
			System.out.printf("90~100점 :%d %s %.0f%%\n",counts[0],"명",(double)counts[0]*100/100);
			System.out.printf("80~89점 : %d %s %.0f%%\n",counts[1],"명",(double)counts[1]*100/100);
			System.out.printf("70~79점 : %d %s %.0f%%\n",counts[2],"명",(double)counts[2]*100/100);
			System.out.printf("60~69점 : %d %s %.0f%%\n",counts[3],"명",(double)counts[3]*100/100);
			System.out.printf("60점미만 : %d %s %.0f%%\n",counts[4],"명",(double)counts[4]*100/100);
		
			
			
			
			
			}
		
		
	}


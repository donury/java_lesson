package If;

import java.util.Arrays;
import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		/*�л� ����(����) ��ǥ ������ ����ϴ�
		 * �л� �ο��� 100�� -������ ���������� �׽�Ʈ ( 0<=���� <=100)
		 * 
		 * 90~100 : o ��(�Ҽ��� 1�ڸ�%)	ī��Ʈ ���� 5�� �ʿ��մϴ�.
		 * 80~89 : o ��(�Ҽ��� 1�ڸ�%)		�� counts[5] : count[0],count[2],count[3],count[4],count[5]
		 * 70~79 : o ��(�Ҽ��� 1�ڸ�%)
		 * 60~69 : o ��(�Ҽ��� 1�ڸ�%)
		 * 60�� �̸� : o ��(�Ҽ��� 1�ڸ�%)
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
		
			
				
			System.out.printf("90~100�� :%d %s %.0f%%\n",counts[0],"��",(double)counts[0]*100/100);
			System.out.printf("80~89�� : %d %s %.0f%%\n",counts[1],"��",(double)counts[1]*100/100);
			System.out.printf("70~79�� : %d %s %.0f%%\n",counts[2],"��",(double)counts[2]*100/100);
			System.out.printf("60~69�� : %d %s %.0f%%\n",counts[3],"��",(double)counts[3]*100/100);
			System.out.printf("60���̸� : %d %s %.0f%%\n",counts[4],"��",(double)counts[4]*100/100);
		
			
			
			
			
			}
		
		
	}


package If;

import java.util.Arrays;
import java.util.Scanner;

public class C0605Test {
	//배열문제1 4번 못풀었습니다.
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
/*10개의 정수를 입력받아 100 미만의 수 중 가장 큰 수와 100 이상의 수 중 가장 작은 수를 출력하는 프로그램을 작성하시오.

(입력되는 정수의 범위는 1이상 10,000 미만이다. 만약 해당하는 수가 없을 때에는 100 을 출력한다.)
 * 100 미만의 수로 입력 가능한 범위는 1~99, 100 이상의 수로 입력 가능한 범위는 100~9999 이다. 
입력값보다 큰수(작은수)를 초기값으로 정하고 작업이 끝난 후 초기값이 그대로 있다면 해당하는 수가 없는 것이다.
 * 
 */
		int []sum = new int[10];
		int min=0;
		int max=0;
		for(int i=0;i<sum.length;i++) {
			sum[i]=sc.nextInt();
			if(sum[i]>0 && sum[i]<100) {
				min=sum[i];
			}
			else if(sum[i]>=100 && sum[i]<9999) {
				max=sum[i];
			}
				
			}
			
		}
		System.out.println(Arrays.toString(sum));
		System.out.printf("%d \n%d",(min),(max));
}
}
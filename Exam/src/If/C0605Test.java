package If;

import java.util.Arrays;
import java.util.Scanner;

public class C0605Test {
	//�迭����1 4�� ��Ǯ�����ϴ�.
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
/*10���� ������ �Է¹޾� 100 �̸��� �� �� ���� ū ���� 100 �̻��� �� �� ���� ���� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

(�ԷµǴ� ������ ������ 1�̻� 10,000 �̸��̴�. ���� �ش��ϴ� ���� ���� ������ 100 �� ����Ѵ�.)
 * 100 �̸��� ���� �Է� ������ ������ 1~99, 100 �̻��� ���� �Է� ������ ������ 100~9999 �̴�. 
�Է°����� ū��(������)�� �ʱⰪ���� ���ϰ� �۾��� ���� �� �ʱⰪ�� �״�� �ִٸ� �ش��ϴ� ���� ���� ���̴�.
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
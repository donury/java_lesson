package koreait.day05;

import java.util.Scanner;

public class C25_WhileTest {

	public static void main(String[] args) {
		//��
//		for(int i=0 ; i<5 ;i++) {
//			System.out.printf("hello!(%d)\n",i+1);
//		}//while�� ����
//			//loop counter ���� ����&�ʱⰪ
//			int j=0;
//			while(j<5) {
//				System.out.printf("hello!(%d)\n",j+1);
//				j++;
//			}
//			//���� : for���� 1���� 100���� ���ϴ� �������� ���� ������� �Ҷ� ����
			//while���� ���� �������� ���� ������ ������� �Ҷ� ����
			//�ݺ����� �Բ� ����ϴ� ��ɹ� - break,continue(�ڿ� ��ɵ� �������� �ʰ� �ݺ�ó������ ���ư�
			int k=0,sum=0;
			Scanner sc =new Scanner(System.in);
//			
//			System.out.println("�Է��� ������ ��� ���ϴ� ���� �Դϴ� . (����: -1)");
//			while(k!=-1) {	//k�� -1�� �ƴ� ���� �ݺ�����
//				System.out.print("�����Է� >>>");
//				k=sc.nextInt();
//				if(k!=-1)
//				sum+=k; //sum=sum+k;
//				
//			}
			System.out.println("sum = "+ sum);
			sum=0;
			k=0;
			System.out.println("\n\n�Է��� ������ ��� ���ϴ� ���� �Դϴ�. [ver2.1](���� :-1)");
			do {
				sum+=k;
				System.out.print("�����Է� >>>");
				k=sc.nextInt();
			} while (k !=-1) ;
			System.out.println("sum= "+sum);
			
			
			sum=0;
			System.out.println("\n\n�Է��� ������ ��� ���ϴ� ���� �Դϴ�. [ver2.2](���� :-1)");
			while(true) {
				System.out.print("�����Է� >>>");
				k=sc.nextInt();
				
				if(k==-1) break;	//�׻� ���϶� ,Ż��(����) ���ǰ� break�� ����մϴ�.
				sum+=k;
			}
			System.out.println("sum = "+sum);
			
			
			sum=0;
			System.out.println("\n\n�Է��� ������ ��� ���ϴ� ���� �Դϴ�. [ver2.3](���� :-1)");
			boolean isState =true;
			while(isState) {
				System.out.print("�����Է� >>>");
				k=sc.nextInt();
				
				if(k==-1) isState=false;
				else sum+=k;
			}
			System.out.println("sum= "+sum);
			
			
			//continue ���� : �Էµ� ���� 10�� ����̸� sum�� ������ �ʴ´�.
			System.out.println("\n\n�Է��� ������ ��� ���ϴ� ���� �Դϴ�. [ver ����](���� :-1)");
			sum=0;
			while(true) {
				System.out.println("���� �Է� >>>");
				k=sc.nextInt();
				if(k==-1) break;
				if(k%10==0)continue; //�Ʒ���ɾ� �������� �ʰ� �ٽ� ó������
				sum+=k;
			}
			System.out.println("sum ="+sum);
			
			
			sc.close();
			
	}
}
			
		
		
	

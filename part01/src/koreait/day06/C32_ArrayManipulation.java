package koreait.day06;

import java.util.Arrays;

public class C32_ArrayManipulation {

	public static void main(String[] args) {
		//�迭����� ����/����
			int []  test = {11, 22,33,44,55,66,77};
			
		
			System.out.println(Arrays.toString(test));
			
			for(int i=test.length-2; i>=2;i--) 
				test[i+1]=test[i]; //i=7-2 =5>2 ;543
			test[2]=23;
			//�ε��� 2�� �����Ҷ�
			for(int i=0;i<test.length;i++)
				System.out.print(test[i]+"\t");
			System.out.println();
			int [] test2 = {11, 22,33,44,55,66,77};
			System.out.println("====================================================");
			//�ε��� 2�� �����Ҷ� - �������� �ε��� ���ҹ������� �̵�
			for(int i=3;i<test2.length;i++) {
				test2[i-1]=test2[i];
				}
			
				for(int i=0;i<test2.length-1;i++)
					System.out.print(test2[i]+"\t");
				
			
	}

}

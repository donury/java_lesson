package koreait.day05;

import java.util.Arrays;
import java.util.Scanner;

public class C_28IntArrayEx {
	//���ؿ�
	public static void main(String[] args) {
		/*1. int �迭ũ�� 5�� �����ϼ���. �̸��� nums
		 * 2.�迭 ����� ���� ����� �Է����� �����մϴ�.
		 * 3.�Էµ� ���� �հ�, ����� ���մϴ�
		 * 4.�Էµ� ���� �ִ밪,�ּҰ��� ���ϴ� �޼ҵ带 ����ϴ�.
		 * 		maxOfArray , minOfArray :���ڴ� int �迭, ��ȯ������ int
		 * 
		 */
		int  [] nums1 = {0,0,0,0,0};
		System.out.println(nums1);
		System.out.println(Arrays.toString(nums1));
		System.out.println(nums1[0]);
		System.out.println(nums1.length);
		
		int [] nums={0,0,0,0,0};
		int sum=0;
		int ave=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<nums.length;i++) {
			System.out.print("�迭�� ���� ? : ");
		nums[i]=sc.nextInt();		
		sum+=nums[i];
		ave=sum/nums.length;
		}
		
		System.out.println("�Էµ� ���� �հ�: "+sum);
		System.out.println("�Էµ� ���� ���: "+ave);
		int max = maxOfArrays(nums);
		System.out.println("�迭 nums �ִ밪 max ="+max);
		int min = minOfArrays(nums);
		System.out.println("�迭 nums �ִ밪 min ="+min);
	}
		
		
//max,min������ �迭�� 0�� ��Ұ����� �ʱ�ȭ �մϴ�.
//�迭��� 1������ ��������ұ��� max,min�� ������� ���ؼ� 
//max�� �װ����� ������ min�� �װ����� ũ��	max min ���� �迭��Ұ����� �����մϴ�
//->�񱳰� ������ ����max,min ������ �˴ϴ�.	
//		public static void maxofArray(int[]arrys) {
//				System.out.println();
//		
//}
		
		public static int maxOfArrays(int [] array) {
			int max=array[0];
		for(int i=0;i<array.length;i++) {
			if(max<array[i])
				max=array[i];
		}
			return max;
		}
		public static int minOfArrays(int [] array) {
			int min=array[0];
		for(int i=0;i<array.length;i++) {
			if(min>array[i])
				min=array[i];
		}
			return min;
}
}

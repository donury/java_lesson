package koreait.day05;

import java.util.Arrays;
import java.util.Scanner;

public class C_28IntArrayEx {
	//이준엽
	public static void main(String[] args) {
		/*1. int 배열크기 5를 선언하세요. 이름은 nums
		 * 2.배열 요소의 값은 사용자 입력으로 저장합니다.
		 * 3.입력된 값의 합계, 평균을 구합니다
		 * 4.입력된 값의 최대값,최소값을 구하는 메소드를 만듭니다.
		 * 		maxOfArray , minOfArray :인자는 int 배열, 반환값형식 int
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
			System.out.print("배열의 값은 ? : ");
		nums[i]=sc.nextInt();		
		sum+=nums[i];
		ave=sum/nums.length;
		}
		
		System.out.println("입력된 값의 합계: "+sum);
		System.out.println("입력된 값의 평균: "+ave);
		int max = maxOfArrays(nums);
		System.out.println("배열 nums 최대값 max ="+max);
		int min = minOfArrays(nums);
		System.out.println("배열 nums 최대값 min ="+min);
	}
		
		
//max,min변수를 배열의 0번 요소값으로 초기화 합니다.
//배열요소 1번부터 마지막요소까지 max,min과 순서대로 비교해서 
//max가 그값보다 작으면 min이 그값보다 크면	max min 값을 배열요소값으로 변경합니다
//->비교가 끝나면 최종max,min 결정이 됩니다.	
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

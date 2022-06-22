package koreait.ext;

public class BinaryTest {

	public static void main(String[] args) {
		System.out.println(String.format("%8s\t %8s\t %8s","10진수","2진수","16진수"));
		for(int i=0; i<100;i++) {
			System.out.println(String.format("%d\t%s\t%s" ,i,Integer.toBinaryString(i),
					 Integer.toHexString(i)));
			
		}
		
		
		
		/*
		 * 10진수 정수값을 다른 진법으로 문자열 변환
		 * Integer.tobinaryString(i)	->2진수로 변환
		 * Integer.toOctalString(i)		->8진수로 변환
		 * Integer.toHexString(i)		->16진수로 변환
		 * 
		 * 
		 */
	}

}

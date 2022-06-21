package koreait.day18;

public class BinaryTest {

	public static void main(String[] args) {
		System.out.println("10Áø¼ö \t2Áø¼ö\t16Áø¼ö");
		for(int i=0; i<100;i++) {
			System.out.println(String.format("%d\t%s\t%s" ,i,Integer.toBinaryString(i),
					 Integer.toHexString(i)));
		//10진수, 2진수,16진수
		}
		
	}

}

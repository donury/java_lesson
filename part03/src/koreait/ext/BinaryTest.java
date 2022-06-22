package koreait.ext;

public class BinaryTest {

	public static void main(String[] args) {
		System.out.println(String.format("%8s\t %8s\t %8s","10����","2����","16����"));
		for(int i=0; i<100;i++) {
			System.out.println(String.format("%d\t%s\t%s" ,i,Integer.toBinaryString(i),
					 Integer.toHexString(i)));
			
		}
		
		
		
		/*
		 * 10���� �������� �ٸ� �������� ���ڿ� ��ȯ
		 * Integer.tobinaryString(i)	->2������ ��ȯ
		 * Integer.toOctalString(i)		->8������ ��ȯ
		 * Integer.toHexString(i)		->16������ ��ȯ
		 * 
		 * 
		 */
	}

}

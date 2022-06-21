package koreait.day16;

import java.util.Scanner;

public class C69_MyExceptionTest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("���̸� �Է� >>>");
		try {
		int age =Integer.parseInt(sc.nextLine());
		if(age <0 || age >100) throw new Exception("������ ������ 0~100�Դϴ�,");
		//Throw �� ������ Exception�� �߻���ŵ�ϴ�.
		if(age ==0)throw new NullPointerException();
		System.out.println("����� ���̴� "+ age +" �� �½��ϱ�?");
		}catch (NumberFormatException e) {
		System.out.println("���� �Է��� ���ڷθ� �ϼ���!");
	}catch(Exception e) {
		System.out.println("����� ���� ���� :"+e.getMessage());
	}
}
}
//����� Exception�� ���� �� �ִ�. :Exception ���
class AgeException extends Exception{

	private static final long serialVersionUID = 1L;
		//Serialzable �������̽��� ���õ� ��

		public AgeException (String messge) {
			super(messge);		//Exception�� message �ʵ带 ����
		}
	
}
package If;

import java.util.Scanner;

public class If_else01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Է��� �޾� ��� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		int age= sc.nextInt();
		if(age>65) {
			System.out.println("���̴� "+ age + "���Դϴ�"+"\n 65���̻� ����� 1000���Դϴ�");
		}
		else if(age>19) {
			System.out.println("���̴� "+ age + "���Դϴ�"+"\n ���ο����1400���Դϴ�");
		}
		else if(13<age) {
			System.out.println("���̴� "+ age + "���Դϴ�"+"\n �߰���л������ 700���Դϴ�");
		
		}
		else if(7<age) {
			System.out.println("���̴� "+ age + "���Դϴ�"+"\n �ʵ��л������ 500���Դϴ�");
		}
		else{
			System.out.println("���̴�"+ age + "���Դϴ�"+"\n �����оƵ��� �����Դϴ�");
		}
		System.out.println("����� Ȯ���Ͻð� Ÿ�ʽÿ�");
	}
		

}

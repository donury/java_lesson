package koreait.day03;

import java.util.Scanner;

public class C10_Keyinput {

	public static void main(String[] args) {
		//Ű���� �Է��� ���� ���� ����. �⺻�� ������ �ƴ� Ŭ���� Ÿ���� �����Դϴ� -> ������ ����.
	//		��new�������� ����� ��ü�� Ŭ����= �̸��� ���� �̸����� ���� �����մϴ�.
		Scanner sc = new Scanner(System.in);	
	
	//Ű���� �Է��� ���� ���� ���� - ǥ���Է����� scanner ��ü�� ����� ���� sc�� �����մϴ�.
	
		System.out.print("������ �Է��ϼ���. -> "); //�Է¾ȳ� �޼���
		int date = sc.nextInt();		
	
		System.out.println("�Է¹��� ���� "+date + "�Դϴ�");
	
	
		System.out.println("�Ǽ��� �Է��ϼ��� -> ");
		double point=sc.nextDouble();
		
		System.out.println("�Էµ� ���� " + point + "�Դϴ�");
	
	}

}
/*
 * 	ǥ�� ��� : System.out(out �� System Ŭ������ ������ �ʵ��̰� �޼ҵ� println()�� �����ϴ�.)
 *  ǥ�� �Է� : System.in     -> in�� System Ŭ������ ������ �ʵ�
 *  						-> Scanner Ŭ������ �̿��ؼ� �Է°��� Ư�� �⺻�������� ��ȯ���Ѵ� ��� ���.
 * 						   -> �⺻ ��Ű���� Ŭ������  �ƴϹǷ� import �� �ʿ��մϴ�.	
 * 
 */

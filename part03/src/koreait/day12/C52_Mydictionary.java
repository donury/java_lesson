package koreait.day12;

import java.util.Scanner;
import java.util.TreeMap;

public class C52_Mydictionary {

	public static void main(String[] args) {
		TreeMap<String,String> word=new TreeMap<String,String>();	//���� �˻��� ������ map�� ���� :���ĺ� ������� ����
		System.out.println("���ñ�� -> 1. �ܾ�����  2.�ܾ�˻� 3.�ܾ��庸�� 4.���α׷� ������");
		Scanner sc= new Scanner(System.in);
//		HashMap<String ,String> word =new HashMap<>();
		//Key: ����ܾ�, value: �ѱ� ��
		String sel,eng,kor;
		boolean run =true;
		while(run) {
			System.out.print("����-> :");
			sel=sc.nextLine();
		switch(sel) {
		
		case "1" : 
			System.out.print("English ->" );
			eng=sc.nextLine();
			System.out.print("�ѱ۶� -> ");
			kor=sc.nextLine();
			word.put(eng, kor);	//����
			break;
		
		case "2": 
			System.out.print("�˻� �ܾ� English ->");
			eng= sc.nextLine();	
			System.out.println("�ܾ��� �˻��߽��ϴ�." + word.get(eng));
			break;
		
		case "3": 
			System.out.print("�ܾ��� ��ü���� :"+word);
			break;
		
		case "4": 
			run=false;
			System.out.println("���α׷��� �����մϴ�.");
			break;
			
			default:
			System.out.println("�߸� �Էµ� �����Դϴ�. 1~4 �Է��Դϴ�.");
			break;
		}//switch�� ��
		
	}	//while�� ��

		
}	//���� : ���� ������ �Է��� �޾ƾ� �Ѵٸ� ���ڿ� nextLine() �޾Ƽ� ������ ��ȯ�մϴ�.
	//int Score = Integer.parseInt(sc.nextLine);
	//���� : nextInt()�� ���͸� ó������ �ʾƼ� ������ ������ nextLine()���� ���޵Ǿ� �Է� �帧�� ���ص˴ϴ�.
	//���:�� �ҽ� ���Ͽ��� nextint()�� ��� �Ǵ� nextLine()�� ����մϴ�
}

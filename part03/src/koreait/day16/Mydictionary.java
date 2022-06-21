package koreait.day16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Mydictionary {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		List<Word>mywords =new ArrayList<>();	

		String sel,eng,kor;
		int level;
		System.out.println("���ñ�� -> 1. �ܾ�����  2.�ܾ�˻� 3.�ܾ��庸�� 4.���α׷� ������ ");
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
			System.out.println("���� -> ");
			level =Integer.parseInt(sc.nextLine());
			Word temp=(new Word(eng,kor));
			temp.setLevel(level);
			mywords.add(temp);
			
			break;
		
		case "2": 
			System.out.print("�˻� �ܾ� English ->");
			eng= sc.nextLine();	
			for(Word w : mywords)
				if(w.getEnglish().equals(eng))
			System.out.println("�ܾ��� �˻��߽��ϴ�." + w);
			break;
		
		case "3": 
			all(mywords);	//�����ϰ� ���
			break;
		
		case "4": 
			run=false;
			System.out.println("�˻��� ���� �Է� (1~3) -> ");
			int no =Integer.parseInt(sc.nextLine());
			level(mywords,no);
			break;
			
			default:
			System.out.println("�߸� �Էµ� �����Դϴ�. 1~4 �Է��Դϴ�.");
			break;
		}//switch�� ��
		
	}	//while�� ��
		System.out.println("::::�ܾ��� ���� :::::");
		
}	//���� : ���� ������ �Է��� �޾ƾ� �Ѵٸ� ���ڿ� nextLine() �޾Ƽ� ������ ��ȯ�մϴ�.
	private static void level(List<Word> mywords, int no) {
		for(Word w :mywords)
			if(w.getLevel()==no)
				System.out.println(w);
	}
	//int Score = Integer.parseInt(sc.nextLine);
	//���� : nextInt()�� ���͸� ó������ �ʾƼ� ������ ������ nextLine()���� ���޵Ǿ� �Է� �帧�� ���ص˴ϴ�.
	//���:�� �ҽ� ���Ͽ��� nextint()�� ��� �Ǵ� nextLine()�� ����մϴ�

	private static void all(List<Word> mywords) {
		mywords.sort(new Comparator<Word>() {

			@Override
			public int compare(Word o1, Word o2) {
				return o1.getEnglish().compareTo(o2.getEnglish());
			}
			
		});
		System.out.println(String.format("%-20s %-30s %-10s", "English","Korean","level"));
		System.out.println("-------------------------------------------------");
		for(Word w : mywords)
			System.out.println(String.format("%-20s %-30s %-20s",w.getEnglish(),w.getKorean(),w.getLevel()));
	}
}

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
		System.out.println("선택기능 -> 1. 단어저장  2.단어검색 3.단어장보기 4.프로그램 끝내기 ");
		boolean run =true;
		while(run) {
			System.out.print("선택-> :");
			sel=sc.nextLine();
		switch(sel) {
		
		case "1" : 
			System.out.print("English ->" );
			eng=sc.nextLine();
			System.out.print("한글뜻 -> ");
			kor=sc.nextLine();
			System.out.println("레벨 -> ");
			level =Integer.parseInt(sc.nextLine());
			Word temp=(new Word(eng,kor));
			temp.setLevel(level);
			mywords.add(temp);
			
			break;
		
		case "2": 
			System.out.print("검색 단어 English ->");
			eng= sc.nextLine();	
			for(Word w : mywords)
				if(w.getEnglish().equals(eng))
			System.out.println("단어장 검색했습니다." + w);
			break;
		
		case "3": 
			all(mywords);	//정렬하고 출력
			break;
		
		case "4": 
			run=false;
			System.out.println("검색할 레벨 입력 (1~3) -> ");
			int no =Integer.parseInt(sc.nextLine());
			level(mywords,no);
			break;
			
			default:
			System.out.println("잘못 입력된 선택입니다. 1~4 입력입니다.");
			break;
		}//switch의 끝
		
	}	//while의 끝
		System.out.println("::::단어장 종료 :::::");
		
}	//참고 : 정수 데이터 입력을 받아야 한다면 문자열 nextLine() 받아서 정수로 변환합니다.
	private static void level(List<Word> mywords, int no) {
		for(Word w :mywords)
			if(w.getLevel()==no)
				System.out.println(w);
	}
	//int Score = Integer.parseInt(sc.nextLine);
	//이유 : nextInt()는 엔터를 처리하지 않아서 다음에 나오는 nextLine()에게 전달되어 입력 흐름에 방해됩니다.
	//결론:한 소스 파일에서 nextint()만 사용 또는 nextLine()만 사용합니다

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

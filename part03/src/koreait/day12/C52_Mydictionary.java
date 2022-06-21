package koreait.day12;

import java.util.Scanner;
import java.util.TreeMap;

public class C52_Mydictionary {

	public static void main(String[] args) {
		TreeMap<String,String> word=new TreeMap<String,String>();	//이진 검색한 구조로 map을 생성 :알파벳 순서대로 나열
		System.out.println("선택기능 -> 1. 단어저장  2.단어검색 3.단어장보기 4.프로그램 끝내기");
		Scanner sc= new Scanner(System.in);
//		HashMap<String ,String> word =new HashMap<>();
		//Key: 영어단어, value: 한글 뜻
		String sel,eng,kor;
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
			word.put(eng, kor);	//저장
			break;
		
		case "2": 
			System.out.print("검색 단어 English ->");
			eng= sc.nextLine();	
			System.out.println("단어장 검색했습니다." + word.get(eng));
			break;
		
		case "3": 
			System.out.print("단어장 전체보기 :"+word);
			break;
		
		case "4": 
			run=false;
			System.out.println("프로그램을 종료합니다.");
			break;
			
			default:
			System.out.println("잘못 입력된 선택입니다. 1~4 입력입니다.");
			break;
		}//switch의 끝
		
	}	//while의 끝

		
}	//참고 : 정수 데이터 입력을 받아야 한다면 문자열 nextLine() 받아서 정수로 변환합니다.
	//int Score = Integer.parseInt(sc.nextLine);
	//이유 : nextInt()는 엔터를 처리하지 않아서 다음에 나오는 nextLine()에게 전달되어 입력 흐름에 방해됩니다.
	//결론:한 소스 파일에서 nextint()만 사용 또는 nextLine()만 사용합니다
}

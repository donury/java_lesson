package koreait.day06;

import java.util.Scanner;

public class C34_StringArray {

	public static void main(String[] args) {
		String message = "hi java!"; //message는 참조형 변수
		
		String [] engKey = {"continue","break","public","static","dynamic"};
		System.out.println(engKey);
		
		//int ,double ,char 배열에서는 요소를 나타내는 nums[2], carr1[2], point[2]
		//										ㄴ 기본형 데이터 타입
		//engKey 뿐만 아니라 engKey[2]도는 참조형 타입
		System.out.println(engKey[2]);
		for(int i=0;i<engKey.length;i++)
			System.out.println(engKey[i]); //스트링 타입 참조형
		
		String []koreans =new String[5];	//배열 요소의 값이 기본형 데이터 저장X, 참조값 저장
		for(int i=0;i<koreans.length;i++)	//기본 초기값은 ?null (아무것도 참조하지 않은 상태)
			System.out.println(koreans[i]);
			
		for(int i=0;i<engKey.length;i++)
			System.out.println(engKey[i]+":"+engKey[i].length());
		
		koreans[0]="계속하다.";
		koreans[1]="멈추다.";
		koreans[2]="공용의";
		
		for(int i=0;i<koreans.length;i++)
			if(koreans[i] !=null)	///
			System.out.println(koreans[i]+":"+koreans[i].length());
		
			//참조하고 있는 객체가 없을때 메소드/필드 참조하면 오류	: koreans[3],koreans[4]은 null 참조
		
//		String temp=null;
//		System.out.println(temp.length());
		
		Scanner sc =new Scanner(System.in);
		System.out.print("static 뜻? >>>" );
		koreans[3]=sc.nextLine();
		System.out.print("dynamic 뜻? >>> ");
		koreans[4]=sc.nextLine();
		System.out.println("3. 모두 입력된 koreans 배열");
		
		for(int i=0;i<koreans.length;i++)
		System.out.println(koreans[i]);
		
		//사용자가 입력한 영어단어가 engKey 배열 인덱스가 몇번인지
		System.out.println("찾을 단어는 >>>");
		String find =sc.nextLine();
		
		int i;
		for(i=0; i<engKey.length;i++) {
			if(find.equals(engKey[i]))
				break; //
		}
		
		System.out.println("찾은 단어 위치 : "+ i);
		if(i==engKey.length)//?
			System.out.println("찾는 단어가 engKey 에 없습니다.!");
		else
			System.out.println("한글 뜻 : "+koreans[i]);
		
		
		
		
//		int index=-1;	//인덱스 변수를 사용하지 않는 방법 생각해보기.
//		for(int i=0;i<engKey.length;i++) {
//			if(find.equals(engKey[i])) { 
//			
//				index=i;	
//				break;
//			
//		}
//		}
//		System.out.println("찾은 단어 위치 : "+index);
//		if(index==-1)
//		System.out.println("찾는 단어가 engKey에 없습니다.");
//		else 
//		System.out.println("한글 뜻 : "+koreans[index]);
	}

}

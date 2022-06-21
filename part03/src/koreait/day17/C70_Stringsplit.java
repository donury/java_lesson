package koreait.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C70_Stringsplit {
public static void main(String[] args) {
	
	//String 클래스의 split 메소드	메소드 : 리턴타입이 String[]
	
	String temp ="모모 90 88 79";
	String [] result= temp.split(" ");	//공백을 기준으로 문자열을 여러개로 쪼개기
	System.out.println("1. 반복문 없이 출력");
	System.out.println("index 0 :" + result[0] );
	System.out.println("index 0 :" + result[1] );
	System.out.println("index 0 :" + result[2] );
	System.out.println("index 0 :" + result[3] );

	//fot문으로
	System.out.println("2.일반적인 for문 출력");
	for(int i=0; i<result.length;i++) 
		System.out.println(String.format("result[%d] :%s", i,result[i]));
	
	//항상된 for문
	System.out.println("3. 향상된 for문 출력");
	for(String t : result)
		System.out.println("result 요소 :" + t );

	String temp2="모모,90,88,79";
	result =temp2.split(",");
	System.out.println("4. 향상된 for문 출력");
	for(String t : result)
		System.out.println("result 요소 :" + t );
	
	
	temp2="모모,90 88()79";
	result =temp2.split("[ ,()]");
	System.out.println("5. 향상된 for문 출력");
	System.out.println("Result length : "+ result.length);
	for(String t : result)
		System.out.println("result 요소 :" + t );
	//result[1], result[3],result[5] 3개의 빈 문자열입니다. 
	
	result =temp2.split(",,");
	System.out.println("6. 향상된 for문 출력");
	System.out.println("Result length : "+ result.length);
	for(String t : result)
		System.out.println("result 요소 :" + t );
	
	//Split의 인자인 문자열은 정규식regex 문자열입니다.(정규식 패턴은 복작.어렵습니다)
	//  	정규식 예시 :[] 안에 표시하는 것은 문자 여러개가 또는 or에 해당합니다.
	
	temp2=" 모모,90,88,79";
	result =temp2.split(",",2);
	//lemit 은 리턴되는 배열의 크기, 단 쪼개지는 갯수보다 커질수는 없음.
	System.out.println("8. spilt 두번째 인자 limit 확인");
	System.out.println("Result length : "+ result.length);
	for(String t : result)
		System.out.println("result 요소 :" + t );

	//배열과 유사한 자료구조 : list
	result = temp2.split(",");
	System.out.println("9.result 배열의 list 객체로 변경");
	List<String>rlist =Arrays.asList(result);
	System.out.println(rlist);
	System.out.println("rlist size :"+ rlist.size());
	
	for(String t: rlist)
		System.out.println("rlist 요소 : " + t);
	
	//추가 확대/변경 못함
//	rlist.add("test");		//오류:리스트
//	rlist.add(2,"100");		//오류
	//동적인 List로 만들기
	//인자가 있는 리스트
	System.out.println("10.");
	List<String> rlist2 =new ArrayList<String>(rlist);
	System.out.println(rlist2);
	rlist.add("test");
	rlist.remove(2);
	rlist.add(2,"100");
	System.out.println(rlist2);

	//Arrays.aslist는 테스트용으로 사용할 리스트 만들때 사용
	List<Integer>ilist =Arrays.asList(1,2,6,9,100);
	System.out.println("11.Arrays.asList 활용");
	System.out.println(ilist);

}

}

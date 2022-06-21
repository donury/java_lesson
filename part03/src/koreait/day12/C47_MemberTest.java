package koreait.day12;

import java.util.ArrayList;

public class C47_MemberTest {

	public static void main(String[] args) {
		//member [] member =new member[10]; 동일한 역활
		ArrayList <Member> list =new ArrayList<>();	//리스트에 저장되는 것은 객체의 참조값.
		//<>제너릭 = 포괄적인 
		//리스트에 저장하는 데이터를 요소(Element)라고 합니다.
		//주요 메소드 get,add, remove,size (참조형 타입일때 제한적인것들)
		list.add(new Member("모모",27));
		Member member =new Member("다현", 26);
		list.add(member);
		list.add(new Member("나나",20));
		list.add(new Member("신비",22));
		System.out.println("현재 list의 요소 개수:" + list.size());
		System.out.println("1.전체 리스트 출력");
		System.out.println(list);
		
		System.out.println("list의 요소 중 age 필드값이 25이하 인것만 출력해보기");	//for문
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getAge()<=25)
				System.out.println("i="+i +","+ list.get(i));
		}
		System.out.println("3. 나나는 몇번 인덱스에서 참조하고 있는 객체인가?");
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals("나나"))	//.equals("나나")
				System.out.println("나나는 "+ i+"번째인덱스에 참조 하고 있습니다");
			
		}
		//리스트 요소가 여러개의 필드로 갖는 객체이면 필드값 비교하는 equals 예제입니다.
									//indexof는 String, 기본 래퍼클래스에서 가능
		System.out.println("Member 객체로 indexof 실행 : "+ list.indexOf(new Member("나나",20)));
		//indexof로 못찾음
		System.out.println("Member 객체로 indexof 실행 : "+ list.indexOf(member));
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals("나나")&&list.get(i).getAge()==20)	//.equals("나나")
				System.out.println("나나는 "+ i+"번째인덱스에 참조 하고 있습니다");
	}
}
}
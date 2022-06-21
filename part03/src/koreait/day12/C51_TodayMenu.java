package koreait.day12;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class C51_TodayMenu {

	public static void main(String[] args) {
		System.out.println("오늘의 저녁메뉴 투표합니다.!!!");
		System.out.println("치맥, 떡볶이, 곱창, 불고기, 햄버거, 오징어물회 ");
		Scanner sc =new Scanner(System.in);
		//key는 메뉴 이름 ,value  : 투표수
		HashMap<String,Integer> map =new HashMap<>();	
		map.put("치맥", 0);
		map.put("떡볶이",0);
		map.put("곱창", 0);
		map.put("불고기", 0);
		map.put("햄버거", 0);
		map.put("오징어물회", 0);
		
			
		while(true) {
			System.out.println("선택 메뉴 음식명 입력하세요 .(종료는 end 입력)->");
			String menu=sc.nextLine();
			if(menu.equals("end"))break;
			
			//입력받은 menu 의 value값을 가져오기 -> +1하기 -> 저장
			if(!map.containsKey(menu)) {
				System.out.println("없는 메뉴입니다. 다른것을 투표해주세요. ");
				continue;
			}
			int temp =map.get(menu);
	//		++temp;
	//		map.put(menu, temp);
			map.put(menu, ++temp);
			System.out.println(map);
		}
	System.out.println("투표종료합니다.");
	System.out.println(map);
	System.out.println("최대 득표수 : "+Collections.max(map.values())); //가장 큰 value
	System.out.println("참고 : "+Collections.max(map.keySet())); //가장 큰 key
	//Entry<Key,Value>
	}

}

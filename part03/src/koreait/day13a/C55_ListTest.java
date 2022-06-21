package koreait.day13a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import koreait.day12.Member;
import koreait.day13.MemberAgeDescending;
import koreait.day13.MemberAgescending;

public class C55_ListTest {

	public static void main(String[] args) {
		//List는 인터페이스, ArrayList는 구현체
		//다형성 : List를 참조타입으로 하여 선업합니다. 앞으로 배울 라이브러리들이 List타입으로 원합니다.
		
		
		List<Integer> ilist =new ArrayList<>();	//List
		List<String> slist =new ArrayList<>();
		
		ilist.add(34);
		ilist.add(77);
		ilist.add(19);
		ilist.add(56);
		ilist.add(45);
		ilist.add(9);
		//{34 77 19 56 45 9 }
System.out.println("sort 이전 :"+ilist);
//정렬 : 오름차순
ilist.sort(null); 
				//인자로 필요한 것은 비교자 comparator 구현체 필요합니다
				  // 기본형 String 은 null로 할수 있습니다. (오름차순)
System.out.println("sort 이후 :"+ilist);
ilist.sort(Comparator.reverseOrder());
System.out.println(ilist);

	slist.add("트와이스");
	slist.add("오마이걸");
	slist.add("아이즈원");
	slist.add("비비즈");
	slist.add("소녀시대");
	slist.add("블랙핑크");
	System.out.println(slist);
	slist.sort(null);
	System.out.println(slist);	//ASEC 오름차순
	slist.sort(Comparator.reverseOrder());
	System.out.println(slist);	//DSEC 내림차순
	
	List<Member>mlist	=new ArrayList<>();
	mlist.add(new Member("momo",23));
	mlist.add(new Member("nana",27));
	mlist.add(new Member("nayeon",25));
	mlist.add(new Member("dahyeon",29));
	mlist.add(new Member("sooni",26));
	mlist.add(new Member("jenny",27));
//	mlist.sort(null); Member 객체는 비교할 수 없는 객체 -> 비교자 인터페이스를 인자로 해야함.
		//	Member 객체의 sort : 비교 가능한 값으로 필드 중 하나를 선택해서 비교자 (comparator)	구현체 만듭니다.
	
	System.out.println("member 리스트 상태 :" + mlist);
	mlist.sort(new MemberAgescending());
	System.out.println(mlist);
	mlist.sort(new MemberAgeDescending());
	System.out.println(mlist);
	
	System.out.println("\n2. comparable 인터페이스 사용하는 sort");
	List<User>ulist = new ArrayList<User>();
	ulist.add(new User("모모 ",23));
	ulist.add(new User("나나",27));
	ulist.add(new User("나연 ",25));
	ulist.add(new User("다현 ",29));
	ulist.add(new User("수니 ",26));
	ulist.add(new User("제니",27));
	System.out.println("User 리스트 상태 : "+ulist);
//User는 비교할 수 있는 타입 : Comparable 구현채는 비교가능
	
	ulist.sort(null);
	System.out.println("user sort :"+ulist);
	ulist.sort(Comparator.reverseOrder());
	System.out.println("user sort 내림차순:"+ulist);
	
	ulist.sort(new Comparator<>() {
		@Override
		public int compare(User o1, User o2) {
			return o1.getName().compareTo(o2.getName());
		}
	});
	System.out.println(ulist);
	}
	

}

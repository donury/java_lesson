package koreait.day13a;

public class C54_CompareTo {

	public static void main(String[] args) {
		//모든 객체에는 compareTo  메소드가 있습니다.
		
		String na="kim";
		String you ="momo";	
		String he = "Son";
		//String은 알파벳(사전식)비교 
		System.out.println("kim과 momo"+na.compareTo(you));	//-2음수 kim <momo
		System.out.println("kim과 son"+na.compareTo(he));		//24양수 kim >Son
		
		int a=12, b=45;
		System.out.println(a-b);	//음수 
		Integer aa=12;
		Integer bb=45;
		System.out.println("12와 45 :"+ aa.compareTo(bb));	//-1 aa<bb
		//compareTo비교 메소드이다.
		aa=90;
		System.out.println("90와 45 :"+ aa.compareTo(bb));	//1 aa>bb 
		aa=45;
		System.out.println("45와 45 :"+ aa.compareTo(bb));	//0 : aa=bb 동일할때
		//compareTo 와 같은 비교는 sort(정렬)에 사용됩니다.
		//정렬은 오름차순 , 내림차순 2가지 방법으로 할 수 있습니다.

	}

}

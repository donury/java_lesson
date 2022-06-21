package koreait.day01;

public class C02_TwicePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("트와이스");
		System.out.println("이름\t생년월일\t\t 나이");
		System.out.println("=========================");
		System.out.println("사나\t1996.12.29\t27");
		System.out.println("지효\t1997.02.01\t26");
		System.out.println("미나\t1998.03.24\t25");
		//printf()메소드 사용해서 출력형식지정합니다.
		//12칸 문자열 띄움 +자리수 미지정 문자열+5칸정수
		//%s는 지정된 칸에서 오른쪽맞춤 , -기호는 왼쪽맞춤 
		System.out.printf("%-12s%s%5d\n","dayeon","1998.05.28",25);
		System.out.printf("%-12s%s%5d\n","momo","1999.04.23",24);
		System.out.printf("%-12s%s%5d\n","nana","1997,06,14",27);
		
		//printf 메서드에서 형식문자 갯수만큼 뒤에 나오는 데이터 갯수가 일치해야함
		//System.out.printf("%-12s%s%5d\n","nana","1997,06,14");
		//printf 메서드에서 형식문자 갯수만큼 뒤에 나오는 데이터 형식이 일치해야함
		//System.out.printf("%-12s%5d\n","nana","1997,06,14");
		System.out.println("//////////연습///////////");
		System.out.printf("%-12s %4d.%02d.%2d\t%.1f\n","dayeon",1998,5,28,2555.55);
		System.out.printf("%-12s %4d.%02d.%2d%5d\n","momo",1999,4,23,24);
		//여기까지는 데이터를 직접 리터럴로 표현해서 출력했습니다.
		//진도방향 : 변수(데이터를 저장하고 있는 기억장소 이름) 사용
//		System.out.printf("%-12s %4d.%02d.%2d%5d\n","nana",1997,6,14,27);
		//%숫자s 오른쪽 맞춤 %-숫자 왼쪽맞춤 
	}
/*
 * 출력에 사용되는 형식
 * 
 * \(역슬래쉬) 사용하는 이스케이프문자 : \n(줄바꿈),\t(tab)
 * 형식지정문자 %기호 사용 : %s(문자열) , %d(정수) 자리수를 지정해서 쓸수도 있다.
 *			ㄴ 남은자리 0으로 채우고 싶을때 %03d 이런식으로 하기 
 */
}

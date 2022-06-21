package koreait.day03;

import java.util.Scanner;

public class C10_Keyinput {

	public static void main(String[] args) {
		//키보드 입력을 위한 변수 선언. 기본형 변수가 아닌 클래스 타입의 변수입니다 -> 참조형 변수.
	//		ㄴnew연산으로 만드는 객체의 클래승= 이름과 같은 이름으로 변수 선언합니다.
		Scanner sc = new Scanner(System.in);	
	
	//키보드 입력을 위한 변수 선언 - 표준입력으로 scanner 객체를 만들고 변수 sc가 참조합니다.
	
		System.out.print("정수값 입력하세요. -> "); //입력안내 메세지
		int date = sc.nextInt();		
	
		System.out.println("입력받은 값은 "+date + "입니다");
	
	
		System.out.println("실수값 입력하세요 -> ");
		double point=sc.nextDouble();
		
		System.out.println("입력된 값은 " + point + "입니다");
	
	}

}
/*
 * 	표준 출력 : System.out(out 은 System 클레스의 정적인 필드이고 메소드 println()을 갖습니다.)
 *  표준 입력 : System.in     -> in은 System 클래스의 정적인 필드
 *  						-> Scanner 클래스를 이용해서 입력값을 특정 기본형식으로 변환시켜는 기능 사용.
 * 						   -> 기본 패키지의 클래스가  아니므로 import 가 필요합니다.	
 * 
 */

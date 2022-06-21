package koreait.day02;

class  C03_integerDate{

	public static void main(String[] args) {
		
		System.out.println("Byte 정수데이터===============");
		System.out.println("메모리 크기: " + Byte.BYTES);
		System.out.println("Byte 정수의 최대값:" +Byte.MAX_VALUE);
		System.out.println("Byte 정수의 최소값:" +Byte.MIN_VALUE);
		
		System.out.println("Short 정수데이터 ==============");
		System.out.println("메모리 크기:"+ Short.BYTES);
		System.out.println("Short 정수의 최소값:" +Short.MIN_VALUE);
		System.out.println("Short 정수의 최대값:" +Short.MAX_VALUE);
		
		System.out.println("Integer 정수데이터 ==============");
		System.out.println("메모리 크기:"+ Integer.BYTES);
		System.out.println("Integer 정수의 최소값:" +Integer.MIN_VALUE);
		System.out.println("Integer 정수의 최대값:" +Integer.MAX_VALUE);
		
		System.out.println("Long 정수데이터 ==============");
		System.out.println("메모리 크기:"+ Long.BYTES);
		System.out.println("Long 정수의 최소값:" +Long.MIN_VALUE);
		System.out.println("Long 정수의 최대값:" +Long.MAX_VALUE);

	}

}
	//정수 데이터 기본형식은 byte, short,intlong 4가지이며
	//		ㄴ각각 메모리에 할당받는 크기(바이트 단위)와 그에 따른 값의 저장 범위가 결정됩니다.
	//		ㄴ변수를 선언할 때 사용할 키워드(예악어용도가 정해진 단어)
	//byte, short , Integer, Long 클래스 정수 데이터 형식을 다루는 속성과 메소드를 갖는 클래스(WRAPPER 래퍼 클래스)
	//		ㄴ다음은 위 클래스들의 구성요소인 속성(필드)들 중 변하지 않는 값(상수)입니다. 대체로 대문자로 표기합니다.
//				ㄴ	BYTES , MIN_VALUE, MAX_VALUE
package koreait.day04;

public class C20_StringMethod {

	public static void main(String[] args) {
		
		String message = "hello~";	//java.lang.String (기본 패키지 클래스)
		int len = message.length();
		char temp =message.charAt(3);
		boolean isState =message.equals("Hello~");
		System.out.println("length() = "+len);
		System.out.println("charAt(3)="+temp);
		System.out.println("equals(\"Hello\") ="+isState);
		
		System.out.println(message.length());
		System.out.println(message.charAt(2));
		System.out.println(message.charAt(0));
		System.out.println(message.equals("hello~"));
	//리턴값 형식은?
		System.out.println("indexOf('e\')"+message.indexOf(3)); //1번위치
		System.out.println("indexOf(\"lo\")"+message.indexOf("lo"));	//3번위치
		String test= "hello~hello~";
		System.out.println("test.indexOf(\"lo\")="+test.indexOf("lo"));
		System.out.println("test.lastIndexOf(\"lo\")="+test.lastIndexOf("lo"));
		message.substring(2);		//String
		System.out.println("substring(2)"+message.substring(2)); //부분추출 : llo~
		message.substring(2,4);
		System.out.println("substring(2,4)"+message.substring(1,2));	//ll 2번부터 2개 (4-2)
		//sub 지정할수 있는 숫자는 0부터 ~
		System.out.println("substring(1,4)"+message.substring(1,4));	//ll 2번부터 2개 (4-2)
		message.replace("ll", "*@"); 	//String
		System.out.println("replace(\"ll\", \"*@\")=" +message.replace("ll", "*@"));//치환 : he*@o
		System.out.println("startsWith(\"H\");="+message.startsWith("H"));	//false
		System.out.println("endsWith(\"~\")=" +message.endsWith("~"));	//true

		
		
		//메소드 오버로딩(overloading) : 메소드 이름과 리턴형식은 같고 인자값의 갯수와 형식이 다르게 정의된 것.
		
		
		
		
//		String 클래스의 메소드는 많습니다. 다외우고 사용하는 것이 아니고 메소드의 이름,인자,리턴형식을 참조해서 사용합니다,
//		message.length();			//public int length()
//		message.charAt(0);			//public char charAt(int index)
		
//		message.equals("Hello~");	// public boolean equals(Object anObject),object 모든 타입
		//message 가 String 타입이므로 object 는 string으로 해석합니다.
		
		
	}

}

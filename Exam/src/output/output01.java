package output;

public class output01 {

	public static void main(String[] args) {
		System.out.println("printf()를 이용해 다음 단어를 출력하시오. Hello");
		System.out.printf("Hello\n");
	
		// 예제 02 Hello World 출력하기
	
				System.out.println("Hello World");
		//예제  03 Hello
//				World	줄바꿔 출력하기
				System.out.printf("Hello\nWorld\n");
//				예제 04 'Hello' 출력하기
				System.out.println("\'Hello\'");
//				예제 05 "Hello World"
				System.out.printf("%s","HelloWorld\n");
				//예제 06"!@#$%^&*()"
				System.out.printf("%s","!@#$%^&*()\n");
				//예제 07"C:\Download\hello.cpp"
				System.out.printf("%s","\"C:\\Download\\hello.cpp\"\n");
				//예제 08 printf("\u250C\u252C\u2510\n")
				System.out.printf("\u250C\u252C\u2510\n");
				System.out.printf("\u2514\u2534\u2518\n");
	}
}

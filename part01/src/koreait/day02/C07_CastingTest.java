package koreait.day02;

public class C07_CastingTest {

	public static void main(String[] args) {

		//대입문 : 오른쪽 값(리터럴)/수식/변수가 왼쪽 변수로 대입 .수식에 사용되는 연산은 다음과 같습니다.
		//산술연산 +,-,*,/(나눗셈),%(나눗셈 나머지)
		//관계연산	==(동등,같다), !=(같지 않다.), > , < , >=, <=
		//논리연산 &&(and,그리고) , ||(or, 또는) , !(not) 
		
		//정수형식 integer
		int a = 123, b = 10;
		double c=10.34;
		
		int isum;
		double dsum;
		
		isum = a + b;
		dsum = a + c ;
		
		System.out.println("a + b = "+isum);
		System.out.println("a + c = "+dsum);
		
//		isum = a + c ;	//결과가 실수이므로 정수형식 변수에 저장 못합니다. : 오류
		
//		형변환 (Casting,캐스팅): 정수 + 실수 결과를 꼭 정수 변수에 저장 해야 한다면. 형변환을 하고 더해라		
//			->프로그래머가 결정해서 강제로 형변환  -> ()안에 변환시킬 형식작성
	isum = a + (int)c ;	//c변수의 실수값을 정수로 변환
	
	System.out.println("a + (int)c = "+ isum);
		
	System.out.println(" a / b = "+(a/b));//정수끼리 나누면 결과정수
	System.out.println(" a % b = "+(a%b));//정수끼리 나누기의 나머지
	
	System.out.printf("%d / %d =  %d\n",a,b,a/b);
	System.out.printf("%d %% %d = %d\n",a,b,a%b);
	
	int aa=123,bb=10;
	int aaa= aa/bb , bbb=aa%bb;
	
	System.out.println("몫 ="+aaa +"나머지 = "+bbb);
	
	//강제형변환 (캐스팅 Casting) 예시 : 정수끼리 나눗셈 결과를 실수로 구하고 싶다면....
	b=11;
	double fsum = a /b ; 
	System.out.println(fsum);
	System.out.printf("%d / %d =  %f\n",a,b,a/(double)b);	//실수 형식문자 %f /기본 6자리  
	System.out.printf("%d / %d =  %.1f\n",a,b,a/(double)b);	//소수점 이하 1자리로 변경  (반올림)

	double test = 12.3456123456789;
	System.out.println("test = "+ test);
	System.out.printf("test = %f \n",test);
	System.out.printf("test = %.15f",test);
		

	}
}

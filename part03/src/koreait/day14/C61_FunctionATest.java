package koreait.day14;

import java.util.Random;

public class C61_FunctionATest {

	public static void main(String[] args) {

	FunctionA fa= new FunctionA() {

		@Override
		public int methodA(int a, int b) {
			// TODO Auto-generated method stub
			System.out.print("a*b = ");
			return a*b;
		}
	};
		
		System.out.println(fa.methodA(23, 11));
		//2 람다식 추상메소드가 1개일때만 가능. 
		fa=(int a,int b)->{
			System.out.println("a+b = ");
			return a+b;
		};
	System.out.println(fa.methodA(23, 11));
	
	fa=(int max, int min)->{
		//min~max 범위의 난수를 만들어서 리턴합니다.
		Random r = new Random();
		return r.nextInt(max-min+1)+min;
	};
	System.out.println(fa.methodA(100, 11));
	}
}
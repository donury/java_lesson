package koreait.ext;

public class BinaryOp {
public static void main(String[] args) {
	//2진수의 비트 연산 : & , |,^ ,~ ,>> ,<< 등등 간단히 테스트
	
	int data =0b0101110100100110;
	System.out.println("1.~ (비트 반전)연산 결과");	//참고 : !연산은 true와 false를 반대로 (boolean)연산
	System.out.println(String.format("%32s", Integer.toBinaryString(data)));
	System.out.println(String.format("%32s", Integer.toBinaryString(~data)));

	System.out.println("2.오른쪽 쉬프트 연산 (오른쪽 정수값은 쉬프트 동작 횟수 ");
	System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
	System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>1),data>>1));
	System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>2),data>>2));
	//>>1은 나누기 2한 결과값
	System.out.println("3.왼쪽 쉬프트 연산 (오른쪽 정수값은 쉬프트 동작 횟수 ");
	System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
	System.out.println(String.format("%32s %d", Integer.toBinaryString(data<<1),data<<1));
	System.out.println(String.format("%32s %d", Integer.toBinaryString(data<<2),data<<2));
	//<<1은 곱하기 2한 결과
	data =-2445;
System.out.println("2.음수값 >> (오른쪽 정수값은 쉬프트 동작 횟수 ");
System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>1),data>>1));
System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>2),data>>2));
//참고 : 오른쪽 쉬프트 할때 부호와 상관없이 왼쪽에 추가되는 비트를 0해야 할때에는 >>>연산으로 합니다.
System.out.println("3.>>>오른쪽 쉬프트 연산");
System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>>2),data>>>2));

	int n = 0x11010011;
	data=100; 
	
	//참고 논리연산 and는 참 and 참일때만 결과가 참 논리연산 or는 거짓 or 거짓일때만 결과가 false
	//		비트 연산 and 는 1 &1일때만 결과가 1, 비트연산 or는 0 or 0일때만 결과가 0 
	//비트 연산 활용 -> x&1은 결과가 x, x|1은 결과가 1
	System.out.println("4.bit and 연산");
	System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
	System.out.println(String.format("%32s %d", Integer.toBinaryString(n),n));
	System.out.println("-------------------------------------------------");
	System.out.println(String.format("%32s %d", Integer.toBinaryString(data & n),data&n));

	System.out.println("5.bit or 연산");
	System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
	System.out.println(String.format("%32s %d", Integer.toBinaryString(n),n));
	System.out.println("-------------------------------------------------");
	System.out.println(String.format("%32s %d", Integer.toBinaryString(data | n),data|n));
	n=0;
	System.out.println("6.&는 bit and 연산");
	System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
	System.out.println(String.format("%32s %d", Integer.toBinaryString(n),n));
	System.out.println("-------------------------------------------------");
	System.out.println(String.format("%32s %d", Integer.toBinaryString(data & n),data&n));

	System.out.println("7.|는 bit or 연산");
	System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
	System.out.println(String.format("%32s %d", Integer.toBinaryString(n),n));
	System.out.println("-------------------------------------------------");
	System.out.println(String.format("%32s %d", Integer.toBinaryString(data | n),data |n));
	
	
}
}
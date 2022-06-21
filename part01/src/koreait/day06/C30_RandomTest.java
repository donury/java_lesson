package koreait.day06;

import java.util.Random;

public class C30_RandomTest {
//난수 발생하는 Random 클래스의 메소드를 테스트 합니다.
	public static void main(String[] args) {
		Random r=new Random();// Random 클래스의 객체 생성(new 연산)
		
		System.out.println("1.정수형 랜덤값 10개 출력");	// 
		for(int i=0;i<10;i++) {
			int inum =r.nextInt();	//int 범위내에서 랜덤값 만듭니다
			System.out.println(inum); 
		}
			System.out.println("1.정수형 랜덤값 10개 출력 - bound(경계값) ");	
			for(int i=0;i<10;i++) {
				int inum =r.nextInt(100);	//0<= 난수 <100 범위내에서 랜덤값 만듭니다	
			System.out.println(inum); 
		
			}
		System.out.println("3. 특정 범위의 랜던값 10개출력");
		System.out.println("1.정수형 랜덤값 10개 출력 - bound(경계값) ");	
		for(int i=0;i<10;i++) {
			int inum =r.nextInt(100)+1;	//0<= 난수 <101 범위내에서 랜덤값 만듭니다	
		System.out.println(inum); 
	
		}
		//n보다 크거나 같고 m보다 작은 범위 난수 : r.nextInt(m-1)+n
		System.out.println("4. 2~45 로또 번호 범위의 값으로 난수 10개"); //n=2,m=46
		for(int i=0;i<6;i++) {
			int inum=r.nextInt(44)+2;	//0<=난수 <44 -> 2<= 난수<46
			System.out.println(inum);
			
		}
	}	
		
		
	
	}



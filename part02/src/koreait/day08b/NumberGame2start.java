package koreait.day08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame2start {

	public static void main(String[] args) {
		Random r = new Random(); 
		Scanner sc = new Scanner(System.in);
		int max =10;	//시도회수
		int [] triallst = new int [max];
		GameValue [] history = new GameValue[10];
		int k=0;			//history 배열의 인덱스 변수
		
			System.out.println("숫자 맞추기 게임 시작합니다. 나 컴퓨터는 숫자를 결정했습니다.");
			System.out.print("게임을 시작하려면 너 휴먼의 이름을 쓰시오>>>");
			String gamer=sc.nextLine();
			int rmin=11,rmax=29;
			do {
			GameValue temp = new GameValue(gamer);
			System.out.println("숫자 맞추기 게임 시작합니다. 나 컴퓨터는 숫자를 결정했습니다.");
			System.out.println(String.format("너, 휴먼은 맞춰보세요.(범위 %d~%d)", rmin,rmax));
		int numComputer =GameValue.makeNumber(rmin, rmax);	  //랜덤값    	 101<=랜덤값 <299
		int numHuman;					
		int i=0;
			
		do {
			System.out.print("생각한 숫자 입력 (기회 : "+(max-i)+ ")->");
			numHuman =sc.nextInt();
		if(numComputer >numHuman) {  //랜덤값> 입력값
			triallst[i]=numHuman;	//만약 랜덤값>입력값  [i] 저장되는 값
			i++;					
			System.out.println("아닙니다. 더 큰값 입니다.");
		}else if(numComputer <numHuman) {
			triallst[i]=numHuman;
			i++;
			System.out.println("아닙니다. 더 작은 값입니다.");
		
		}
		if(i==max)	break;
		}while(numComputer !=numHuman);
		//numComputer == numHuman 이면 답을 맞춘것,
	     if(i==max) {
		System.out.println("너 휴먼 입력 내용 : "+Arrays.toString(triallst));
		System.out.println("주어진 기회를 다 쓰셨습니다. 게임을 다시 시작하세요!![답은 "+numComputer +"]");
		temp.setCount(max);
	     }else {
		System.out.println("딩동탱~ 맞추셨습니다. 성공까지 시도 횟수 : "+(i+1));
		temp.setCount(i+1);
		temp.setSuccess(true);
	     
	     history[k]=temp;	//temp는 GameValue 객체의 참조값(주소)
	     k++;		//다음 인덱스값, 카운트 역활
	     System.out.println("게임을 계속하시겠습니까? 계속 하려면 0 입력 >>> ");
		}
			}while(sc.nextInt()==0);

			System.out.println("::::::::게임 스코어::::::::");
			//for 반복으로 history 배열에 저장된 값 출력하기
			for(int j=0;j<k;j++)
				history[j].print();	//history j 타입은 GameValue
			System.out.println("::::::::the end:::::::::");
		
}
}

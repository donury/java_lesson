package koreait.day03;

import java.util.Scanner;

public class C16_SwichTest {

	public static void main(String[] args) {
		//swich문은 if~else if 를 대신하는 명령문입니다.
		Scanner sc= new Scanner(System.in);
		int item_no;
		int pay = 0;
		
		System.out.println("상품목록 : 1.2200원  🍕🍕  2.1900원  🌯🌯 3.3600원   🍟🍟    4.2870원 🍖🍖 ");
		System.out.println("상품을 선택해서 장바구니에 넣으세요.>>>");
		item_no = sc.nextInt();
		
		switch(item_no) {
		case 1:
				pay=2200; break;
		case 2:
				pay=1900;	break;
		case 3: 
				pay=3600; break;
		case 4: 
				pay=2870; break;
				default:	//case 문에 해당되지 않는 값에 대해 실행
			System.out.println("상품 선택이 잘못되었습니다.");
			pay=9999999;
			break;
		}
		System.out.println("결제 금액" + pay + "원 입니다.");
		
		//if문에서 조건식 작성했을때와 같이 비교할 변수
		if(item_no == 1) 	
			pay =2200;
		else if(item_no ==2) 
			pay =1900;
		else if(item_no ==3) 
			pay =3600;
		else if(item_no ==4) 
			pay =2870;
		else {
			System.out.println("상품 선택이 잘못되었습니다.");

		}
			System.out.println("결제 금액" + pay + "원 입니다.");
		
	
}
}
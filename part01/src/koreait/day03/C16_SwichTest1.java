package koreait.day03;

import java.util.Scanner;

public class C16_SwichTest1 {

	public static void main(String[] args) {
		int item;
		int pay;
		
		
		
		System.out.println("상품목록 : 1.2200원  🍕🍕  2.1900원  🌯🌯 3.3600원   🍟🍟    4.2870원 🍖🍖 ");
		System.out.println("상품을 선택해서 장바구니에 넣으세요.>>>");
		Scanner sc= new Scanner(System.in);
		
		item=sc.nextInt();
		switch(item) {
		case 1: pay=2200; 	System.out.printf("주문하신 금액은 : %d%s",pay,"원");
		break;
		case 2: pay=1900; 	System.out.printf("주문하신 금액은 : %d%s",pay,"원");
		break;
		case 3: pay=3600;	System.out.printf("주문하신 금액은 : %d%s",pay,"원");
		break;
		case 4: pay=2870;	System.out.printf("주문하신 금액은 : %d%s",pay,"원");
		break;
		}
		
	}

}

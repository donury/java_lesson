package If;

import java.util.Scanner;

public class C14_ifExam {

	public static void main(String[] args) {
		//if(조건식) {..} else if {....}
				/*
				 * 나의 쇼핑몰 마켓컬리
				 * 오늘 구입한 금액이 10만원 이상이면 적립금 구매금액의 10%  0.1
				 * 				ㄴ7만원				   9%  0.09
				 * 				ㄴ4만원					7% 0.07
				 * 				ㄴ그 이하는 					3%	0.03	
				 */		
		String name;
		name="이마산";
		int buy;
		double mile;
		Scanner sc =new Scanner(System.in);
		System.out.println(name +"고객님께서 구매하신 총 금액은 \n"
							+ "	다음과 같습니다 : " );
		buy=sc.nextInt();
		System.out.printf("구매금액 : %d%s",buy,"원\n");
		
		if(100000<=buy) {
			mile=buy*0.1;
		}else if(70000<=buy) {
				mile=buy*0.09;
			}else if(40000<=buy) {
				mile=buy*0.07;
				
			} else {
				mile=buy*0.03;
			}
		System.out.printf("오늘 구매하신 금액의 적립금은 : %.0f%s",mile,"점입니다");

	}

}

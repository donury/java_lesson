package If;

import java.util.Scanner;

public class If_else01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력을 받아 요금 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이: ");
		int age= sc.nextInt();
		if(age>65) {
			System.out.println("나이는 "+ age + "살입니다"+"\n 65세이상 요금은 1000원입니다");
		}
		else if(age>19) {
			System.out.println("나이는 "+ age + "살입니다"+"\n 성인요금은1400원입니다");
		}
		else if(13<age) {
			System.out.println("나이는 "+ age + "살입니다"+"\n 중고등학생요금은 700원입니다");
		
		}
		else if(7<age) {
			System.out.println("나이는 "+ age + "살입니다"+"\n 초등학생요금은 500원입니다");
		}
		else{
			System.out.println("나이는"+ age + "살입니다"+"\n 미취학아동은 무료입니다");
		}
		System.out.println("요금을 확인하시고 타십시오");
	}
		

}

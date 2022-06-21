package calendar;
import java.util.Date;
import java.util.Scanner;
public class Codeup_Date {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("날짜를 입력하시오 : 예시 0000,0,0");
		String input = sc.nextLine(); 
		System.out.printf("%f%02f%02f",input,input,input);
		
	}

}

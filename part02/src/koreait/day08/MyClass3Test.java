package koreait.day08;

import java.util.Calendar;
import java.util.Date;

public class MyClass3Test {

	public static void main(String[] args) {
		
		//MyClass3 my3= new MyClass3()	; 오류 생성자 private 한정자
		MyClass3 my3 =MyClass3.getInstance();
		my3.test();
		MyClass3.staticTest();
		
		Calendar todat= Calendar.getInstance();
		System.out.println(todat);
		Date c=new Date();
		System.out.println(c);
		
	}

}

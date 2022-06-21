package Char;

public class Character_ASC {
	//아스키코드 sp -> ~ 기본 표현 끝까지  출력하기
	public static void main(String[] args) {
		char first = ' ';
		
		for(int i=31; i<126 ; i++) {//0~31 제어코드라 사용불가
									//표현할 수 있는 32번  부터  126번까지 
			
			System.out.print(first);
			first++;	
			}	
		//반대로 숫자로 숫자 126번에서 32번 까지
		
		System.out.println();
		char finish = '~';
		
		for(int i=126; i>32; i--) {
			System.out.print(finish);
			finish--;
		}
		
}
}
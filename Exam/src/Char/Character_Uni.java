package Char;

public class Character_Uni {
	//유니코드 한글 표현하기  (글자가 많아서 렉이 걸릴수도 있느니 참고바람)
	public static void main(String[] args) {
		char korea = 'ㄱ';		//ㄱ부터 100까지 표현시 > 
		for(int i = 0; i<100; i++) {
			System.out.print(korea);
				korea++;	//100칸씩 println으로 줄바꿈 하는거까지 해서 44032~55203 출력해보기 
							//*다음번에* 
		}
		
		System.out.println();
	char korea1 = '가';  //한글 문자테스트  10진수 44032~55203   16진수 ac00~a7a3
	for(int j = 0; j<100; j++) {
		System.out.print(korea1);
			korea1++;
	}
	System.out.println();
	
			char korea2 = '가';  
			for(int d = 0; d<100; d++) {
				System.out.print((int)korea2+",");
					korea2++;			
			}
	}
}



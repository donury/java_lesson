package Char;

public class Character_16 {

	public static void main(String[] args) {
	//16������ �����ϰ� ǥ���ϸ� �ȴ�. ac00~d7a3   '\uacd0  \\u�� 16���� ǥ��

		char korea = '\uac00';
		for(int i = 0; i<100; i++) {
			System.out.print(korea++);
				
		}
		System.out.println();
				char korea1 = '\ud700';
				for(int  j= 100; j>1; j--) {
					System.out.print(korea1--);
					
	}

}
}
package Char;

public class Character_ASC {
	//�ƽ�Ű�ڵ� sp -> ~ �⺻ ǥ�� ������  ����ϱ�
	public static void main(String[] args) {
		char first = ' ';
		
		for(int i=31; i<126 ; i++) {//0~31 �����ڵ�� ���Ұ�
									//ǥ���� �� �ִ� 32��  ����  126������ 
			
			System.out.print(first);
			first++;	
			}	
		//�ݴ�� ���ڷ� ���� 126������ 32�� ����
		
		System.out.println();
		char finish = '~';
		
		for(int i=126; i>32; i--) {
			System.out.print(finish);
			finish--;
		}
		
}
}
package Char;

public class Character_Uni {
	//�����ڵ� �ѱ� ǥ���ϱ�  (���ڰ� ���Ƽ� ���� �ɸ����� �ִ��� ����ٶ�)
	public static void main(String[] args) {
		char korea = '��';		//������ 100���� ǥ���� > 
		for(int i = 0; i<100; i++) {
			System.out.print(korea);
				korea++;	//100ĭ�� println���� �ٹٲ� �ϴ°ű��� �ؼ� 44032~55203 ����غ��� 
							//*��������* 
		}
		
		System.out.println();
	char korea1 = '��';  //�ѱ� �����׽�Ʈ  10���� 44032~55203   16���� ac00~a7a3
	for(int j = 0; j<100; j++) {
		System.out.print(korea1);
			korea1++;
	}
	System.out.println();
	
			char korea2 = '��';  
			for(int d = 0; d<100; d++) {
				System.out.print((int)korea2+",");
					korea2++;			
			}
	}
}



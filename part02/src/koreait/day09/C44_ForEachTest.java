package koreait.day09;

public class C44_ForEachTest {

	public static void main(String[] args) {
		
		int [] itest = {1,2,3,4,5,6};
		String [] stest= {"break","public","each","package","while"};
		
		//�迭�� for������ ������ �� �ε��� ������ ����մϴ�.
		for(int i=0;i<itest.length;i++)
			System.out.println("i ="+i +",itest[i] =" + itest[i]);
		//���⼭ itest[i] �� int Ÿ��
		
		for(int i=0;i<itest.length;i++) {
			int temp = itest[i];
			System.out.println("i ="+i +",itest[i] =" + temp);
		}
		for(int i=0;i<stest.length;i++)
			System.out.println("s ="+i +",stest[i] =" + stest[i]);
		//���⼭ stest[i]�� String Ÿ��
//		�ڵ��Ҷ� ȿ������ ���̱� ���� ���� for(for each) ��� : �� itest[i] stest[i]�� ����Ҷ�
		
		System.out.println("itest �迭��");
		for(int temp:itest)
			System.out.println(temp);
		
		System.out.println("\n stest �迭��");
		for(String temp : stest)
			System.out.println(temp);
		
		
		
		
		
		
	}

}

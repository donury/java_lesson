package koreait.day06;

import java.util.Scanner;

public class C34_StringArray {

	public static void main(String[] args) {
		String message = "hi java!"; //message�� ������ ����
		
		String [] engKey = {"continue","break","public","static","dynamic"};
		System.out.println(engKey);
		
		//int ,double ,char �迭������ ��Ҹ� ��Ÿ���� nums[2], carr1[2], point[2]
		//										�� �⺻�� ������ Ÿ��
		//engKey �Ӹ� �ƴ϶� engKey[2]���� ������ Ÿ��
		System.out.println(engKey[2]);
		for(int i=0;i<engKey.length;i++)
			System.out.println(engKey[i]); //��Ʈ�� Ÿ�� ������
		
		String []koreans =new String[5];	//�迭 ����� ���� �⺻�� ������ ����X, ������ ����
		for(int i=0;i<koreans.length;i++)	//�⺻ �ʱⰪ�� ?null (�ƹ��͵� �������� ���� ����)
			System.out.println(koreans[i]);
			
		for(int i=0;i<engKey.length;i++)
			System.out.println(engKey[i]+":"+engKey[i].length());
		
		koreans[0]="����ϴ�.";
		koreans[1]="���ߴ�.";
		koreans[2]="������";
		
		for(int i=0;i<koreans.length;i++)
			if(koreans[i] !=null)	///
			System.out.println(koreans[i]+":"+koreans[i].length());
		
			//�����ϰ� �ִ� ��ü�� ������ �޼ҵ�/�ʵ� �����ϸ� ����	: koreans[3],koreans[4]�� null ����
		
//		String temp=null;
//		System.out.println(temp.length());
		
		Scanner sc =new Scanner(System.in);
		System.out.print("static ��? >>>" );
		koreans[3]=sc.nextLine();
		System.out.print("dynamic ��? >>> ");
		koreans[4]=sc.nextLine();
		System.out.println("3. ��� �Էµ� koreans �迭");
		
		for(int i=0;i<koreans.length;i++)
		System.out.println(koreans[i]);
		
		//����ڰ� �Է��� ����ܾ engKey �迭 �ε����� �������
		System.out.println("ã�� �ܾ�� >>>");
		String find =sc.nextLine();
		
		int i;
		for(i=0; i<engKey.length;i++) {
			if(find.equals(engKey[i]))
				break; //
		}
		
		System.out.println("ã�� �ܾ� ��ġ : "+ i);
		if(i==engKey.length)//?
			System.out.println("ã�� �ܾ engKey �� �����ϴ�.!");
		else
			System.out.println("�ѱ� �� : "+koreans[i]);
		
		
		
		
//		int index=-1;	//�ε��� ������ ������� �ʴ� ��� �����غ���.
//		for(int i=0;i<engKey.length;i++) {
//			if(find.equals(engKey[i])) { 
//			
//				index=i;	
//				break;
//			
//		}
//		}
//		System.out.println("ã�� �ܾ� ��ġ : "+index);
//		if(index==-1)
//		System.out.println("ã�� �ܾ engKey�� �����ϴ�.");
//		else 
//		System.out.println("�ѱ� �� : "+koreans[index]);
	}

}

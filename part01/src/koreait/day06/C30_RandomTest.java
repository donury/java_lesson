package koreait.day06;

import java.util.Random;

public class C30_RandomTest {
//���� �߻��ϴ� Random Ŭ������ �޼ҵ带 �׽�Ʈ �մϴ�.
	public static void main(String[] args) {
		Random r=new Random();// Random Ŭ������ ��ü ����(new ����)
		
		System.out.println("1.������ ������ 10�� ���");	// 
		for(int i=0;i<10;i++) {
			int inum =r.nextInt();	//int ���������� ������ ����ϴ�
			System.out.println(inum); 
		}
			System.out.println("1.������ ������ 10�� ��� - bound(��谪) ");	
			for(int i=0;i<10;i++) {
				int inum =r.nextInt(100);	//0<= ���� <100 ���������� ������ ����ϴ�	
			System.out.println(inum); 
		
			}
		System.out.println("3. Ư�� ������ ������ 10�����");
		System.out.println("1.������ ������ 10�� ��� - bound(��谪) ");	
		for(int i=0;i<10;i++) {
			int inum =r.nextInt(100)+1;	//0<= ���� <101 ���������� ������ ����ϴ�	
		System.out.println(inum); 
	
		}
		//n���� ũ�ų� ���� m���� ���� ���� ���� : r.nextInt(m-1)+n
		System.out.println("4. 2~45 �ζ� ��ȣ ������ ������ ���� 10��"); //n=2,m=46
		for(int i=0;i<6;i++) {
			int inum=r.nextInt(44)+2;	//0<=���� <44 -> 2<= ����<46
			System.out.println(inum);
			
		}
	}	
		
		
	
	}


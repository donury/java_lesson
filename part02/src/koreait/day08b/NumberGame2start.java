package koreait.day08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame2start {

	public static void main(String[] args) {
		Random r = new Random(); 
		Scanner sc = new Scanner(System.in);
		int max =10;	//�õ�ȸ��
		int [] triallst = new int [max];
		GameValue [] history = new GameValue[10];
		int k=0;			//history �迭�� �ε��� ����
		
			System.out.println("���� ���߱� ���� �����մϴ�. �� ��ǻ�ʹ� ���ڸ� �����߽��ϴ�.");
			System.out.print("������ �����Ϸ��� �� �޸��� �̸��� ���ÿ�>>>");
			String gamer=sc.nextLine();
			int rmin=11,rmax=29;
			do {
			GameValue temp = new GameValue(gamer);
			System.out.println("���� ���߱� ���� �����մϴ�. �� ��ǻ�ʹ� ���ڸ� �����߽��ϴ�.");
			System.out.println(String.format("��, �޸��� ���纸����.(���� %d~%d)", rmin,rmax));
		int numComputer =GameValue.makeNumber(rmin, rmax);	  //������    	 101<=������ <299
		int numHuman;					
		int i=0;
			
		do {
			System.out.print("������ ���� �Է� (��ȸ : "+(max-i)+ ")->");
			numHuman =sc.nextInt();
		if(numComputer >numHuman) {  //������> �Է°�
			triallst[i]=numHuman;	//���� ������>�Է°�  [i] ����Ǵ� ��
			i++;					
			System.out.println("�ƴմϴ�. �� ū�� �Դϴ�.");
		}else if(numComputer <numHuman) {
			triallst[i]=numHuman;
			i++;
			System.out.println("�ƴմϴ�. �� ���� ���Դϴ�.");
		
		}
		if(i==max)	break;
		}while(numComputer !=numHuman);
		//numComputer == numHuman �̸� ���� �����,
	     if(i==max) {
		System.out.println("�� �޸� �Է� ���� : "+Arrays.toString(triallst));
		System.out.println("�־��� ��ȸ�� �� ���̽��ϴ�. ������ �ٽ� �����ϼ���!![���� "+numComputer +"]");
		temp.setCount(max);
	     }else {
		System.out.println("������~ ���߼̽��ϴ�. �������� �õ� Ƚ�� : "+(i+1));
		temp.setCount(i+1);
		temp.setSuccess(true);
	     
	     history[k]=temp;	//temp�� GameValue ��ü�� ������(�ּ�)
	     k++;		//���� �ε�����, ī��Ʈ ��Ȱ
	     System.out.println("������ ����Ͻðڽ��ϱ�? ��� �Ϸ��� 0 �Է� >>> ");
		}
			}while(sc.nextInt()==0);

			System.out.println("::::::::���� ���ھ�::::::::");
			//for �ݺ����� history �迭�� ����� �� ����ϱ�
			for(int j=0;j<k;j++)
				history[j].print();	//history j Ÿ���� GameValue
			System.out.println("::::::::the end:::::::::");
		
}
}

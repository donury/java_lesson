package koreait.day03;

import java.util.Scanner;

public class C11_Boolean {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean result;
		result= 10>5;
		System.out.println("10> 5��� : "+result);
		System.out.println("9!=9 ��� : "+ (9!=9));
		System.out.println("9==9 ��� : "+ (9==9));
		
		int korean,math; 
		System.out.println("������ ��� Ȯ���ϱ� : and");
		System.out.println(" true and true = " + (true && true));
		System.out.println(" true and false = " + (true && false));
		//�Ʒ��� 2�� ������ ù��° ���� false �̹Ƿ� �ι�° ���� don't care ������� ��� false
		System.out.println(" false and true = " + (false && true));
		System.out.println(" false and false = " + (false && false));
		
		System.out.println("������ ��� Ȯ���ϱ� : or");
		//�Ʒ��� 2�� ������ ù��°���� ture�̹Ƿ� �ι�° ���� ������ true
		System.out.println(" true or true = " + (true || true));
		System.out.println(" true or false = " + (true || false));
		System.out.println(" false or true = " + (false || true));
		System.out.println(" false or false = " + (false || false));

		System.out.println("������ ��� Ȯ���ϱ� : not");
		System.out.println(" not ture = " + !true);    //true ���� �ݴ�(not)������ �ٲ�
		System.out.println(" not false = " + !false);

		Scanner sc =new Scanner(System.in);	
		System.out.print("���� ���� �Է� ->  ");
		korean=sc.nextInt();
		
		System.out.print("���� ���� �Է� ->  ");
		math=sc.nextInt();
		//���������� �������� ��� 80�� �̻��ΰ�? ->����л�s
		System.out.println("��� �л� ? " + (korean>=80 && math>=80));
		
		//�������� �Ǵ� �������� �� 90�� �̻��� �ִ°�? ->Ư���л�
		System.out.println("Ư�� �л� ? " + (korean>=90 || math>=90));
		//���������� 20~80�� �ƴ� �л���? ->Ư���� �л�
		System.out.println("Ư���� �л� "+ !(korean>=20 && korean <=80)); // 17 80

		sc.close();
	
	
	}
	

}
	/* 
	 * �������� �⺻ ���� : boolean�� true �Ǵ� false ���� ���� ���� . (boolean ���� Ŭ���� �ֽ��ϴ�.
	 * 
	 *���迬�� == (���� ����) , != (���� �ʴ�), >, < >= ,<= �� ������ ���� boolean����
	 *������ &&(and,�׸���) , ||(or, �Ǵ�) , !(not) 
	 *���� : if, for ���� �ʿ��� ���ǽĿ� ���迬���� ���˴ϴ�.
	 */ 

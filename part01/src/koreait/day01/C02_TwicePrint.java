package koreait.day01;

public class C02_TwicePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ʈ���̽�");
		System.out.println("�̸�\t�������\t\t ����");
		System.out.println("=========================");
		System.out.println("�糪\t1996.12.29\t27");
		System.out.println("��ȿ\t1997.02.01\t26");
		System.out.println("�̳�\t1998.03.24\t25");
		//printf()�޼ҵ� ����ؼ� ������������մϴ�.
		//12ĭ ���ڿ� ��� +�ڸ��� ������ ���ڿ�+5ĭ����
		//%s�� ������ ĭ���� �����ʸ��� , -��ȣ�� ���ʸ��� 
		System.out.printf("%-12s%s%5d\n","dayeon","1998.05.28",25);
		System.out.printf("%-12s%s%5d\n","momo","1999.04.23",24);
		System.out.printf("%-12s%s%5d\n","nana","1997,06,14",27);
		
		//printf �޼��忡�� ���Ĺ��� ������ŭ �ڿ� ������ ������ ������ ��ġ�ؾ���
		//System.out.printf("%-12s%s%5d\n","nana","1997,06,14");
		//printf �޼��忡�� ���Ĺ��� ������ŭ �ڿ� ������ ������ ������ ��ġ�ؾ���
		//System.out.printf("%-12s%5d\n","nana","1997,06,14");
		System.out.println("//////////����///////////");
		System.out.printf("%-12s %4d.%02d.%2d\t%.1f\n","dayeon",1998,5,28,2555.55);
		System.out.printf("%-12s %4d.%02d.%2d%5d\n","momo",1999,4,23,24);
		//��������� �����͸� ���� ���ͷ��� ǥ���ؼ� ����߽��ϴ�.
		//�������� : ����(�����͸� �����ϰ� �ִ� ������ �̸�) ���
//		System.out.printf("%-12s %4d.%02d.%2d%5d\n","nana",1997,6,14,27);
		//%����s ������ ���� %-���� ���ʸ��� 
	}
/*
 * ��¿� ���Ǵ� ����
 * 
 * \(��������) ����ϴ� �̽����������� : \n(�ٹٲ�),\t(tab)
 * ������������ %��ȣ ��� : %s(���ڿ�) , %d(����) �ڸ����� �����ؼ� ������ �ִ�.
 *			�� �����ڸ� 0���� ä��� ������ %03d �̷������� �ϱ� 
 */
}

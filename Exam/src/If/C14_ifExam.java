package If;

import java.util.Scanner;

public class C14_ifExam {

	public static void main(String[] args) {
		//if(���ǽ�) {..} else if {....}
				/*
				 * ���� ���θ� �����ø�
				 * ���� ������ �ݾ��� 10���� �̻��̸� ������ ���űݾ��� 10%  0.1
				 * 				��7����				   9%  0.09
				 * 				��4����					7% 0.07
				 * 				���� ���ϴ� 					3%	0.03	
				 */		
		String name;
		name="�̸���";
		int buy;
		double mile;
		Scanner sc =new Scanner(System.in);
		System.out.println(name +"���Բ��� �����Ͻ� �� �ݾ��� \n"
							+ "	������ �����ϴ� : " );
		buy=sc.nextInt();
		System.out.printf("���űݾ� : %d%s",buy,"��\n");
		
		if(100000<=buy) {
			mile=buy*0.1;
		}else if(70000<=buy) {
				mile=buy*0.09;
			}else if(40000<=buy) {
				mile=buy*0.07;
				
			} else {
				mile=buy*0.03;
			}
		System.out.printf("���� �����Ͻ� �ݾ��� �������� : %.0f%s",mile,"���Դϴ�");

	}

}

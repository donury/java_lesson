package koreait.day02;

public class C08_Test {

	public static void main(String[] args) {
		//���ؿ�
		//�簢�� ���̱��ϱ�
		int width = 23 , height = 19 , box_area = width * height;
		System.out.printf("%s\n %s %d %s \n %s %d %s \n %s %d %s \n",
							"[�簢�� ������ ���� ���ϱ�]",
							"����: ",23,"cm",
							"���� : ",19,"cm",
							"���̸� ���߽��ϴ�. -> ", box_area,"��");	

			System.out.println();
		//�� ����, �ѷ�
		double half=23.230 , round= 2*3.14*half, circle_area=3.14*half*half;
		System.out.printf("%s \n %s %.3f %s \n%s %.3f %s \n %s %.3f %s",
							"[�� ������ ���̿� �ѷ� ���ϱ�]",
							"������ : ", half,"cm",
							"�ѷ��� ���߽��ϴ�.-> ",circle_area, "��",
							"���̸� ���߽��ϴ�. -> ",round,"��");
		System.out.println();
		//final �׽�Ʈ :
		//	�������� �տ� final(������) Ű���带 ���̸� ���� �������� ���Ѵ�.
		
		final int test =123;
		System.out.println(test);
	}
	
	
}

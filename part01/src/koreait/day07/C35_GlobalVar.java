package koreait.day07;

public class C35_GlobalVar {
	/*
	 * [������ ����� ��ġ]
	 * ��������(local variable) 		: �޼ҵ�,for if,while ��� {} ���� ����� ����. ����� ����� ������� ����.
	 * �������� (global variable) 		: Ŭ����{ } ���� ����� ����
	 * 
	 * [���������� static ���η� ����]
	 * Ŭ���� �̸�.������
	 * ��ü�� ���� ����ϴ� this.������(�̶� ������ �ν��Ͻ� ����)
	 * 
	 * ���������� Ŭ���� �Ǵ� ��ü�� Ư���� ��Ÿ���� �ʵ�(�Ǵ� ������Ƽ)��� �θ��ϴ�.field property
	 * 
	 */
	int count;	//��������
  String message;
  	static int num;
  	static double point;
  	static final int Test=9999;	//static final�� ��� .�������� ������ ����
	public static void main(String[] args) {	//**static�� static�� �����մϴ�.**
			int num=10;	//main ������ ���
			System.out.println("num = "+num);	//10
//			System.out.println("message = "+ message);	//���� : static�� �ƴ� ������ ������
			methodb();
			
	}
	
	public  void methodA() {
			int num=99;	// �޼ҵ忡���� ���
			System.out.println("num = "+num);	//99
			System.out.println("message = "+ message);	//���������� ����� messgae
	}
	//***�߿�
	public void methodC(int count) {
		this.count=count;		//this�� new�� ������� ��ü. methodc �޼ҵ带 �����Ű�� ��ü.
	}
	public static void methodb() {
		int num=99;	// �޼ҵ忡���� ���
		//���������� �������� �̸��� ���� ���. ���������� �����ɴϴ�.
		System.out.println("num = "+num);	//99
		System.out.println("num = "+C35_GlobalVar.num);		//���������� ����� messgae. ���������� �����̸��� ���� ���
	//static �϶��� Ŭ���� �̸�.������/static�� �ƴҶ��� this.������
	}
}

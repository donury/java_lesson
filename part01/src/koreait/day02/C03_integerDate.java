package koreait.day02;

class  C03_integerDate{

	public static void main(String[] args) {
		
		System.out.println("Byte ����������===============");
		System.out.println("�޸� ũ��: " + Byte.BYTES);
		System.out.println("Byte ������ �ִ밪:" +Byte.MAX_VALUE);
		System.out.println("Byte ������ �ּҰ�:" +Byte.MIN_VALUE);
		
		System.out.println("Short ���������� ==============");
		System.out.println("�޸� ũ��:"+ Short.BYTES);
		System.out.println("Short ������ �ּҰ�:" +Short.MIN_VALUE);
		System.out.println("Short ������ �ִ밪:" +Short.MAX_VALUE);
		
		System.out.println("Integer ���������� ==============");
		System.out.println("�޸� ũ��:"+ Integer.BYTES);
		System.out.println("Integer ������ �ּҰ�:" +Integer.MIN_VALUE);
		System.out.println("Integer ������ �ִ밪:" +Integer.MAX_VALUE);
		
		System.out.println("Long ���������� ==============");
		System.out.println("�޸� ũ��:"+ Long.BYTES);
		System.out.println("Long ������ �ּҰ�:" +Long.MIN_VALUE);
		System.out.println("Long ������ �ִ밪:" +Long.MAX_VALUE);

	}

}
	//���� ������ �⺻������ byte, short,intlong 4�����̸�
	//		������ �޸𸮿� �Ҵ�޴� ũ��(����Ʈ ����)�� �׿� ���� ���� ���� ������ �����˴ϴ�.
	//		�������� ������ �� ����� Ű����(���Ǿ�뵵�� ������ �ܾ�)
	//byte, short , Integer, Long Ŭ���� ���� ������ ������ �ٷ�� �Ӽ��� �޼ҵ带 ���� Ŭ����(WRAPPER ���� Ŭ����)
	//		�������� �� Ŭ�������� ��������� �Ӽ�(�ʵ�)�� �� ������ �ʴ� ��(���)�Դϴ�. ��ü�� �빮�ڷ� ǥ���մϴ�.
//				��	BYTES , MIN_VALUE, MAX_VALUE
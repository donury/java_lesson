package koreait.day11;
/*�߻�Ŭ���� : ��ü�� ������������ �ʴ� ������ Ŭ���� �Դϴ�. new ���� ����.
�߻�޼ҵ带 ���� �ֽ��ϴ�. �߻�(abstract): ��üȭ���� ���� ����.
�θ�Ŭ�������� ��üȭ���� ���� �߻�޼ҵ带 �ڽ�Ŭ������ ������(�������̵�)�ϵ��� �ϴ� ���Դϴ�.
����: '���'�� �߻�ȭ����. '�����' ��üȭ�� ��ü
	���߻�Ŭ���� ������ �߻�ȭ �Ȱ��� ��ü�� ������ ����.
�߻�޼ҵ带 �������� �ڽ�Ŭ������ �����ؼ� ��ü�� �����մϴ�.
*/
public abstract class ClassAbs {

	protected String name;	//�ڽ� Ŭ������ �ٸ���Ű�������� ���� ����
	//�߻�޼��� : �ڽĵ��� �������ϵ��� ���ĸ� �����մϴ�. {} body, ��ü �����ϴ�.
	public abstract void test();
	
	//�ν��Ͻ� �޼ҵ�
	public void print() {
		System.out.println("name ="+name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

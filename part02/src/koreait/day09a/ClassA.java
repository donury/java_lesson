package koreait.day09a;

/*Ŭ������ ���
 * -> Ŭ���� ���� �θ�(����Ŭ����, super)  �ڽ�(����Ŭ����)������� ��������ϴ�.
 * ->�θ��� Ŭ���� ������Ҹ� �ڽ��� ����� �� �ֽ��ϴ�. ��ӵǴ� ��Ҵ� �ʵ�,�޼ҵ�
 * ->extends Ű���� ���
 * ->private ���������ڴ� ��Ӿȵ˴ϴ�.
 * ->protected�� �ٸ� ��Ű���� �ڽ� Ŭ������ ��ӹ��� �� �ֵ��� �մϴ�.
 * ->���Ǽ��迡�� �ݷ��������� �. ������ ������ ���ؼ� Ŭ������ ����.������ ������ ��û����. ��,�����,�ܽ���,������,�䳢  ...->�ϳ��� �׷����� �ܼ�ȭ ��Ŵ  �������� ��Ҹ� ����
 * ->��������Ұ� �ƴѰ��� �ٸ� Ŭ������ ����(��, cat,dog,rabbit,...) �׸��� animal Ŭ������ ��ӹ޽��ϴ�.
 * 
 */
public class ClassA { //�θ� Ŭ����
	int ab;
	String name;
	protected String title;	//protected�� ����Ʈ ���� �������̳� �ڽ�Ŭ������ ���ܷ� ���
	
	
	

	public int getAb() {
		return ab;
	}




	public void setAb(int ab) {
		this.ab = ab;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}




	void print() {
		System.out.println("ab = "+ ab);
		System.out.println("name = "+ name);
	}
	
	

		


}

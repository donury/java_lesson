package koreait.day12;

import java.util.ArrayList;

public class C47_MemberTest {

	public static void main(String[] args) {
		//member [] member =new member[10]; ������ ��Ȱ
		ArrayList <Member> list =new ArrayList<>();	//����Ʈ�� ����Ǵ� ���� ��ü�� ������.
		//<>���ʸ� = �������� 
		//����Ʈ�� �����ϴ� �����͸� ���(Element)��� �մϴ�.
		//�ֿ� �޼ҵ� get,add, remove,size (������ Ÿ���϶� �������ΰ͵�)
		list.add(new Member("���",27));
		Member member =new Member("����", 26);
		list.add(member);
		list.add(new Member("����",20));
		list.add(new Member("�ź�",22));
		System.out.println("���� list�� ��� ����:" + list.size());
		System.out.println("1.��ü ����Ʈ ���");
		System.out.println(list);
		
		System.out.println("list�� ��� �� age �ʵ尪�� 25���� �ΰ͸� ����غ���");	//for��
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getAge()<=25)
				System.out.println("i="+i +","+ list.get(i));
		}
		System.out.println("3. ������ ��� �ε������� �����ϰ� �ִ� ��ü�ΰ�?");
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals("����"))	//.equals("����")
				System.out.println("������ "+ i+"��°�ε����� ���� �ϰ� �ֽ��ϴ�");
			
		}
		//����Ʈ ��Ұ� �������� �ʵ�� ���� ��ü�̸� �ʵ尪 ���ϴ� equals �����Դϴ�.
									//indexof�� String, �⺻ ����Ŭ�������� ����
		System.out.println("Member ��ü�� indexof ���� : "+ list.indexOf(new Member("����",20)));
		//indexof�� ��ã��
		System.out.println("Member ��ü�� indexof ���� : "+ list.indexOf(member));
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals("����")&&list.get(i).getAge()==20)	//.equals("����")
				System.out.println("������ "+ i+"��°�ε����� ���� �ϰ� �ֽ��ϴ�");
	}
}
}
package koreait.day13a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import koreait.day12.Member;
import koreait.day13.MemberAgeDescending;
import koreait.day13.MemberAgescending;

public class C55_ListTest {

	public static void main(String[] args) {
		//List�� �������̽�, ArrayList�� ����ü
		//������ : List�� ����Ÿ������ �Ͽ� �����մϴ�. ������ ��� ���̺귯������ ListŸ������ ���մϴ�.
		
		
		List<Integer> ilist =new ArrayList<>();	//List
		List<String> slist =new ArrayList<>();
		
		ilist.add(34);
		ilist.add(77);
		ilist.add(19);
		ilist.add(56);
		ilist.add(45);
		ilist.add(9);
		//{34 77 19 56 45 9 }
System.out.println("sort ���� :"+ilist);
//���� : ��������
ilist.sort(null); 
				//���ڷ� �ʿ��� ���� ���� comparator ����ü �ʿ��մϴ�
				  // �⺻�� String �� null�� �Ҽ� �ֽ��ϴ�. (��������)
System.out.println("sort ���� :"+ilist);
ilist.sort(Comparator.reverseOrder());
System.out.println(ilist);

	slist.add("Ʈ���̽�");
	slist.add("�����̰�");
	slist.add("�������");
	slist.add("�����");
	slist.add("�ҳ�ô�");
	slist.add("����ũ");
	System.out.println(slist);
	slist.sort(null);
	System.out.println(slist);	//ASEC ��������
	slist.sort(Comparator.reverseOrder());
	System.out.println(slist);	//DSEC ��������
	
	List<Member>mlist	=new ArrayList<>();
	mlist.add(new Member("momo",23));
	mlist.add(new Member("nana",27));
	mlist.add(new Member("nayeon",25));
	mlist.add(new Member("dahyeon",29));
	mlist.add(new Member("sooni",26));
	mlist.add(new Member("jenny",27));
//	mlist.sort(null); Member ��ü�� ���� �� ���� ��ü -> ���� �������̽��� ���ڷ� �ؾ���.
		//	Member ��ü�� sort : �� ������ ������ �ʵ� �� �ϳ��� �����ؼ� ���� (comparator)	����ü ����ϴ�.
	
	System.out.println("member ����Ʈ ���� :" + mlist);
	mlist.sort(new MemberAgescending());
	System.out.println(mlist);
	mlist.sort(new MemberAgeDescending());
	System.out.println(mlist);
	
	System.out.println("\n2. comparable �������̽� ����ϴ� sort");
	List<User>ulist = new ArrayList<User>();
	ulist.add(new User("��� ",23));
	ulist.add(new User("����",27));
	ulist.add(new User("���� ",25));
	ulist.add(new User("���� ",29));
	ulist.add(new User("���� ",26));
	ulist.add(new User("����",27));
	System.out.println("User ����Ʈ ���� : "+ulist);
//User�� ���� �� �ִ� Ÿ�� : Comparable ����ä�� �񱳰���
	
	ulist.sort(null);
	System.out.println("user sort :"+ulist);
	ulist.sort(Comparator.reverseOrder());
	System.out.println("user sort ��������:"+ulist);
	
	ulist.sort(new Comparator<>() {
		@Override
		public int compare(User o1, User o2) {
			return o1.getName().compareTo(o2.getName());
		}
	});
	System.out.println(ulist);
	}
	

}

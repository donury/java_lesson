package koreait.day13;

import java.util.Comparator;

import koreait.day12.Member;

	public class MemberAgeDescending implements Comparator<Member>{
		 
		@Override
		public int compare(Member o1, Member o2) {
	Integer age1= o1.getAge();
	Integer age2= o2.getAge();
	//age �ʵ尪�� ���� �� name �ʵ� ������������ ����.
		if(age1==age2)
			return o1.getName().compareTo(o2.getName());
		else return age1.compareTo(age2); //��������
		}

		
	}


package koreait.day07;

import java.util.Arrays;

//37�� ��ȣ����
public class Singer {
/*
 * Ŭ���� ���� �ϴ� ���� ���Ǽ����� �����͸� ó���ϱ� ���� ������ ����
 * 
 * 
 * 
 * 
 */

	//singer ��ü�� ��������� ���� �ٸ� �� :�ν��Ͻ� �ʵ� 
String gener;	//�帣
String name_eng;
String name_kor;
int debut_year;
String[]members ;	//�׷��� ��� ����̸��� ����

static final String JOB="������";
static String label="�ڡ�";	//singer ���Դ� ��� ������ ��ǥ��.���氡���� ����

 void printMembers() {
	if(members==null)
		System.out.println("�׷��� �ƴ� �ַ� ���� �Դϴ�.");
	else
		for(int i=0;i<members.length;i++) {
		if(members[i]!=null)
			System.out.println((i+1)+":"+members[i]);
	}
}
int actYears(int year) {	//year ���� Ȱ���Ⱓ ���
	
	return year-debut_year+1;
}
@Override
public String toString() {
	return "Singer [gener=" + gener + ", name_eng=" + name_eng + ", name_kor=" + name_kor + ", debut_year=" + debut_year
			+  "]";
}


}



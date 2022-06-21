package koreait.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C70_Stringsplit {
public static void main(String[] args) {
	
	//String Ŭ������ split �޼ҵ�	�޼ҵ� : ����Ÿ���� String[]
	
	String temp ="��� 90 88 79";
	String [] result= temp.split(" ");	//������ �������� ���ڿ��� �������� �ɰ���
	System.out.println("1. �ݺ��� ���� ���");
	System.out.println("index 0 :" + result[0] );
	System.out.println("index 0 :" + result[1] );
	System.out.println("index 0 :" + result[2] );
	System.out.println("index 0 :" + result[3] );

	//fot������
	System.out.println("2.�Ϲ����� for�� ���");
	for(int i=0; i<result.length;i++) 
		System.out.println(String.format("result[%d] :%s", i,result[i]));
	
	//�׻�� for��
	System.out.println("3. ���� for�� ���");
	for(String t : result)
		System.out.println("result ��� :" + t );

	String temp2="���,90,88,79";
	result =temp2.split(",");
	System.out.println("4. ���� for�� ���");
	for(String t : result)
		System.out.println("result ��� :" + t );
	
	
	temp2="���,90 88()79";
	result =temp2.split("[ ,()]");
	System.out.println("5. ���� for�� ���");
	System.out.println("Result length : "+ result.length);
	for(String t : result)
		System.out.println("result ��� :" + t );
	//result[1], result[3],result[5] 3���� �� ���ڿ��Դϴ�. 
	
	result =temp2.split(",,");
	System.out.println("6. ���� for�� ���");
	System.out.println("Result length : "+ result.length);
	for(String t : result)
		System.out.println("result ��� :" + t );
	
	//Split�� ������ ���ڿ��� ���Խ�regex ���ڿ��Դϴ�.(���Խ� ������ ����.��ƽ��ϴ�)
	//  	���Խ� ���� :[] �ȿ� ǥ���ϴ� ���� ���� �������� �Ǵ� or�� �ش��մϴ�.
	
	temp2=" ���,90,88,79";
	result =temp2.split(",",2);
	//lemit �� ���ϵǴ� �迭�� ũ��, �� �ɰ����� �������� Ŀ������ ����.
	System.out.println("8. spilt �ι�° ���� limit Ȯ��");
	System.out.println("Result length : "+ result.length);
	for(String t : result)
		System.out.println("result ��� :" + t );

	//�迭�� ������ �ڷᱸ�� : list
	result = temp2.split(",");
	System.out.println("9.result �迭�� list ��ü�� ����");
	List<String>rlist =Arrays.asList(result);
	System.out.println(rlist);
	System.out.println("rlist size :"+ rlist.size());
	
	for(String t: rlist)
		System.out.println("rlist ��� : " + t);
	
	//�߰� Ȯ��/���� ����
//	rlist.add("test");		//����:����Ʈ
//	rlist.add(2,"100");		//����
	//������ List�� �����
	//���ڰ� �ִ� ����Ʈ
	System.out.println("10.");
	List<String> rlist2 =new ArrayList<String>(rlist);
	System.out.println(rlist2);
	rlist.add("test");
	rlist.remove(2);
	rlist.add(2,"100");
	System.out.println(rlist2);

	//Arrays.aslist�� �׽�Ʈ������ ����� ����Ʈ ���鶧 ���
	List<Integer>ilist =Arrays.asList(1,2,6,9,100);
	System.out.println("11.Arrays.asList Ȱ��");
	System.out.println(ilist);

}

}

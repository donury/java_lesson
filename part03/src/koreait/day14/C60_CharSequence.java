package koreait.day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class C60_CharSequence {

	public static void main(String[] args) {
////CharSequence �������̽� ����ü : String ,StringBuffer,StringBuilder 
			String result = new String();	//result ="test" ; result = new String("test");
			System.out.println("1. String Ÿ�� �׽�Ʈ");
			for(int i=2;i<6;i++) {
				//���ڿ� ������ �ٲ�� ���ڿ� ��ü ��ġ�� �޶���
				result += i + "/";	//result = result + (i+ "/");
				System.out.println("result :" + result);
			}
			StringBuffer sb= new StringBuffer();
			System.out.println("2.StringBuffer Ÿ�� �׽�Ʈ");
			for(int i=2;i<6;i++) {
				sb.append(i).append(":");
				//StringBuffer ��ü�� ���ڿ� ������ �ٲ� ���� ��ü�� �߰��Ǵ� ������ �մϴ�.
				//�ݺ��Ǵ� ���� ������ ���� ��� ���۰� �� ȿ����
			System.out.println("ab : "+sb);
			}
			
			//CharSequence  �������̽� ��� : contains�޼ҵ��� �Ű����� Ÿ��.
			String sample = "abc2/3/4/5/xyz";
			System.out.println("3. contains �޼ҵ� Ȯ��");
			System.out.println("result"+sample.contains(result));
			System.out.println("sb" + sample.contains(sb));
			//�޼ҵ��� ���� �Ǵ� �ٸ� ���� ���ĵ��� Ȯ���� �� : 1)Ŭ���� or �������̽� 2)�������̽��϶� ����ü�� �����ΰ�?
			//���� : ArrayList �����Ҷ� List �������̽� Ÿ������ �սô�.
			//HashMap "				map   	" 
			List<String>names = new ArrayList<>();
			names=new Vector<>();
			Map<String,Integer>map = new HashMap<>();
			map= new TreeMap<String,Integer>(); 
	}
	
}

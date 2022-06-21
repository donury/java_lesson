package koreait.day12;

import java.util.ArrayList;
import java.util.Arrays;


public class C46_ArrayList {

	public static void main(String[] args) {

			int [] datas = {45,23,7,21,19,11,44};	//�迭�� �����Ҷ� �迭�� ũ�⸦ ���մϴ�.
													//�迭�� �⺻�� ������Ÿ�� int,double,long.... 
			ArrayList <Integer> list =new ArrayList<>();
					//ArrayList�� ũ�Ⱑ �����Դϴ�.
					//������ Ÿ���� �׻� �������Դϴ�.	�⺻���� ����Ŭ������ ����մϴ�.
					//<E>�� ���ʸ� Ÿ���̶�� �θ��ϴ�.������ ����� Ÿ���� ���մϴ�.	Generic
			
			String [] names= {"����","���","�ź�","����","����"};
			ArrayList<String> name_list=new ArrayList<>();
	
			//ArrayList�� ����Ƽ �߰��� add() �޼ҵ�
			list.add(45);
			list.add(7);
			list.add(21); list.add(19);list.add(11);list.add(44);
			System.out.println("1.ù��° ArrayList ���");
			System.out.println(list);
			System.out.println("���� (�迭 _" +Arrays.toString(datas)+"�迭�� ũ�� "+datas.length);
			System.out.println("����Ʈ�� ũ�� : "+ list.size());
			name_list.add("����");
			name_list.add("����");
			name_list.add("���");
			name_list.add("����");
			System.out.println("2.�ι�° ArrayList<String> ���");
			System.out.println(name_list);	//��ü�� ������⶧���� null�� �ƴ�
			System.out.println("����Ʈ�� ũ�� : "+ name_list.size());//�����Ͱ� ���� ��,0
			
			System.out.println("3.Ư�� ��ġ�� ������ �߰� ");
			list.add(1, 23);  //�ε��� ũ�⺸�� �۾ƾ���
			System.out.println("add(1,23) "+ list);
			name_list.add(2, "�ź�");
			System.out.println("add(2,\"�ź�\")"+ name_list);
			
			System.out.println("4. �迭ó��  index ������ ������ ��������");
			System.out.println("get(3) :"+ list.get(3));
			System.out.println("get(3) :"+ name_list.get(3));
			
			System.out.println("5. Ư�� ��ġ�� ������(���) ����");
			list.remove(4);
			System.out.println("remove(4) ���:"+list);
			name_list.remove(4);
			System.out.println("remove(4) ��� :"+name_list);
			
			System.out.println("\n6. Ư�� �� ��ġ�� �˾Ƴ��� (�ź�� ��� �ε���)");
			System.out.println("�迭 : "+ Arrays.binarySearch(names, "�ź�"));
			System.out.println("����Ʈ :"+ name_list.indexOf("�ź�"));
			
			System.out.println("\n7. 6���� ���೻������ for������ �Ѵٸ�");
			System.out.println("�迭");
			int i;
			for(i=0;i<names.length;i++)
				if(names[i].equals("�ź�"))
					break;
			System.out.println("�ź�� �ε��� :"+ i);
			System.out.println("����Ʈ");
			for(i=0;i<name_list.size();i++)
				if(name_list.get(i).equals("�ź�"))
						break;
					
			System.out.println("�ź�� �ε��� :"+ i);
			//"�ź� " ��Ұ� �������϶� lastindexof�޼ҵ�� ��ġ ��Ҹ� ã�� �� �ֽ��ϴ�.
			
			System.out.println("\n8. contaions �޼ҵ�");
			System.out.println("������ ����Ʈ�� �ִ��� :"+name_list.contains("����"));
					System.out.println("��� ����Ʈ�� �ִ��� :"+name_list.contains("����"));
	}

}

	
/*�迭 : ���� ���� �����͸� �����ϴ� ���
*
*�÷��� (Collections) :�ڷᱸ��. ���� ���� �����͸� �����ϴ� ���̰� ������ Ư¡�� ����
*								 ����(����,�б�/����)�ϴ� ���̰� �ִ�.
*								�����͸� ����/���� ���� �˰������� �޼ҵ�� �����Ǿ� �ֽ��ϴ�.
*				��ArrayList Ŭ����
*				��HashMap Ŭ����
*
*
*
*
*/
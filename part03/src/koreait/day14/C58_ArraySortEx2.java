package koreait.day14;

public class C58_ArraySortEx2 {
	//�迭�� ����� �� �����ϱ� ���� �����ϼ���.
	public static void main(String[] args) {
		String [] names = {"����","����","����","�ź�","����","���"};
		for(int i=0;i<names.length-1;i++) {
			for(int k=i+1; k<names.length;k++) {
				if(names[i].compareTo(names[k])>0) {
				String temp=names[i];
				names[i]=names[k];
				names[k]=temp;
				}
			}
			}
		for(int i=0;i<names.length;i++) {
			System.out.printf("\t%s",names[i]);
		}

	
	}
	
}
	

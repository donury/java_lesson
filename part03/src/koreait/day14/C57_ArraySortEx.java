package koreait.day14;

public class C57_ArraySortEx {
	//배열에 저장된 값 정렬하기 직접 구현하세요.
	public static void main(String[] args) {
		int [] sum = {34,77,19,56,45,9};
		for(int i=0;i<sum.length-1;i++) {
			for(int k=i+1; k<sum.length;k++) {
				if(sum[i]>sum[k]) {
				int temp=sum[i];
				sum[i]=sum[k];
				sum[k]=temp;
				}
			}
			}
		for(int i=0;i<sum.length;i++) {
			System.out.printf("%5d",sum[i]);
		}

	
	}
	
}
	

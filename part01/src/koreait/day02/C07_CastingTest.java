package koreait.day02;

public class C07_CastingTest {

	public static void main(String[] args) {

		//���Թ� : ������ ��(���ͷ�)/����/������ ���� ������ ���� .���Ŀ� ���Ǵ� ������ ������ �����ϴ�.
		//������� +,-,*,/(������),%(������ ������)
		//���迬��	==(����,����), !=(���� �ʴ�.), > , < , >=, <=
		//������ &&(and,�׸���) , ||(or, �Ǵ�) , !(not) 
		
		//�������� integer
		int a = 123, b = 10;
		double c=10.34;
		
		int isum;
		double dsum;
		
		isum = a + b;
		dsum = a + c ;
		
		System.out.println("a + b = "+isum);
		System.out.println("a + c = "+dsum);
		
//		isum = a + c ;	//����� �Ǽ��̹Ƿ� �������� ������ ���� ���մϴ�. : ����
		
//		����ȯ (Casting,ĳ����): ���� + �Ǽ� ����� �� ���� ������ ���� �ؾ� �Ѵٸ�. ����ȯ�� �ϰ� ���ض�		
//			->���α׷��Ӱ� �����ؼ� ������ ����ȯ  -> ()�ȿ� ��ȯ��ų �����ۼ�
	isum = a + (int)c ;	//c������ �Ǽ����� ������ ��ȯ
	
	System.out.println("a + (int)c = "+ isum);
		
	System.out.println(" a / b = "+(a/b));//�������� ������ �������
	System.out.println(" a % b = "+(a%b));//�������� �������� ������
	
	System.out.printf("%d / %d =  %d\n",a,b,a/b);
	System.out.printf("%d %% %d = %d\n",a,b,a%b);
	
	int aa=123,bb=10;
	int aaa= aa/bb , bbb=aa%bb;
	
	System.out.println("�� ="+aaa +"������ = "+bbb);
	
	//��������ȯ (ĳ���� Casting) ���� : �������� ������ ����� �Ǽ��� ���ϰ� �ʹٸ�....
	b=11;
	double fsum = a /b ; 
	System.out.println(fsum);
	System.out.printf("%d / %d =  %f\n",a,b,a/(double)b);	//�Ǽ� ���Ĺ��� %f /�⺻ 6�ڸ�  
	System.out.printf("%d / %d =  %.1f\n",a,b,a/(double)b);	//�Ҽ��� ���� 1�ڸ��� ����  (�ݿø�)

	double test = 12.3456123456789;
	System.out.println("test = "+ test);
	System.out.printf("test = %f \n",test);
	System.out.printf("test = %.15f",test);
		

	}
}

package koreait.day09;

import java.util.Random;
import java.util.Scanner;

public class C43_RedPenExam2 {
//c42���� mathproblem Ŭ������ ����ϴ� ������ �ٲٱ� : ������ ����.
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Random r = new Random();
		int size=5;		//��������
//		int max_size=MathProblem.max_size;
		MathProblem[]problems =new MathProblem[size];
		//��� ���� �����ϴ� �迭
	
		int ans;
		int cnt=0;
		System.out.println("-----------------------------");
		System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
		System.out.println("-----------------------------");
		System.out.println("�����մϴ�.");
		for(int i=0;i<size;i++) {
			MathProblem temp=new MathProblem('+');
			temp.makeProb(); 	 			//n1,n2���� ��ü�� �ʵ�� ��������
//			System.out.print("���� "+(i+1)+". " + temp.getN1() + "+ "+temp.getN2()+"= �� �Է� -> ");
			System.out.print("���� "+(i+1)+"."+temp.problem()+"�� �Է� -> ");
			ans=sc.nextInt();
			
			if(ans ==temp.showAnswer() ) { //����� ��. ���� ���� count
				
				cnt++;	//���� ����
				temp.setCorrect(true);
			}
			problems[i]=temp;
		}
		System.out.println("--------------------------------------------");
		System.out.println("ä�� �մϴ�. ���� ����"+(cnt)+"("+(cnt*100/size)+"��)");
		for(int i=0;i<problems.length;i++)
			if(!problems[i].isCorrect())		//Ʋ������
			
				System.out.println("���� "+(i+1)+"."
				+problems[i].problem()+problems[i].showAnswer());
		
		/*for(MathProblem temp:problems ) 
			if(!temp.isCorrect())	
					System.out.println(temp.problem()+temp.showAnswer());
		*/
		
		sc.close();
	}
//�߰� : ����ڰ� �Է��� ans�� �����ؼ� ���� ��½� ���� �����ְ� �ʹٸ�?
	
}
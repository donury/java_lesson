package koreait.day12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//�ۼ��� ���ؿ�
public class C48_MathList {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	int size =5;	//���� ����(�ݺ�Ƚ��)
	ArrayList<MathProblem>problems = new ArrayList<>();
	
	int ans;
	int cnt=0;
	System.out.println("-----------------------------");
	System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
	System.out.println("-----------------------------");
	System.out.println("�����մϴ�.");
	for(int i=0;i<size;i++) {
		MathProblem temp = new MathProblem('+');
		temp.makeProb(); 
		System.out.print("���� "+(i+1)+"."+temp.problem()+"�� �Է� -> ");
		ans=sc.nextInt();
		if(ans ==temp.showAnswer() ) { //����� ��. ���� ���� count		
			cnt++;	//���� ����
			temp.setCorrect(true);
		}
		problems.add(temp);//�迭 �ε��� i�� temp��ü �������� �����ض�	
	}
	
	System.out.println("--------------------------------------------");
	System.out.println("ä�� �մϴ�. ���� ����"+(cnt)+"("+(cnt*100/size)+"��)");
	for(int i=0;i<problems.size();i++)
		if(!problems.get(i).isCorrect())		//Ʋ������
			System.out.println("���� "+(i+1)+"."
			+problems.get(i).problem()+problems.get(i).showAnswer());
	sc.close();
	}
}


package koreait.day09;

import java.util.Random;
import java.util.Scanner;

public class C43_RedPenExam2 {
//c42번을 mathproblem 클래스를 사용하는 것으로 바꾸기 : 연산은 덧셈.
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Random r = new Random();
		int size=5;		//문제갯수
//		int max_size=MathProblem.max_size;
		MathProblem[]problems =new MathProblem[size];
		//모든 문제 저장하는 배열
	
		int ans;
		int cnt=0;
		System.out.println("-----------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("-----------------------------");
		System.out.println("시작합니다.");
		for(int i=0;i<size;i++) {
			MathProblem temp=new MathProblem('+');
			temp.makeProb(); 	 			//n1,n2값이 객체의 필드로 난수생성
//			System.out.print("문제 "+(i+1)+". " + temp.getN1() + "+ "+temp.getN2()+"= 답 입력 -> ");
			System.out.print("문제 "+(i+1)+"."+temp.problem()+"답 입력 -> ");
			ans=sc.nextInt();
			
			if(ans ==temp.showAnswer() ) { //정답과 비교. 맞은 갯수 count
				
				cnt++;	//맞은 갯수
				temp.setCorrect(true);
			}
			problems[i]=temp;
		}
		System.out.println("--------------------------------------------");
		System.out.println("채점 합니다. 맞은 갯수"+(cnt)+"("+(cnt*100/size)+"점)");
		for(int i=0;i<problems.length;i++)
			if(!problems[i].isCorrect())		//틀렸을떄
			
				System.out.println("문제 "+(i+1)+"."
				+problems[i].problem()+problems[i].showAnswer());
		
		/*for(MathProblem temp:problems ) 
			if(!temp.isCorrect())	
					System.out.println(temp.problem()+temp.showAnswer());
		*/
		
		sc.close();
	}
//추가 : 사용자가 입력한 ans를 저장해서 오답 출력시 같이 보여주고 싶다면?
	
}

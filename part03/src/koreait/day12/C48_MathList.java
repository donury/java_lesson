package koreait.day12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//작성자 이준엽
public class C48_MathList {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	int size =5;	//문재 갯수(반복횟수)
	ArrayList<MathProblem>problems = new ArrayList<>();
	
	int ans;
	int cnt=0;
	System.out.println("-----------------------------");
	System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
	System.out.println("-----------------------------");
	System.out.println("시작합니다.");
	for(int i=0;i<size;i++) {
		MathProblem temp = new MathProblem('+');
		temp.makeProb(); 
		System.out.print("문제 "+(i+1)+"."+temp.problem()+"답 입력 -> ");
		ans=sc.nextInt();
		if(ans ==temp.showAnswer() ) { //정답과 비교. 맞은 갯수 count		
			cnt++;	//맞은 갯수
			temp.setCorrect(true);
		}
		problems.add(temp);//배열 인덱스 i에 temp객체 참조값을 저장해라	
	}
	
	System.out.println("--------------------------------------------");
	System.out.println("채점 합니다. 맞은 갯수"+(cnt)+"("+(cnt*100/size)+"점)");
	for(int i=0;i<problems.size();i++)
		if(!problems.get(i).isCorrect())		//틀렸을떄
			System.out.println("문제 "+(i+1)+"."
			+problems.get(i).problem()+problems.get(i).showAnswer());
	sc.close();
	}
}


package koreait.day07;

public class C41_StudentScore {

	public static void main(String[] args) {

			Student [] stus =new Student[5];	//배열요소 5개, Student 객체 참조
			String [] names= {"이준엽","최민자","이상찬","이미옥","손흥민"};
			
			stus[0]=new Student();
			stus[0].name =names[0];
			stus[0].no=1;
			stus[0].grade=3;
			
			for(int i=1;i<stus.length;i++) {
				stus[i]=new Student();
				stus[i].name= names[i];
			stus[i].no=i+1;
			stus[1].grade =3;
			}
			
			// 확인을 위한 출력
				for(int i=1;i<stus.length;i++) 
				System.out.println(stus[i]);
			
				//각 생성된 Student 객체가 Score 객체를 필드로 갖도록 합니다.
				for(int i=0; i<stus.length;i++) {
					System.out.println(stus[i].name + "점수 입력하세요.");
					
					stus[i].score=new Score();
					stus[i].score.input();
					System.out.println(stus[i]);
					
					/*Score temp =new Score();
					temp.input();
					stus[i].score=temp;	//**
					
					System.out.println(stus[i]);
				*/
				}
				System.out.println("[[성적 통계]]");
				System.out.printf("%8s %10s %3s %s\n","번호","이름","총점","평균");
				for(int i=0;i<stus.length;i++)
				System.out.printf("%1d %10s %3d %5.1f\n",stus[i].no,stus[i].name,stus[i].score.sum(),stus[i].score.average());
				}
					
				
			
	}



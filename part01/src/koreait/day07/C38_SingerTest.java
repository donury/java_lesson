package koreait.day07;

public class C38_SingerTest {

	public static void main(String[] args) {

		Singer twice =new Singer();
		twice.name_eng="Twice";
		twice.name_kor="트와이스";
		twice.debut_year=2015;
		twice.gener="kpop-girlGroup";
		
		twice.members=new String[9];
		
		twice.members[0]="모모";
		twice.members[1]="나연";
		twice.members[2]="채연";
		twice.members[3]="쯔위";
		twice.members[4]="다현";
		twice.members[5]="정연";
		twice.members[6]="사나";
		twice.members[7]="지효";
		twice.members[8]="미나";
		
	
		System.out.println("twice members");
		twice.printMembers();
		System.out.println("활동기간 : "+ twice.actYears(2022)+"년");
		
		
		Singer beo=new Singer();
		beo.name_eng="BE'O";
		beo.name_kor="비오";
		beo.gener="hiphop";
		beo.printMembers();
		
		System.out.println(Singer.JOB+Singer.label);
		System.out.println(twice.toString());
		System.out.println(beo.toString());
		System.out.println(twice);
		System.out.println(beo);
		
	}

}

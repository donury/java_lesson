package koreait.day07;

public class C41_StudentScore {

	public static void main(String[] args) {

			Student [] stus =new Student[5];	//�迭��� 5��, Student ��ü ����
			String [] names= {"���ؿ�","�ֹ���","�̻���","�̹̿�","�����"};
			
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
			
			// Ȯ���� ���� ���
				for(int i=1;i<stus.length;i++) 
				System.out.println(stus[i]);
			
				//�� ������ Student ��ü�� Score ��ü�� �ʵ�� ������ �մϴ�.
				for(int i=0; i<stus.length;i++) {
					System.out.println(stus[i].name + "���� �Է��ϼ���.");
					
					stus[i].score=new Score();
					stus[i].score.input();
					System.out.println(stus[i]);
					
					/*Score temp =new Score();
					temp.input();
					stus[i].score=temp;	//**
					
					System.out.println(stus[i]);
				*/
				}
				System.out.println("[[���� ���]]");
				System.out.printf("%8s %10s %3s %s\n","��ȣ","�̸�","����","���");
				for(int i=0;i<stus.length;i++)
				System.out.printf("%1d %10s %3d %5.1f\n",stus[i].no,stus[i].name,stus[i].score.sum(),stus[i].score.average());
				}
					
				
			
	}



package koreait.day16;
//exception ó������� ���� �޼ҵ忡�� ���ǵɶ� �ٸ� ��� :
import java.io.File;	//io.input,output ����� ���õ� ��ɵ��� Ŭ����
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C68_FileWriteTest {
	//main �޼ҵ尡 throws Exception �Ѵٸ�
	public static void main(String[] args) {

		
	String filename ="C:\\donury05\\�ڹ��׽�Ʈ5.txt";	
	try {
		fileWrite2(filename);
		filename= "C:\\donury05\\�ڹ��׽�Ʈ6.txt";	
		fileRead(filename);
	}catch (FileNotFoundException e) {
		System.out.println("����� ���� ���� : "+e.getMessage());
		System.out.println("������ �����ϴ��� Ȯ���ֿ�");
		
	}
	}
	public static void fileWrite(String filename) {
		File file =new File(filename);
		PrintWriter pw = null;
		try {
		pw =new PrintWriter(file);	//file�� ������ ��ġ�� ����� ���� ��ü
		pw.println("��� 90 89 82");
		pw.println("���� 89 90 82");
		pw.println("���� 82 89 90");
		System.out.println("���� ����� �Ϸ�Ǿ����ϴ�.");	//system.out ǥ�� ���(�ܼ����)
	}	catch(FileNotFoundException e) {
		//��� ��ɿ��� ������ ������ �ڵ����� ������ ��������ϴ�.
		System.out.println("����� ���� �߻� : "+ e.getMessage());
	}finally {
	}	pw.close();
	
	}
	//���2:throws Ű����� �ش� exception ó���� ȣ���� ������ �ѱ��(���δ�)
	//		throw	�ڿ�, �� �����ؼ� �������� ������ �� �ֽ��ϴ�.
	//		Exception ó���ؾ� �� �޼ҵ尡 ���� ���ǵǰ� ���� �� �Ѱ����� ��� ó���� �� �ֽ��ϴ�.
	public static void fileWrite2(String filename) throws FileNotFoundException {
	
		File file =new File(filename);
		PrintWriter pw = null;
		pw =new PrintWriter(file);	//file�� ������ ��ġ�� ����� ���� ��ü
		pw.println("��� 90 89 82");
		pw.println("���� 89 90 82");
		pw.println("���� 82 89 90");
		System.out.println("���� ����� �Ϸ�Ǿ����ϴ�.");	//system.out ǥ�� ���(�ܼ����)
		pw.close();
	
	
	}
	public static void fileRead(String filename) throws FileNotFoundException{
		File file = new File(filename);
		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
	}


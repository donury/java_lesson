package koreait.day16;

import java.awt.FileDialog;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFrame;

public class C67_ResourceClose {

	public static void main(String[] args) {
		String filename ="C:\\donury05\\�ڹ��׽�Ʈ.txt";	
		String filename2="C:\\donury05\\�ڹ��׽�Ʈ2.txt";	
		
		File ifile =new File(filename);
		File ofile =new File(filename2);
		
		try{
			Scanner sc =new Scanner(ifile);PrintWriter pw=new PrintWriter(ofile);
		
		
			while(sc.hasNext()) {
				String temp=sc.nextLine();	//���Ͽ��� �о�� 1��
				System.out.println(temp);	//ǥ�����
				pw.println(temp);			//�������
			}
			System.out.println("���� ���� �Ϸ�");
			sc.close();pw.close();
		}catch(FileNotFoundException e) {
			System.out.println("����� ���� �߻� : "+e.getMessage());
			System.out.println("������ ������ �����ϴ�");
		}catch (Exception e) {
			System.out.println("�˼����� ���� :"+e.getMessage());
		}
		
	}		
		public static String fileDialogOpen() {
			// �ܼ� ��������� �����ϴ� ���α׷� : CLI(Command Line Interface)  <-> GUI(Graphic User Interface) 
			// �ڹٿ����� GUI �� ����� �ִ� Ŭ�������� �ֽ��ϴ�. �� �� �ϳ��� ���ϴ�ȭ���ڸ� ����մϴ�. ���̺귯���� awt,swing,javaFX ���� �ֽ��ϴ�.
			// Windows OS�� ���α׷����� window��� Ʋ �ȿ��� ��������µ� �ڹٿ����� �װ��� �������̶�� �մϴ�.
					
					JFrame f = new JFrame();  //���ϴ�ȭ���ڸ� ������ �����Ӱ�ü ����
					
					FileDialog fdr = new FileDialog(f,"���� ����",FileDialog.LOAD);	//���ϴ�ȭ���� ��ü ����
					fdr.setVisible(true);		//���� ��ȭ���� ���̱�
					
					String filename = fdr.getDirectory() + fdr.getFile(); 	//������ ������ ��ο� ���ϸ� ����
					System.out.println("������ ��ο� ���� : " + filename);
					System.out.println("������ ��� : " + fdr.getDirectory() + ",������ ����:" + fdr.getFile());
					
					
					FileDialog fdw = new FileDialog(f, "���� ����",FileDialog.SAVE);
					fdw.setVisible(true);
					System.out.println("������ ��ο� ���� : " + fdw.getDirectory() + fdw.getFile());

					return filename;
			
		}
		public static String fileDialogSava() {
			JFrame f = new JFrame();
			FileDialog fdr = new FileDialog(f,"���� ����",FileDialog.LOAD);	//���ϴ�ȭ���� ��ü ����
			fdr.setVisible(true);		//���� ��ȭ���� ���̱�
			
			String filename = fdr.getDirectory() + fdr.getFile();
			System.out.println("������ ��ο� ���� :"+filename);

			return filename;
	
		}
		
		
}

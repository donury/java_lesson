package koreait.day04;

public class C20_StringMethod {

	public static void main(String[] args) {
		
		String message = "hello~";	//java.lang.String (�⺻ ��Ű�� Ŭ����)
		int len = message.length();
		char temp =message.charAt(3);
		boolean isState =message.equals("Hello~");
		System.out.println("length() = "+len);
		System.out.println("charAt(3)="+temp);
		System.out.println("equals(\"Hello\") ="+isState);
		
		System.out.println(message.length());
		System.out.println(message.charAt(2));
		System.out.println(message.charAt(0));
		System.out.println(message.equals("hello~"));
	//���ϰ� ������?
		System.out.println("indexOf('e\')"+message.indexOf(3)); //1����ġ
		System.out.println("indexOf(\"lo\")"+message.indexOf("lo"));	//3����ġ
		String test= "hello~hello~";
		System.out.println("test.indexOf(\"lo\")="+test.indexOf("lo"));
		System.out.println("test.lastIndexOf(\"lo\")="+test.lastIndexOf("lo"));
		message.substring(2);		//String
		System.out.println("substring(2)"+message.substring(2)); //�κ����� : llo~
		message.substring(2,4);
		System.out.println("substring(2,4)"+message.substring(1,2));	//ll 2������ 2�� (4-2)
		//sub �����Ҽ� �ִ� ���ڴ� 0���� ~
		System.out.println("substring(1,4)"+message.substring(1,4));	//ll 2������ 2�� (4-2)
		message.replace("ll", "*@"); 	//String
		System.out.println("replace(\"ll\", \"*@\")=" +message.replace("ll", "*@"));//ġȯ : he*@o
		System.out.println("startsWith(\"H\");="+message.startsWith("H"));	//false
		System.out.println("endsWith(\"~\")=" +message.endsWith("~"));	//true

		
		
		//�޼ҵ� �����ε�(overloading) : �޼ҵ� �̸��� ���������� ���� ���ڰ��� ������ ������ �ٸ��� ���ǵ� ��.
		
		
		
		
//		String Ŭ������ �޼ҵ�� �����ϴ�. �ٿܿ�� ����ϴ� ���� �ƴϰ� �޼ҵ��� �̸�,����,���������� �����ؼ� ����մϴ�,
//		message.length();			//public int length()
//		message.charAt(0);			//public char charAt(int index)
		
//		message.equals("Hello~");	// public boolean equals(Object anObject),object ��� Ÿ��
		//message �� String Ÿ���̹Ƿ� object �� string���� �ؼ��մϴ�.
		
		
	}

}

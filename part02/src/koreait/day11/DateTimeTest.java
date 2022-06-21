package koreait.day11;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeTest {

	public static void main(String[] args) {
		//����ð� :ms,ns (1790��1��1�� ������ �������� �������� ī��Ʈ�� ���Դϴ�.)
		
		//1��.1���� �� ms�ϱ��?1��=1000ms(1ms=0.004��)
		//1�� =24�ð�* 60��*60�� *1000=result ������ �����غ�����.
		//1�� 365�� 
		int result =24*60*60*1000;
		System.out.println("1���� "+result+"ms�Դϴ�.");
		//int �����Ѿ�� ��ȯ�ʿ�
		System.out.println("1������ "+result*365L+"ms�Դϴ�.");

		DecimalFormat d=new DecimalFormat("###,###,###,###");
		System.out.println("1������ "+String.format("%15s", d.format(result*365L))+"ms�Դϴ�.");
	
	/*��¥�� �ð������� �ٷ�� �ڹ�Ŭ������ �����մϴ�.
	1)java.util.Date Ŭ����  2)java.util.Calendar Ŭ����
	3) java 8 ����  java.time.LocalDate(��¥) , LocalTime(�ð�) , LocalDateTime(��¥�� �ð�) Ŭ����
	4)java.sql.Date. Ŭ���� -������ ���̽� �ٷ궧 ���

	*/
		LocalDate currentDate =LocalDate.now();	//static �޼ҵ�� ��ü�� ����
		System.out.println("��¥Ȯ�� "+ currentDate);
		
		LocalTime currentTime =LocalTime.now();
		System.out.println("�ð�Ȯ�� : "+currentTime);
		
		LocalDateTime current =LocalDateTime.now();
		System.out.println("��¥�� �ð� Ȯ�� : "+ current);
		
		//of() �޼ҵ�� Ư�� �ð� �� ��¥ ��ü ����
		LocalDate mybirth = LocalDate.of(1993, 03, 29);
		System.out.println("�� ���� "+ mybirth);
		
		LocalTime mybirth_time	= LocalTime.of(10, 30);
		System.out.println("�� ź���ð� : "+mybirth_time);
		LocalDateTime mybirthday = LocalDateTime.of(1993, 03, 29, 10, 30);
		System.out.println("�� ź������ "+ mybirthday);
		//�� ���� Ŭ������ ��¥ ������ ���� ��� Ŭ������ �ֽ��ϴ�.(���� �¾�� ���,���,����? �̷���)
		
		Period between =Period.between(mybirth, currentDate	);
		System.out.println("���� �¾�� "+between.getYears() +"�� (years)");
		System.out.println("���� �¾�� "+between.getMonths()+ "����(months)");
		System.out.println("���� �¾�� "+between.getDays()+"�� (days)");
		
		System.out.println("�׽�Ʈ:"+ChronoUnit.DAYS.between(mybirth, currentDate)+"�� �������ϴ�.");
		//Duration Ŭ����
		//ChronoUnit Ŭ����
	}

}

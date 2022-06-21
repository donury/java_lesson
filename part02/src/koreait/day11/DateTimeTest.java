package koreait.day11;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeTest {

	public static void main(String[] args) {
		//현재시간 :ms,ns (1790년1월1일 자정을 기준으로 단위마다 카운트한 값입니다.)
		
		//1일.1년은 몇 ms일까요?1초=1000ms(1ms=0.004초)
		//1일 =24시간* 60분*60초 *1000=result 변수에 저장해보세요.
		//1년 365일 
		int result =24*60*60*1000;
		System.out.println("1일은 "+result+"ms입니다.");
		//int 범위넘어가면 변환필요
		System.out.println("1년일은 "+result*365L+"ms입니다.");

		DecimalFormat d=new DecimalFormat("###,###,###,###");
		System.out.println("1년일은 "+String.format("%15s", d.format(result*365L))+"ms입니다.");
	
	/*날짜와 시간형식을 다루는 자바클래스를 연습합니다.
	1)java.util.Date 클래스  2)java.util.Calendar 클래스
	3) java 8 버전  java.time.LocalDate(날짜) , LocalTime(시간) , LocalDateTime(날짜와 시간) 클래스
	4)java.sql.Date. 클래스 -데이터 베이스 다룰때 사용

	*/
		LocalDate currentDate =LocalDate.now();	//static 메소드로 객체를 생성
		System.out.println("날짜확인 "+ currentDate);
		
		LocalTime currentTime =LocalTime.now();
		System.out.println("시간확인 : "+currentTime);
		
		LocalDateTime current =LocalDateTime.now();
		System.out.println("날짜와 시간 확인 : "+ current);
		
		//of() 메소드로 특정 시간 및 날짜 객체 생성
		LocalDate mybirth = LocalDate.of(1993, 03, 29);
		System.out.println("내 생일 "+ mybirth);
		
		LocalTime mybirth_time	= LocalTime.of(10, 30);
		System.out.println("내 탄생시간 : "+mybirth_time);
		LocalDateTime mybirthday = LocalDateTime.of(1993, 03, 29, 10, 30);
		System.out.println("내 탄생일은 "+ mybirthday);
		//새 버전 클래스는 날짜 사이의 간격 계산 클래스가 있습니다.(내가 태어난지 몇년,몇달,몇일? 이런거)
		
		Period between =Period.between(mybirth, currentDate	);
		System.out.println("내가 태어난지 "+between.getYears() +"년 (years)");
		System.out.println("내가 태어난지 "+between.getMonths()+ "개월(months)");
		System.out.println("내가 태어난지 "+between.getDays()+"일 (days)");
		
		System.out.println("테스트:"+ChronoUnit.DAYS.between(mybirth, currentDate)+"일 지났씁니다.");
		//Duration 클래스
		//ChronoUnit 클래스
	}

}

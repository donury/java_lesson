package calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Date1 {
public static void main(String[] args) {
	
	Date today = new Date();
	System.out.println(today);
	
	SimpleDateFormat Format = new SimpleDateFormat();
	System.out.println(Format.format(today));
}
	
}
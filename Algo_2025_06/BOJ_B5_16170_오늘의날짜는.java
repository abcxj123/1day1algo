import java.util.Calendar;

public class BOJ_B5_16170_오늘의날짜는 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(cal.YEAR));
		System.out.println(String.format("%02d", cal.get(cal.MONTH)+1));
		System.out.println(String.format("%02d", cal.get(cal.DATE)));

	}

}

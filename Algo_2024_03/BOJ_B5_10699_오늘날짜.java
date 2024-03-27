import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BOJ_B5_10699_오늘날짜 {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

	}

}

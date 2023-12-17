import java.util.Scanner;

public class BOJ_B3_10824_네수 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		sb.append(scann.nextLong()).append(scann.nextLong());
		Long ans = Long.parseLong(sb.toString());
		
		sb.setLength(0);
		
		sb.append(scann.nextLong()).append(scann.nextLong());
		ans += Long.parseLong(sb.toString());
		
		System.out.println(ans);
		

	}

}

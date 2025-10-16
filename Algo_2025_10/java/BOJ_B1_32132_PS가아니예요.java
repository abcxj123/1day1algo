import java.util.Scanner;

public class BOJ_B1_32132_PS가아니예요 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		scann.nextLine();
		
		String s = scann.nextLine();
		
		while(s.contains("PS4") || s.contains("PS5")) {
			s = s.replaceAll("PS4", "PS");
			s = s.replaceAll("PS5", "PS");
		}
		
		System.out.println(s);

	}

}

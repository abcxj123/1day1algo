import java.util.Scanner;

public class BOJ_B5_32384_사랑은고려대입니다 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = scann.nextInt();
		
		for (int i = 0; i < N; i++) {
			sb.append("LoveisKoreaUniversity ");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());

	}

}

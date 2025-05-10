import java.util.Scanner;

public class BOJ_B5_25314_코딩은체육과목입니다 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N/4; i++) {
			sb.append("long ");
		}
		
		sb.append("int");
		
		System.out.println(sb.toString());

	}

}

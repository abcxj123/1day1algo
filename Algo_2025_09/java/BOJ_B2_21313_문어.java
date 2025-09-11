import java.util.Scanner;

public class BOJ_B2_21313_문어 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = Integer.parseInt(scann.next());
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
            if (i == N - 1 && N % 2 == 1) {
                sb.append("3"); 
            } else {
                sb.append((i % 2) + 1).append(" ");
            }
        }
		
		System.out.println(sb.toString());
		
	}

}

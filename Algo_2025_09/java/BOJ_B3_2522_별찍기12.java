import java.util.Scanner;

public class BOJ_B3_2522_별찍기12 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
	    StringBuilder sb = new StringBuilder();
	    
	    for (int i = 1; i <= N; i++) {
            for (int j = N - i; j > 0; j--) {
                sb.append(" ");
            }
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
	    
        for (int i = 1; i <= N-1; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append(" ");
            }
            for (int j = 1; j <= N-i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        
        System.out.print(sb.toString());
	}

}

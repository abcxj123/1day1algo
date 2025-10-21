import java.util.Scanner;

public class BOJ_B3_10992_별찍기17 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);

        int N = scann.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= N; i++) {
            for(int j = N; j > i; j--) {
                sb.append(" ");
            }

            if (i == N) {
                for(int j = 0; j < 2*i-1; j++) {
                    sb.append("*");
                }
            } else {
                for(int j = 0; j < 2*i-1; j++) {
                    if(j == 0 || j == 2*i-2) {
                        sb.append("*");
                    } else {
                        sb.append(" ");
                    }
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);

	}

}

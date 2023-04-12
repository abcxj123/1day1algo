import java.util.Scanner;

public class BOJ_B3_2490_윷놀이 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 3; i++) {
			int zero = 0;
			for (int j = 0; j < 4; j++) {
				int n = scann.nextInt();
				if(n == 0) zero++;
			}
			switch (zero) {
			case 0: {
				sb.append('E').append("\n");
				break;
			}
			case 1: {
				sb.append('A').append("\n");
				break;
			}
			case 2: {
				sb.append('B').append("\n");
				break;
			}
			case 3: {
				sb.append('C').append("\n");
				break;
			}
			case 4: {
				sb.append('D').append("\n");
				break;
			}
			default:
				break;
			}
		}
		
		System.out.println(sb.toString());

	}

}

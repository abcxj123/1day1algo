import java.util.Scanner;

public class BOJ_B3_2953_나는요리사다 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int max = 0;
		int maxIdx = 0;
		
		for (int i = 1; i <= 5; i++) {
			int sum = 0;
			for (int j = 0; j < 4; j++) {
				sum += scann.nextInt();
			}
			
			if(sum > max) {
				max = sum;
				maxIdx = i;
			}
		}
		
		System.out.println(maxIdx+" "+max);

	}

}

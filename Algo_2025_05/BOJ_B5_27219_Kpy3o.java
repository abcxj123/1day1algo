import java.util.Scanner;

public class BOJ_B5_27219_Kpy3o {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = scann.nextInt();
		
		for (int i = 0; i < N/5; i++) {
			sb.append('V');
		}
		
		for (int i = 0; i < N%5; i++) {
			sb.append('I');
		}
		
		System.out.println(sb.toString());

	}

}

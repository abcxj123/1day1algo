import java.util.Scanner;

public class BOJ_B4_30017_치즈버거만들기 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int A = scann.nextInt();
		int B = scann.nextInt();
		
		int min = Math.min(A-1, B);
		
		System.out.println(min*2+1);

	}

}

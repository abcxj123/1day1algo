import java.util.Scanner;

public class BOJ_B3_1267_핸드폰요금 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		int young = 0;
		int min = 0;
		
		for (int i = 0; i < N; i++) {
			int n = scann.nextInt();
			
			young += (n / 30) + 1;
			min += (n / 60) + 1;
			
		}
		
		young *= 10;
		min *= 15;
		
		if(young > min) {
			System.out.println("M "+min);
		} else if(young < min) {
			System.out.println("Y "+young);
		} else if(young == min) {
			System.out.println("Y M "+min);
		}

	}

}

import java.util.Scanner;

public class BOJ_B4_30031_지폐세기 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			int a = scann.nextInt();
			scann.nextInt();
			
			switch (a) {
			case 136:
				sum += 1000;
				break;
				
			case 142:
				sum += 5000;
				break;
				
			case 148:
				sum += 10000;
				break;
				
			case 154:
				sum += 50000;
				break;

			default:
				break;
			}
			
		}
		
		System.out.println(sum);

	}

}

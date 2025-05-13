import java.util.Scanner;

public class BOJ_B4_28295_체육은코딩과목입니다 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int sum = 0;
		
		for (int i = 0; i < 10; i++) {
			int n = scann.nextInt();
			
			switch (n) {
			case 1:
				sum += 90;
				
				break;
				
			case 2:
				sum += 180;
				
				break;
				
			case 3:
				sum += 270;
	
				break;

			default:
				break;
			}
		}
		
		sum %= 360;
		
		if(sum == 90) System.out.println("E");
		else if(sum == 180) System.out.println("S");
		else if(sum == 270) System.out.println("W");
		else System.out.println("N");

	}

}

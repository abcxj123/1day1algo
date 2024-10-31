import java.util.Scanner;

public class BOJ_B3_21866_추첨을통해커피를받자 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int [] score = {100, 100, 200, 200, 300, 300, 400, 400, 500};
		boolean check = true;
		int sum = 0;
		
		for (int i = 0; i < 9; i++) {
			int n = scann.nextInt();
			if(n > score[i]) {
				check = false;
				break;
			}
			
			sum += n;
		}
		
		if(!check) System.out.println("hacker");
		else if(sum < 100) System.out.println("none");
		else System.out.println("draw");

	}

}

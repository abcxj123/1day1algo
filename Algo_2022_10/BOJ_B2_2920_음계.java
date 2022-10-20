import java.util.Scanner;

public class BOJ_B2_2920_음계 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int past = scann.nextInt();
		boolean asc = true;
		boolean des = true;
		
		for (int i = 0; i < 7; i++) {
			int n = scann.nextInt();
			if(past + 1 == n) {
				des = false;
			} else if(past - 1 == n) {
				asc = false;
			} else {
				asc = false;
				des = false;
				break;
			}
			past = n;
		}
		
		if(asc) {
			System.out.println("ascending");
		} else if(des) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}

	}

}

import java.util.Scanner;

public class BOJ_B4_19944_뉴비의기준은뭘까 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int M = scann.nextInt();
		
		if(M <= 2) {
			System.out.println("NEWBIE!");
		} else if(M <= N) {
			System.out.println("OLDBIE!");
		} else {
			System.out.println("TLE!");
		}

	}

}

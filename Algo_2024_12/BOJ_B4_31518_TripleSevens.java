import java.util.Scanner;

public class BOJ_B4_31518_TripleSevens {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		boolean flag1 = true;
		
		for (int i = 0; i < 3; i++) {
			boolean flag2 = false;
			for (int j = 0; j < N; j++) {
				int n = scann.nextInt();
				
				if(n == 7) flag2 = true;
			}
			if(!flag2) flag1 = false;
		}	
		
		if(flag1) System.out.println("777");
		else System.out.println("0");

	}

}

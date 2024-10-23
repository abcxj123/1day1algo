import java.util.Scanner;

public class BOJ_B4_18408_3개의정수 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int one = 0;
		int two = 0;
		
		for (int i = 0; i < 3; i++) {
			int n = scann.nextInt();
			if(n == 1) one++;
			else two++;
		}
		
		if(one > two) System.out.println(1);
		else System.out.println(2);
	}

}

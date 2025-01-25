import java.util.Scanner;

public class BOJ_B5_29863_Arno_Schedule {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int a = scann.nextInt();
		int b = scann.nextInt();
		
		if(a >= 20 && a <= 23) b += 24;
		System.out.println(b-a);

	}

}

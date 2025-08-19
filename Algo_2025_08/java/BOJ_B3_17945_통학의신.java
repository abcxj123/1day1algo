import java.util.Scanner;

public class BOJ_B3_17945_통학의신 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int a = scann.nextInt();
		int b = scann.nextInt();
		
		int root = (int) Math.sqrt(a*a-b);
		int ans1 = (-1*a) - root;
		int ans2 = (-1*a) + root;
		
		if(ans1 == ans2) System.out.println(ans1);
		else System.out.println(ans1+" "+ans2);

	}

}

import java.util.Scanner;

public class BOJ_B4_26531_SimpleSum {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		String [] arr = scann.nextLine().split(" ");
		
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[2]);
		int c = Integer.parseInt(arr[4]);
		
		if(a+b == c) System.out.println("YES");
		else System.out.println("NO");

	}

}

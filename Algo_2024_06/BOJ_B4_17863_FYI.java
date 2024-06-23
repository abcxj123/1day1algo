import java.util.Scanner;

public class BOJ_B4_17863_FYI {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		String str = scann.nextLine();
		
		if(str.substring(0, 3).equals("555")) System.out.println("YES");
		else System.out.println("NO");

	}

}

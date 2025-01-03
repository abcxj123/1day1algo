import java.util.Scanner;

public class BOJ_B3_32297_문자열을만들어요 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		scann.nextLine();
		
		String str = scann.nextLine();
		
		if(str.indexOf("gori") != -1) System.out.println("YES");
		else System.out.println("NO");

	}

}

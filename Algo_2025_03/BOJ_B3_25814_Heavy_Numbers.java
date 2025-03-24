import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_B3_25814_Heavy_Numbers {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(scann.nextLine());
		
		String str1 = st.nextToken();
		String str2 = st.nextToken();
		
		int a = 0;
		int b = 0;
		
		for (int i = 0; i < str1.length(); i++) {
			a += str1.charAt(i) - '0';
		}
		
		for (int i = 0; i < str2.length(); i++) {
			b += str2.charAt(i) - '0';
		}
		
		a *= str1.length();
		b *= str2.length();
		
		if(a > b) System.out.println(1);
		else if(a < b) System.out.println(2);
		else System.out.println(0);

	}

}

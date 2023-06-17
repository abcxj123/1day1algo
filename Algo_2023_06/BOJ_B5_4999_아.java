import java.util.Scanner;

public class BOJ_B5_4999_아 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		String str1 = scann.next();
		String str2 = scann.next();
		
		int length1 = str1.length();
		int length2 = str2.length();
		
		if(length1 >= length2) {
			System.out.println("go");
		} else {
			System.out.println("no");
		}

	}

}

import java.util.Scanner;

public class BOJ_B5_27324_Same_Number {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		String str = scann.nextLine();
		
		if(str.charAt(0) == str.charAt(1)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}

}

import java.util.Scanner;

public class BOJ_B2_1076_저항 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		long res = 0L;
		long num = 0;
		
		for (int i = 0; i < 3; i++) {
			String str = scann.next();
			if(i == 0) {
				num += 10 * findColor(str, false);
			} else if(i == 1) {
				num += findColor(str, false);
			} else {
				res = num * findColor(str, true);
			}
			
		}
		
		System.out.println(res);

	}

	private static int findColor(String str, boolean isFinal) {
		if(!isFinal) {
			switch (str) {
			case "black":
				return 0;
			case "brown":
				return 1;
			case "red":
				return 2;
			case "orange":
				return 3;
			case "yellow":
				return 4;
			case "green":
				return 5;
			case "blue":
				return 6;
			case "violet":
				return 7;
			case "grey":
				return 8;
			case "white":
				return 9;
			default:
				return -1;
			}
		} else {
			switch (str) {
			case "black":
				return 1;
			case "brown":
				return 10;
			case "red":
				return 100;
			case "orange":
				return 1000;
			case "yellow":
				return 10000;
			case "green":
				return 100000;
			case "blue":
				return 1000000;
			case "violet":
				return 10000000;
			case "grey":
				return 100000000;
			case "white":
				return 1000000000;
			default:
				return -1;
			}
		}
	}

}

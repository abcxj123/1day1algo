import java.util.Scanner;

public class BOJ_B2_1550_16진수 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		String str = scann.next();
		
		int leng = str.length();
		int tmp = leng - 1;
		int res = 0;
		
		for (int i = 0; i < leng; i++) {
			char c = str.charAt(i);
			if(c >= 'A' && c <= 'F') {
				res += (c - 'A' + 10) * Math.pow(16, tmp--);
			} else {
				res += (c - '0') * Math.pow(16, tmp--);
			}
		}
		
		System.out.println(res);

	}

}

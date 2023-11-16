import java.util.Scanner;

public class BOJ_B1_27930_당신은운명을믿나요 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		String str = scann.next();
		
		String s1 = "KOREA";
		String s2 = "YONSEI";
		
		int idx1 = 0;
		int idx2 = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(c == s1.charAt(idx1)) {
				idx1++;
			}
			
			if(c == s2.charAt(idx2)) {
				idx2++;
			}
			
			if(idx1 >= 5) {
				System.out.println("KOREA");
				break;
			}
			
			if(idx2 >= 6) {
				System.out.println("YONSEI");
				break;
			}
		}

	}

}

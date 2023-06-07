import java.util.Scanner;

public class BOJ_B1_14405_피카츄 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		String str = scann.next();
		
		str = str.replaceAll("pi|ka|chu", "");
		
		if(str.length() == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}

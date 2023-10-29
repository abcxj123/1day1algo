import java.util.Scanner;

public class BOJ_B4_24883_자동완성 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		char c = scann.next().charAt(0);
		
		if(c == 'n' || c == 'N') {
			System.out.println("Naver D2");
		} else {
			System.out.println("Naver Whale");
		}

	}

}

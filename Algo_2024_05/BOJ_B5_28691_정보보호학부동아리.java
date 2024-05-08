import java.util.Scanner;

public class BOJ_B5_28691_정보보호학부동아리 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		char c = scann.nextLine().charAt(0);
		
		switch(c) {
		case 'M':
			System.out.println("MatKor");
			break;
			
		case 'W':
			System.out.println("WiCys");
			break;
			
		case 'C':
			System.out.println("CyKor");
			break;
			
		case 'A':
			System.out.println("AlKor");
			break;
			
		case '$':
			System.out.println("$clear");
			break;
			
		default:
			break;
		}

	}

}

import java.util.Scanner;

public class BOJ_B5_27889_특별한학교이름 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		String str = scann.nextLine();
		
		switch(str) {
		case "NLCS":
			System.out.println("North London Collegiate School");
			break;
		case "BHA":
			System.out.println("Branksome Hall Asia");
			break;
		case "KIS":
			System.out.println("Korea International School");
			break;
		case "SJA":
			System.out.println("St. Johnsbury Academy");
			break;
		}

	}

}

import java.util.Scanner;

public class BOJ_B5_28235_코드마스터2023 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		String str = scann.nextLine();
		
		switch(str) {
		case "SONGDO":
			System.out.println("HIGHSCHOOL");
			break;
			
		case "CODE":
			System.out.println("MASTER");
			break;
			
		case "2023":
			System.out.println("0611");
			break;
			
		case "ALGORITHM":
			System.out.println("CONTEST");
			break;
			
		default:	
			break;
		}

	}

}

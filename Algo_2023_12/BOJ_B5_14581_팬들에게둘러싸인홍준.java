import java.util.Scanner;

public class BOJ_B5_14581_팬들에게둘러싸인홍준 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		String name = scann.next();
		
		sb.append(":fan:").append(":fan:").append(":fan:");
		sb.append("\n");
		sb.append(":fan:").append(":"+name+":").append(":fan:");
		sb.append("\n");
		sb.append(":fan:").append(":fan:").append(":fan:");
		
		System.out.println(sb.toString());

	}

}

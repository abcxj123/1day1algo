import java.util.Scanner;

public class BOJ_B4_26561_Population {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = scann.nextInt();
		
		for (int i = 0; i < N; i++) {
			long p = scann.nextLong();
			long t = scann.nextLong();
			
			p += (-t/7) + t/4;
			
			sb.append(p+"\n");
		}

		if(sb.length() > 0) sb.setLength(sb.length()-1);
		
		System.out.println(sb.toString());
		
	}

}

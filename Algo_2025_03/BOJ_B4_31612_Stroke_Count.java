import java.util.Scanner;

public class BOJ_B4_31612_Stroke_Count {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		scann.nextLine();
		String s = scann.nextLine();

		int ans = 0;
		
		for (int i = 0; i < N; i++) {
			char c = s.charAt(i);
			
			if(c == 'o') ans++;
			else ans += 2;
		}
		
		System.out.println(ans);
		
	}

}

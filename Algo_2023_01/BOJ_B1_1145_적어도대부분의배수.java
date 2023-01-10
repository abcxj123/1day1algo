import java.io.IOException;
import java.util.Scanner;

public class BOJ_B1_1145_적어도대부분의배수 {

	public static void main(String[] args) throws IOException {
		Scanner scann = new Scanner(System.in);
		
		int n = 4;
		int cnt = 0;
		
		int [] arr = new int[5];
		
		for (int i = 0; i < 5; i++) {
			arr[i] = scann.nextInt();
		}
		
		while(true) {
			cnt = 0;
			for (int i = 0; i < 5; i++) {
				if(n % arr[i] == 0) cnt++;
			}
			if(cnt >= 3) break;
			n++;
		}
		
		System.out.println(n);

	}

}

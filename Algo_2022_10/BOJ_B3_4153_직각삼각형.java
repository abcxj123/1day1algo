import java.util.Arrays;
import java.util.Scanner;

public class BOJ_B3_4153_직각삼각형 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		while(true) {
			int a = scann.nextInt();
			int b = scann.nextInt();
			int c = scann.nextInt();
			
			if(a == 0 && b == 0 && c == 0) break;
			
			int [] arr = new int[3];
			arr[0] = a*a;
			arr[1] = b*b;
			arr[2] = c*c;
			
			Arrays.sort(arr);
			
			if((arr[0] + arr[1]) == arr[2]) System.out.println("right");
			else System.out.println("wrong");
		}

	}

}

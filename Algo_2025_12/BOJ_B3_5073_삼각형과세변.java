import java.util.Arrays;
import java.util.Scanner;

public class BOJ_B3_5073_삼각형과세변 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int [] arr = new int[3];
			
			for (int i = 0; i < 3; i++) {
				arr[i] = scann.nextInt();
			}
			
			if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;
			
			Arrays.sort(arr);
			
			if(arr[2] >= arr[0] + arr[1]) {
				sb.append("Invalid").append('\n');
			} else if(arr[0] == arr[1] && arr[1] == arr[2]) {
				sb.append("Equilateral").append('\n');
			} else if(arr[0] == arr[1] || arr[1] == arr[2]) {
				sb.append("Isosceles").append('\n');
			} else {
				sb.append("Scalene").append('\n');
			}
			
		}
		
		System.out.println(sb.toString());

	}

}

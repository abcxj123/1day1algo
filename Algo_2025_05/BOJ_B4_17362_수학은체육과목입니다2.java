import java.util.Scanner;

public class BOJ_B4_17362_수학은체육과목입니다2 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int [] arr = new int[] {1, 2, 3, 4, 5, 4, 3, 2, 1};
		int idx = (N-1) % 8;
		
		System.out.println(arr[idx]);

	}

}

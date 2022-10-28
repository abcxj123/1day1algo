import java.util.Arrays;
import java.util.Scanner;

class P implements Comparable<P> {
	int x;
	int y;
	
	public P(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int compareTo(P o) {
		if(this.y != o.y) {
			return Integer.compare(this.y, o.y);
		} else {
			return Integer.compare(this.x, o.x);
		}
	}
	
}

public class BOJ_S5_11651_좌표정렬하기2 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		P [] arr = new P[N];
		
		for (int i = 0; i < N; i++) {
			int x = scann.nextInt();
			int y = scann.nextInt();
			arr[i] = new P(x, y);
		}
		
		Arrays.sort(arr);
		
		for (P cur : arr) {
			System.out.println(cur.x+" "+cur.y);
		}

	}

}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_B2_2605_줄세우기 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		int N = scann.nextInt();
		
		for (int i = 0; i < N; i++) {
			int n = scann.nextInt();
			list.add(i-n, i+1);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int n : list) {
			sb.append(n+" ");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());

	}

}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_B3_2501_약수구하기 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int K = scann.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 1; i <= N; i++) {
			if(N % i == 0) list.add(i);
		}
		
		if(K > list.size()) System.out.println(0);
		else System.out.println(list.get(K-1));

	}

}

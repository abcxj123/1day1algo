import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_B1_3230_금메달은메달동메달은누가 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		int N = scann.nextInt();
		int M = scann.nextInt();
		
		for (int i = 1; i <= N; i++) {
			int rank = scann.nextInt()-1;
			list1.add(rank, i);
		}
		
		for (int i = M-1; i >= 0; i--) {
			int num = list1.get(i);
			int rank = scann.nextInt()-1;
			list2.add(rank, num);
		}
		
		int cnt = 0;
		
		for (int rank : list2) {
			if(++cnt > 3) break;
			System.out.println(rank);
		}
	}

}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_B2_21756_지우개 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		List<Integer> list = new ArrayList<>();
		
		for (int i = 1; i <= N; i++) {
			list.add(i);
		}
		
		while(list.size() != 1) {
			int max = list.size();
			int cnt = 0;
			
			for (int i = 0; i < max; i += 2) {
				list.remove(i-(cnt++));
			}
		}
		
		System.out.println(list.get(0));

	}

}

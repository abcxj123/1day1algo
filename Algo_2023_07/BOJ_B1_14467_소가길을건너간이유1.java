import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BOJ_B1_14467_소가길을건너간이유1 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		int cnt = 0;
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < N; i++) {
			int cow = scann.nextInt();
			int n = scann.nextInt();
			if(map.get(cow) == null) {
				map.put(cow, n);
			} else {
				int past = map.get(cow);
				if(past != n) {
					map.put(cow, n);
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);

	}

}

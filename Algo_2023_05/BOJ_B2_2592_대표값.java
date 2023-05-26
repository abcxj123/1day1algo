import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BOJ_B2_2592_대표값 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		Map<Integer, Integer> map = new HashMap<>();
		
		int sum = 0;
		
		for (int i = 0; i < 10; i++) {
			int n = scann.nextInt();
			sum += n;
			if(map.get(n) == null) {
				map.put(n, 1);
			} else {
				map.put(n, map.get(n)+1);
			}
		}
		
		int avg = sum / 10;
		int max = 0;
		int ans = 0;
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int key = entry.getKey();
			int value = entry.getValue();
			if(max < value) {
				max = value;
				ans = key;
			}
		}
		
		System.out.println(avg);
		System.out.println(ans);

	}

}

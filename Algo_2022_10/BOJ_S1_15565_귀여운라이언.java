import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_S1_15565_귀여운라이언 {
	// 1. 처음에 값을 검사할 때, 1이라면 list에 idx 값을 넣는다.
	// 2. list.get()을 K계단 떨어진 곳까지 차이를 구한다 ex) list.get(2)-list.get(0)+1;
	// 3. min값 갱신
	
	static int N, K;
	static int min = Integer.MAX_VALUE;
	static ArrayList<Integer> list = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(st.nextToken());
			if(n == 1) {
				list.add(i);
			}
		}
		
		for (int i = 0; i <= list.size()-K; i++) {
			int a = list.get(i);
			int b = list.get(i+K-1);
			int num = b - a + 1;
			min = Math.min(num, min);
		}
		
		if (min == Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(min);
		}

	}

}

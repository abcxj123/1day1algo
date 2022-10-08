import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BOJ_S1_2002_추월 {

	public static void main(String[] args) throws IOException {
		HashMap<String, Integer> map = new HashMap<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for (int i = 0; i < N; i++) {
			String car = br.readLine();
			map.put(car, i);
		}
		
		int [] out = new int[N];
		
		for (int i = 0; i < N; i++) {
			String car = br.readLine();
			out[i] = map.get(car);
		}
		
		for (int i = 0; i < N-1; i++) {
			for (int j = i+1; j < N; j++) {
				if(out[i]>out[j]) {
					cnt++;
					break;
				}
			}
		}
		
		System.out.println(cnt);

	}

}

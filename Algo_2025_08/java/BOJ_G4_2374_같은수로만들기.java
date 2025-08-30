import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ_G4_2374_같은수로만들기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		long ans = 0;
		int max = Integer.parseInt(br.readLine());
		
		Deque<Integer> stack = new ArrayDeque<>();
		stack.push(max);
		
		for (int i = 0; i < N-1; i++) {
			int n = Integer.parseInt(br.readLine());
			
			max = Math.max(max, n);
			int past = stack.pop();
				
			if(past <= n) ans += n - past;
			
			stack.push(n);
		}
		
		ans += max - stack.pop();
		
		System.out.println(ans);
	}

}

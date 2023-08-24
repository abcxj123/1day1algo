import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_S3_17952_과제는끝나지않아 {
	
	static class Task {
		int time;
		int score;
		
		public Task(int time, int score) {
			this.time = time;
			this.score = score;
		}
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int ans = 0;
		Stack<Task> stack = new Stack<>();
		Task now = new Task(0, 0);
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int type = Integer.parseInt(st.nextToken());
			if(type == 1) {
				if(now.score > 0) {
					stack.push(new Task(now.time, now.score));
				}
				int A = Integer.parseInt(st.nextToken());
				int T = Integer.parseInt(st.nextToken())-1;
				now.score = A;
				now.time = T;
			} else {
				if(now.time > 0) now.time--;
			}
			
			if(now.time == 0 && now.score > 0) {
				ans += now.score;
				now.score = 0;
				if(!stack.isEmpty()) {
					now = stack.pop();
				}
			}
			
		}
		
		System.out.println(ans);
		
	}

}

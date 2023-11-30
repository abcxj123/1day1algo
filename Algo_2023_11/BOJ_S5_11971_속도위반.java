import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_S5_11971_속도위반 {
	static class Section {
		int dist;
		int speed;
		
		public Section(int dist, int speed) {
			this.dist = dist;
			this.speed = speed;
		}
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int max = 0;
		
		Queue<Section> q1 = new ArrayDeque<>();
		Queue<Section> q2 = new ArrayDeque<>();
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int dist = Integer.parseInt(st.nextToken());
			int speed = Integer.parseInt(st.nextToken());
			q1.add(new Section(dist, speed));
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int dist = Integer.parseInt(st.nextToken());
			int speed = Integer.parseInt(st.nextToken());
			q2.add(new Section(dist, speed));
		}
		
		int d1 = 0;
		int s1 = 0;
		
		int d2 = 0;
		int s2 = 0;
		
		while(!q1.isEmpty() || !q2.isEmpty()) {
			if(d1 == 0) {
				Section p1 = q1.poll();
				d1 = p1.dist;
				s1 = p1.speed;
			}
			
			if(d2 == 0) {
				Section p2 = q2.poll();
				d2 = p2.dist;
				s2 = p2.speed;
			}
			
			max = Math.max(max, s2-s1);
			
			if(d1 > d2) {
				d1 -= d2;
				d2 = 0;
			} else if(d1 < d2) {
				d2 -= d1;
				d1 = 0;
			} else {
				d1 = 0;
				d2 = 0;
			}

		}
		
		System.out.println(max);
		
	}

}

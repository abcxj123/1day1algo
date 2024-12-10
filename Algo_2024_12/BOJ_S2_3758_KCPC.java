import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_S2_3758_KCPC {
	static class Team implements Comparable<Team> {
		int id;
		int score;
		int trial;
		int updated;
		
		public Team(int id, int score, int trial, int updated) {
			this.id = id;
			this.score = score;
			this.trial = trial;
			this.updated = updated;
		}

		@Override
		public int compareTo(Team o) {
			if(this.score == o.score) {
				if(this.trial == o.trial) {
					return Integer.compare(this.updated, o.updated);
				} else {
					return Integer.compare(this.trial, o.trial);
				}
			} else {
				return Integer.compare(o.score, this.score);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			int ID = Integer.parseInt(st.nextToken())-1;
			int M = Integer.parseInt(st.nextToken());
			
			int [][] score = new int[N][K];
			Team [] teams = new Team[N];
			
			for (int i = 0; i < N; i++) {
				teams[i] = new Team(i, 0, 0, -1);
			}
			
			for (int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine());
				
				int I = Integer.parseInt(st.nextToken())-1;
				int J = Integer.parseInt(st.nextToken())-1;
				int S = Integer.parseInt(st.nextToken());
				
				teams[I].score += Math.max(0, S-score[I][J]);
				score[I][J] = Math.max(score[I][J], S);
				
				teams[I].trial++;
				teams[I].updated = i;
			}
			
			Arrays.sort(teams);
			
			int rank = 1;
			for (int i = 0; i < N; i++) {
				if(teams[i].id == ID) break;
				rank++;
			}
			
			sb.append(rank+"\n");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
	}

}

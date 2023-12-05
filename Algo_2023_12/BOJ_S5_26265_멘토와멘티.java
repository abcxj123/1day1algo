import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_S5_26265_멘토와멘티 {
	static class Pair implements Comparable<Pair> {
		String mentor;
		String mentee;
		
		public Pair(String mentor, String mentee) {
			this.mentor = mentor;
			this.mentee = mentee;
		}

		@Override
		public int compareTo(Pair o) {
			if(!this.mentor.equals(o.mentor)) {
				return this.mentor.compareTo(o.mentor);
			} else {
				return o.mentee.compareTo(this.mentee);
			}
		}
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		List<Pair> list = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String mentor = st.nextToken();
			String mentee = st.nextToken();
			
			list.add(new Pair(mentor, mentee));
		}
		
		Collections.sort(list);
		
		StringBuilder sb = new StringBuilder();
		
		for(Pair p : list) {
			sb.append(p.mentor+" "+p.mentee+"\n");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Student implements Comparable<Student> {
	int country;
	int idx;
	int score;
	
	public Student(int country, int idx, int score) {
		this.country = country;
		this.idx = idx;
		this.score = score;
	}

	@Override
	public int compareTo(Student o) {
		return Integer.compare(this.score, o.score);
	}
	
}

public class BOJ_S5_2535_아시아정보올림피아드 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		List<Student> list = new ArrayList<>();
		
		int N = Integer.parseInt(br.readLine());
		int [] check = new int[N+1];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int country = Integer.parseInt(st.nextToken());
			int idx = Integer.parseInt(st.nextToken());
			int score = Integer.parseInt(st.nextToken());
			
			list.add(new Student(country, idx, score));
		}
		
		Collections.sort(list, Collections.reverseOrder());
		
		int cnt = 0;
		
		for(Student stu : list) {
			if(cnt == 3) break;
			
			if(check[stu.country] >= 2) continue;
			
			sb.append(stu.country+" "+stu.idx).append("\n");
			check[stu.country]++;
			cnt++;
		}
		
		System.out.println(sb.toString());

	}

}

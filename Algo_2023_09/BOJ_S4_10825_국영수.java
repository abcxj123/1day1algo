import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_S4_10825_국영수 {
	
	static class Student implements Comparable<Student> {
		String name;
		int K;
		int E;
		int M;
		
		public Student(String name, int k, int e, int m) {
			this.name = name;
			this.K = k;
			this.E = e;
			this.M = m;
		}

		@Override
		public int compareTo(Student o) {
			if(this.K != o.K) {
				return Integer.compare(o.K, this.K);
			} else if(this.E != o.E) {
				return Integer.compare(this.E, o.E);
			} else if(this.M != o.M) {
				return Integer.compare(o.M, this.M);
			} else {
				return this.name.compareTo(o.name);
			}
		} 
		
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Student [] arr = new Student[N];
		
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int K = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			arr[i] = new Student(name, K, E, M);
		}
		
		Arrays.sort(arr);
		
		for(Student now : arr) {
			System.out.println(now.name);
		}
		
	}

}

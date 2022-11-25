import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

class Num implements Comparable<Num> {
	int value;
	
	public Num(int value) {
		this.value = value;
	}
	
	public int compareTo(Num o) {
		int a = Math.abs(this.value);
		int b = Math.abs(o.value);
		if(a != b) {
			return Integer.compare(a, b);
		} else {
			return Integer.compare(this.value, o.value);
		}
	}
}

public class BOJ_S1_11286_절댓값힙 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Num> pq = new PriorityQueue<>();
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) {
				if(pq.isEmpty()) {
					sb.append(0).append("\n");
				} else {
					sb.append(pq.poll().value).append("\n");
				}
			} else {
				pq.add(new Num(n));
			}
		}
		
		System.out.println(sb.toString());

	}

}

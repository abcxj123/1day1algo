import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class P implements Comparable<P> {
	int x;
	int y;
	
	public P(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int compareTo(P o) {
		if(this.x != o.x) {
			return this.x - o.x;
		} else {
			return this.y - o.y;
		}
	}
	
}

public class BOJ_S5_11650_좌표정렬하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		P [] arr = new P[N];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			P p = new P(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			arr[i] = p;
		}
		
		Arrays.sort(arr);
		
		for (int i = 0; i < N; i++) {
			P p = arr[i];
			System.out.println(p.x+" "+p.y);
		}

	}

}

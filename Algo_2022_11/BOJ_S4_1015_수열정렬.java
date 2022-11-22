import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Num implements Comparable<Num> {
	int value;
	int idx;
	
	public Num(int value, int idx) {
		this.value = value;
		this.idx = idx;
	}
	
	public int compareTo(Num o) {
		return Integer.compare(this.value, o.value);
	}
}

public class BOJ_S4_1015_수열정렬 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Num [] arr = new Num[N];
		int [] ans = new int[N];
		int cnt = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(st.nextToken());
			arr[i] = new Num(n, i);
		}
		
		Arrays.sort(arr);
		
		for (int i = 0; i < N; i++) {
			Num num = arr[i];
			ans[num.idx] = cnt++;
		}
		
		for (int i = 0; i < N; i++) {
			System.out.print(ans[i]+" ");
		}
		
	}

}

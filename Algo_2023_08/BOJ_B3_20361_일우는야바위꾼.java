import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B3_20361_일우는야바위꾼 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int [] arr = new int[N+1];
		arr[X] = 1;
		
		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			int tmp = arr[A];
			arr[A] = arr[B];
			arr[B] = tmp;
			
		}
		
		for (int i = 1; i <= N; i++) {
			if(arr[i] == 1) {
				System.out.println(i);
				break;
			}
		}
		
		
	}

}

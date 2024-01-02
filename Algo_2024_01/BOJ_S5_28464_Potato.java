import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_S5_28464_Potato {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int a = 0;
		int b = 0;
		
		int [] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		if(N % 2 == 1) {
			b += arr[N-1];
			N--;
		}
		
		for (int i = 0; i < N/2; i++) {
			a += arr[i];
			b += arr[N-1-i];
		}
		
		System.out.println(a+" "+b);
		
	}

}

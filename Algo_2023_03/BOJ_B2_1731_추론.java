import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B2_1731_추론 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int [] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int a = arr[0];
		int b = arr[1];
		int c = arr[2];
		
		if((b-a) == (c-b)) {
			System.out.println(arr[N-1]+(b-a));
		} else {
			System.out.println(arr[N-1]*(b/a));
		}

	}

}

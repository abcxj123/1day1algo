import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_S5_20114_미아노트 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		
		char [] arr = new char[N];
		Arrays.fill(arr, '?');
		
		for (int i = 0; i < H; i++) {
			String str = br.readLine();
			for (int j = 0; j < N; j++) {
				if(arr[j] != '?') continue;
				for (int k = 0; k < W; k++) {
					char c = str.charAt(j*W+k);
					if(c != '?') {
						arr[j] = c;
						break;
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(char c : arr) {
			sb.append(c);
		}
		
		System.out.println(sb.toString());
		
	}

}

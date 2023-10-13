import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_S4_29791_에르다노바와오리진스킬 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int ans1 = 1;
		int ans2 = 1;
		
		int [] arr1 = new int[N];
		int [] arr2 = new int[M];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int last = arr1[0];
		for (int i = 1; i < N; i++) {
			if(last + 100 <= arr1[i]) {
				last = arr1[i];
				ans1++;
			}
		}
		
		last = arr2[0];
		for (int i = 1; i < M; i++) {
			if(last + 360 <= arr2[i]) {
				last = arr2[i];
				ans2++;
			}
		}
		
		System.out.println(ans1+" "+ans2);
		
	}

}

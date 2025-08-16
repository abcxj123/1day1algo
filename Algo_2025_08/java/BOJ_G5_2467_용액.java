import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_G5_2467_용액 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int [] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int ans1 = 0;
		int ans2 = 0;
		int ansSum = Integer.MAX_VALUE;
		
		Arrays.sort(arr);
		
		int left = 0;
		int right = N-1;
		
		while(left < right) {
			int sum = arr[left] + arr[right];
			int sumAbs = Math.abs(sum);
			
			if(sum == 0) {
				ans1 = arr[left];
				ans2 = arr[right];
				ansSum = 0;
				break;
			}
			
			if(sumAbs < ansSum) {
				ans1 = arr[left];
				ans2 = arr[right];
				ansSum = sumAbs;
			}
			
			if(sum < 0) {
				left++;
			} else {
				right--;
			}
			
		}
		
		System.out.println(ans1+" "+ans2);
		
	}

}

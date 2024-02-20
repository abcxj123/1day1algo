import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_S4_1812_사탕 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		int [] arr = new int[N];
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(i % 2 == 0) {
				sum += arr[i];
			} else {
				sum -= arr[i];
			}
		}
		
		int pastNum = sum / 2;
		sb.append(pastNum).append('\n');
		
		for (int i = 0; i < N-1; i++) {
			pastNum = arr[i] - pastNum;
			sb.append(pastNum).append('\n');
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}

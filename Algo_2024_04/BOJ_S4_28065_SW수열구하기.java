import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_S4_28065_SW수열구하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		int max = N;
		int min = 1;
		
		if(N % 2 == 0) {
			while(max >= min) {
				sb.append(max+" ");
				max--;
				if(max < min) break;
				sb.append(min+" ");
				min++;
			}
		} else {
			while(max >= min) {
				sb.append(min+" ");
				min++;
				if(max < min) break;
				sb.append(max+" ");
				max--;
			}
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
		
	}

}

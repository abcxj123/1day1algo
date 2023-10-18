import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_S5_21966_중략 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		if(N <= 25) {
			System.out.println(str);
		} else {
			StringBuilder sb = new StringBuilder();
			
			String mid = str.substring(11, N-11);
			
			boolean flag = true;
			for (int i = 0; i < mid.length()-1; i++) {
				char c = mid.charAt(i);
				if(c == '.') {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				sb.append(str.substring(0, 11));
				sb.append("...");
				sb.append(str.subSequence(N-11, N));
			} else {
				sb.append(str.substring(0, 9));
				sb.append("......");
				sb.append(str.substring(N-10, N));
			}
			
			System.out.println(sb.toString());
			
		}

	}

}

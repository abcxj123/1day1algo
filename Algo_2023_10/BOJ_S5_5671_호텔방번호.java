import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_S5_5671_호텔방번호 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
		
		while((str = br.readLine()) != null) {
			String [] arr = str.split(" ");
			int start = Integer.parseInt(arr[0]);
			int end = Integer.parseInt(arr[1]);
			int ans = 0;
			
			outer:
				for (int i = start; i <= end; i++) {
					String tmp = String.valueOf(i);
					int [] cnt = new int[10];
					for (int j = 0; j < tmp.length(); j++) {
						int n = tmp.charAt(j) - '0';
						if(cnt[n] > 0) {
							continue outer;
						} else {
							cnt[n]++;
						}
					}
					ans++;
					
				}
			
			sb.append(ans+"\n");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_S5_10431_줄세우기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			List<Integer> list = new ArrayList<Integer>();
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int tmp = Integer.parseInt(st.nextToken());
			int ans = 0;
			
			for (int i = 0; i < 20; i++) {
				int num = Integer.parseInt(st.nextToken());
				
				for(int n : list) {
					if(n > num) {
						ans++;
					}
				}
				
				list.add(num);
			}
			
			sb.append(t+" "+ans+"\n");
			
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
		
	}

}

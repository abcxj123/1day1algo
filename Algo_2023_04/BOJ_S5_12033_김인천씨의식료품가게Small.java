import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_S5_12033_김인천씨의식료품가게Small {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			int N = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
			List<Long> list = new ArrayList<>();
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N*2; i++) {
				list.add(Long.parseLong(st.nextToken()));
			}
			
			for (int i = 0; i < N; i++) {
				long sale = list.get(0);
				long origin = sale * 4 / 3;
				sb.append(sale+" ");
				int idx = list.indexOf(origin);
				list.remove(idx);
				list.remove(0);
			}
			
			sb.setLength(sb.length()-1);
			
			System.out.print("Case #"+t+": ");
			System.out.println(sb.toString());
		}
	}

}

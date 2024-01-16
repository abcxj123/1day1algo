import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_S5_11292_키큰사람 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int N = Integer.parseInt(br.readLine());
			
			if(N == 0) break;
			
			List<String> list = new ArrayList<String>();
			double max = -1;
			
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				String name = st.nextToken();
				double height = Double.parseDouble(st.nextToken());
				
				if(height > max) {
					list.clear();
					max = height;
					list.add(name);
				} else if(height == max) {
					list.add(name);
				}
				
			}
			
			for(String str : list) {
				sb.append(str).append(" ");
			}
			
			sb.setLength(sb.length()-1);
			sb.append("\n");
			
		}
		
		if(sb.length() > 0) {
			sb.setLength(sb.length()-1);
		}
		System.out.println(sb.toString());
		
		
	}

}

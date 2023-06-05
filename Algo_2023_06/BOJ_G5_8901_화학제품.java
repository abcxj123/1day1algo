import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class BOJ_G5_8901_화학제품2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			int [] material = new int[3];
			int [] price = new int[3];
			int max = 0;
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 3; i++) {
				material[i] = Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 3; i++) {
				price[i] = Integer.parseInt(st.nextToken());
			}
			
			int AB = Math.min(material[0], material[1]);
			
			for (int i = 0; i <= AB; i++) {
				int BC = Math.min(material[1] - i, material[2]);
				for (int j = 0; j <= BC; j++) {
					int CA = Math.min(material[0]-i, material[2]-j);
					int sum = i * price[0] + j * price[1] + CA * price[2];
					max = Math.max(max, sum);
				}
			}
			
			sb.append(max).append("\n");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}

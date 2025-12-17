import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B4_4714_Lunacy {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			Double before = Double.parseDouble(br.readLine());
			
			if(before < 0) break;
			
			String before2 = String.format("%.2f", before);
			String after = String.format("%.2f", before * 0.167);
			
			sb.append("Objects weighing ").append(before2).append(" on Earth will weigh ").append(after).append(" on the moon.\n");
		}
		
		System.out.println(sb.toString());
		
	}

}

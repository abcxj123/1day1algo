import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B5_30087_진흥원세미나 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			
			switch(str) {
			case "Algorithm":
				sb.append("204\n");
				break;
				
			case "DataAnalysis":
				sb.append("207\n");
				break;
				
			case "ArtificialIntelligence":
				sb.append("302\n");
				break;
				
			case "CyberSecurity":
				sb.append("B101\n");
				break;
				
			case "Network":
				sb.append("303\n");
				break;
				
			case "Startup":
				sb.append("501\n");
				break;
				
			case "TestStrategy":
				sb.append("105\n");
				break;
				
			}
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}

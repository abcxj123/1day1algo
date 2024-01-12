import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B2_4447_좋은놈나쁜놈 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			String [] arr = str.split(" ");
			
			int g = 0;
			int b = 0;
			
			for (int j = 0; j < arr.length; j++) {
				String str2 = arr[j].toLowerCase();
				for (int k = 0; k < str2.length(); k++) {
					if(str2.charAt(k) == 'g') {
						g++;
					} else if(str2.charAt(k) == 'b') {
						b++;
					}
				}
			}
			
			sb.append(str+" is ");
			
			if(g > b) {
				sb.append("GOOD").append("\n");
			} else if(g < b) {
				sb.append("A BADDY").append("\n");
			} else {
				sb.append("NEUTRAL").append("\n");
			}
			
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}

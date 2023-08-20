import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B2_2954_창영이의일기장 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String [] arr = br.readLine().split(" ");
		
		for (int i = 0; i < arr.length; i++) {
			String str = arr[i];
			
			for (int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				sb.append(c);
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					j += 2;
				}
			}
			
			sb.append(" ");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}

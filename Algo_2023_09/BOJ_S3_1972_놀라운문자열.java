import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BOJ_S3_1972_놀라운문자열 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String str = br.readLine();
			
			if(str.equals("*")) {
				break;
			}
			
			int N = str.length();
			
			boolean flag = true;
			
			for (int i = 1; i <= N-1; i++) {
				Set<String> set = new HashSet<>();
				for (int j = 0; j <= N-1-i; j++) {
					StringBuilder sb2 = new StringBuilder();
					sb2.append(str.charAt(j)).append(str.charAt(j+i));
					if(set.contains(sb2.toString())) {
						flag = false;
						break;
					} else {
						set.add(sb2.toString());
					}
					
				}
				
			}
			
			
			
			if(flag) {
				sb.append(str+" is surprising.\n");
			} else {
				sb.append(str+" is NOT surprising.\n");
			}
			
			
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}

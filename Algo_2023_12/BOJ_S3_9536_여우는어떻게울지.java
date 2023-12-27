import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BOJ_S3_9536_여우는어떻게울지 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			Set<String> set = new HashSet<>();
			String [] arr = br.readLine().split(" ");
			
			while(true) {
				String str = br.readLine();
				
				if(str.equals("what does the fox say?")) break;
				
				String [] sound = str.split(" ");
				
				set.add(sound[2]);
			}
			
			boolean check = false;
			
			for (int i = 0; i < arr.length; i++) {
				String str = arr[i];
				if(set.contains(str)) continue;
				
				sb.append(str+" ");
				check = true;
			}
			
			if(!check) continue;
			
			sb.setLength(sb.length()-1);
			sb.append("\n");

		}
		
		System.out.println(sb.toString());
		
	}

}

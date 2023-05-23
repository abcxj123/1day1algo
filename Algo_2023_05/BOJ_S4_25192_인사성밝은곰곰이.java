import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BOJ_S4_25192_인사성밝은곰곰이 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		Set<String> set = new HashSet<>();
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			if(str.equals("ENTER")) {
				set.clear();
			} else {
				if(!set.contains(str)) {
					cnt++;
					set.add(str);
				} 
			}
			
		}
		
		System.out.println(cnt);
	}

}

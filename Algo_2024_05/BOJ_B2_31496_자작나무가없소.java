import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B2_31496_자작나무가없소 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		String item = st.nextToken();
		int ans = 0;
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			String name = st.nextToken();
			int value = Integer.parseInt(st.nextToken());
			
			String [] arr = name.split("_");
			boolean check = false;
			for (int j = 0; j < arr.length; j++) {
				if(arr[j].equals(item)) {
					check = true;
					break;
				}
			}
			
			if(check) ans += value;
			
		}
		
		System.out.println(ans);
		
		
	}

}

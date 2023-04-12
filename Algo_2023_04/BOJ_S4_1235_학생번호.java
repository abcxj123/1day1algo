import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BOJ_S4_1235_학생번호 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<String> set;
		int N = Integer.parseInt(br.readLine());
		int min = 1;
		
		String [] arr = new String[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		
		int length = arr[0].length();
		
		for (int i = length-1; i >= 0; i--) {
			set = new HashSet<>();
			boolean flag = true;
			for (int j = 0; j < N; j++) {
				String tmp = arr[j].substring(i, length);
				if(set.contains(tmp)) {
					min++;
					flag = false;
					break;
				} else {
					set.add(tmp);
				}
			}
			if(flag) break;
		}
		
		System.out.println(min);
		
	}

}

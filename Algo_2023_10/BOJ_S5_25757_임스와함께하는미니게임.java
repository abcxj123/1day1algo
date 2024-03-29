import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_S5_25757_임스와함께하는미니게임 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		char c = st.nextToken().charAt(0);
		int M = -1;
		
		if(c == 'Y') {
			M = 1;
		} else if(c == 'F') {
			M = 2;
		} else if(c == 'O') {
			M = 3;
		}
		
		Set<String> set = new HashSet<>();
		
		for (int i = 0; i < N; i++) {
			set.add(br.readLine());
		}
		
		System.out.println(set.size()/M);
		
	}

}

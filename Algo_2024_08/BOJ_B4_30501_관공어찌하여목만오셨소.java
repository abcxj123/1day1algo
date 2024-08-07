import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B4_30501_관공어찌하여목만오셨소 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String ans = "";
		
		for (int i = 0; i < N; i++) {
			String name = br.readLine();
			if(name.contains("S")) {
				ans = name;
				break;
			}
		}
		
		System.out.println(ans);
		
	}

}

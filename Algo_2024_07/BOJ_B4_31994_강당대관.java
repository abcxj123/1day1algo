import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B4_31994_강당대관 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = -1;
		String str = "";
		
		for (int i = 0; i < 7; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
		
			String name = st.nextToken();
			int value = Integer.parseInt(st.nextToken());
			
			if(max < value) {
				max = value;
				str = name;
			}
		}
		
		System.out.println(str);
		
		
	}

}

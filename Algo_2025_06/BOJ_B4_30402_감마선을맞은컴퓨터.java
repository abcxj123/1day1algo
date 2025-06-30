import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B4_30402_감마선을맞은컴퓨터 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 15; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 15; j++) {
				char c = st.nextToken().charAt(0);
				
				if(c == 'w') {
					System.out.println("chunbae");
					System.exit(0);
				} else if(c == 'b') {
					System.out.println("nabi");
					System.exit(0);
				} else if(c == 'g') {
					System.out.println("yeongcheol");
					System.exit(0);
				}
			}
		}
		
		
	}

}

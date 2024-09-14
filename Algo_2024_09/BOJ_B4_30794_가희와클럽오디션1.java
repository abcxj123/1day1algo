import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B4_30794_가희와클럽오디션1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		String str = st.nextToken();
		
		switch (str) {
		case "miss":
			System.out.println(0);
			
			break;
		case "bad":
			System.out.println(200*N);
			
			break;
		case "cool":
			System.out.println(400*N);
			
			break;
		case "great":
			System.out.println(600*N);
			
			break;
		case "perfect":
			System.out.println(1000*N);
			
			break;

		default:
			break;
		}
		
		
	}

}

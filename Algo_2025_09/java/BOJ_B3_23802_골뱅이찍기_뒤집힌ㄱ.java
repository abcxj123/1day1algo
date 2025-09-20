import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B3_23802_골뱅이찍기_뒤집힌ㄱ {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5*N; j++) {
                sb.append('@');
            }
            sb.append('\n');
        }
        
        for (int i = 0; i < 4*N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append('@');
            }
            sb.append('\n');
        }
        
        System.out.println(sb.toString());

	}

}

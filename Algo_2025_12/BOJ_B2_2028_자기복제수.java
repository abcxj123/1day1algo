import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B2_2028_자기복제수 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        outer:
        	for (int t = 0; t < T; t++) {
                int N = Integer.parseInt(br.readLine());
                int nPow = N*N;
                
                while(N != 0) {
                    int a = N % 10;
                    int b = nPow % 10;
                    
                    if (a!=b) {
                        sb.append("NO\n");
                        continue outer;
                    }
                    
                    N /= 10;
                    nPow /= 10;
                }
                
                sb.append("YES\n");
                
            }
        
        System.out.print(sb.toString());
        
	}

}

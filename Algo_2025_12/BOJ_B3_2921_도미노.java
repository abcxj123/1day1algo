import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B3_2921_도미노 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        
        for (int i = 0; i <= N; i++) {
            for (int j = i; j <= N; j++) {
                sum += i;
                sum += j;
            }
        }
        
        System.out.println(sum);

	}

}

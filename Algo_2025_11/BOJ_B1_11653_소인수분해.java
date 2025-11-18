import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B1_11653_소인수분해 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        if(N == 1){
            return;
        }

        for(int i = 2; i <= N; i++){
            while(N%i == 0){
                N /= i;
                sb.append(i + "\n");
            }
        }
        
        System.out.println(sb.toString());
    }
}

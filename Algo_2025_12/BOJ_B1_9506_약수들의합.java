import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B1_9506_약수들의합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            int N = Integer.parseInt(br.readLine());

            if (N == -1) {
                break;
            }

            int [] arr = new int[N];

            int sum = 0;

            for (int i = 1; i <= N; i++) {
                if (N % i == 0 && i != N) {
                    arr[i] = i;
                    sum += i;
                }
            }

            if (sum != N) {
                sb.append(N + " is NOT perfect. \n");
                continue;
            }

            sb.append(N + " = 1");

            for(int i = 1; i <= N; i++){
                if(arr[i-1] != 0 && arr[i-1] != 1){
                    sb.append(" + " + arr[i-1]);
                }

            }
            
            sb.append("\n");

        }

        System.out.println(sb.toString());
        
    }

}

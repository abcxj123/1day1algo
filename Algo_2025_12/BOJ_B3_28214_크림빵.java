import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B3_28214_크림빵 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int [] bread = new int[N*K];
        int ans = N;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N * K; i++) {
            bread[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            int cnt = 0;

            for (int j = 0; j < K; j++) {
                if (bread[i*K + j] == 0){
                	cnt++;
                }
            }

            if (cnt >= P){
            	ans--;
            }
        }

        System.out.println(ans);
    }
}

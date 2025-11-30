import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B1_1934_최소공배수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            sb.append(A*B / getGCD(A, B)).append('\n');
        }
        
        System.out.println(sb.toString());
        
    }

    static int getGCD (int A, int B) {
        while (B != 0) {
            int R = A % B;
            A = B;
            B = R;
        }
        
        return A;
    }
}

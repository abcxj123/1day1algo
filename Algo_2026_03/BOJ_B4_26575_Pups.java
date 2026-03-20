import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B4_26575_Pups {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            Double d = Double.parseDouble(st.nextToken());
            Double f = Double.parseDouble(st.nextToken());
            Double p = Double.parseDouble(st.nextToken());
            System.out.printf("$%.2f\n", d*f*p);
        }
    }
}

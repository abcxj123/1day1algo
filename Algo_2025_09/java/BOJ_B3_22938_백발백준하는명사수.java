import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B3_22938_백발백준하는명사수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int r1 = Integer.parseInt(st.nextToken());
        
        if (1L*(x-x1)*(x-x1)+1L*(y-y1)*(y-y1) < 1L*(r+r1)*(r+r1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

	}

}

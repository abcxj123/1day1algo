import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B2_11575_Affine_Cipher {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            char [] arr = br.readLine().toCharArray();
            int l = arr.length;
            
            for(int i = 0; i < arr.length; i++) {
                int x = arr[i] - 'A';
                arr[i] = (char)(((a * x + b) % 26) + 'A');
            }
            
            String s = new String(arr);
            
            System.out.println(s);
        }
    }
}

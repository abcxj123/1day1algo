import java.io.*;
import java.util.*;

public class BOJ_B5_3003_체스 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int [] piece = {1, 1, 2, 2, 2, 8};
        
        for (int i = 0; i < piece.length; i++) {
            int n = Integer.parseInt(st.nextToken());
            sb.append(piece[i] - n + " ");
        }
        
        sb.setLength(sb.length()-1);
        System.out.print(sb.toString());
    }
}
